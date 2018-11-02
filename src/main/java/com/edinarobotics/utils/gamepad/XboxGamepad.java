package com.edinarobotics.utils.gamepad;

import com.edinarobotics.utils.gamepad.buttons.AnalogButton;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * A gamepad driver class for use with Xbox One controllers.
 */
public class XboxGamepad extends GamepadBase {

    /**
     * Right stick horizontal axis - 5th
     * Right stick vertical axis - 4th
     * <p>
     * Left stick horizontal axis - X (1?)
     * Left stick vertical axis - Y (0?)
     * <p>
     * dPadUP/dPadDOWN axis - 7th
     * dPadLEFT/dPadRIGHT axis - 6th
     * <p>
     * LT axis - 9th
     * RT axis - 10th
     */
    public XboxGamepad(int port) {
        super();
        inputDevice = new XboxController(port);

        leftBumper = new JoystickButton(inputDevice, 4);
        rightBumper = new JoystickButton(inputDevice, 5);

        buttonA = new JoystickButton(inputDevice, 0);
        buttonB = new JoystickButton(inputDevice, 1);
        buttonX = new JoystickButton(inputDevice, 2);
        buttonY = new JoystickButton(inputDevice, 3);

        buttonSelect = new JoystickButton(inputDevice, 6);
        buttonStart = new JoystickButton(inputDevice, 7);

        leftJoystickButton = new JoystickButton(inputDevice, 8);
        rightJoystickButton = new JoystickButton(inputDevice, 9);

        leftTrigger = new AnalogButton(inputDevice, 2);
        rightTrigger = new AnalogButton(inputDevice, 3);
    }

    @Override
    public double getLeftX() {
        return inputDevice.getRawAxis(0);
    }

    @Override
    public double getLeftY() {
        return -inputDevice.getRawAxis(1);
    }

    @Override
    public double getRightX() {
        return inputDevice.getRawAxis(4);
    }

    @Override
    public double getRightY() {
        return -inputDevice.getRawAxis(5);
    }

    public double getRT() {
        return inputDevice.getRawAxis(3);
    }

    public double getLT() {
        return inputDevice.getRawAxis(2);
    }

    @Override
    public GamepadAxisState getGamepadAxisState() {
        return new XboxGamepadAxisState(
                getLeftJoystick(), getRightJoystick(),
                getLT(), getRT()
        );
    }
}
