package com.edinarobotics.utils.gamepad;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * A gamepad driver class for use with Logitech F310 controllers.
 */
public class F310Gamepad extends GamepadBase {

    public F310Gamepad(int port) {
        super(new Joystick(port));

        leftBumper = new JoystickButton(inputDevice, 5);
        rightBumper = new JoystickButton(inputDevice, 6);

        buttonA = new JoystickButton(inputDevice, 2);
        buttonB = new JoystickButton(inputDevice, 3);
        buttonX = new JoystickButton(inputDevice, 1);
        buttonY = new JoystickButton(inputDevice, 4);

        buttonSelect = new JoystickButton(inputDevice, 9);
        buttonStart = new JoystickButton(inputDevice, 10);

        leftJoystickButton = new JoystickButton(inputDevice, 11);
        rightJoystickButton = new JoystickButton(inputDevice, 12);

        leftTrigger = new JoystickButton(inputDevice, 7);
        rightTrigger = new JoystickButton(inputDevice, 8);
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
        return inputDevice.getRawAxis(2);
    }

    @Override
    public double getRightY() {
        return -inputDevice.getRawAxis(3);
    }
}
