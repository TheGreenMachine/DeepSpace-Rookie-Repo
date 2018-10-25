package com.edinarobotics.utils.gamepad;

import com.sun.xml.internal.bind.v2.TODO;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class XboxGamepad {
    private Joystick joystick;
    private Button leftBumper, rightBumper;
    //private Button leftTrigger, rightTrigger;
    private Button buttonA, buttonB, buttonX, buttonY;
    private Button buttonSelect, buttonStart;
    private Button leftJoystickButton, rightJoystickButton;
    private Button dPadLeft, dPadDown, dPadRight, dPadUp;

    /**
     * Right stick horizontal axis - 5th
     * Right stick vertical axis - 4th
     *
     * Left stick horizontal axis - X
     * Left stick vertical axis - Y
     *
     * dPadUP/dPadDOWN axis - 7th
     * dPadLEFT/dPadRIGHT axis - 6th
     *
     * LT axis - 9th
     * RT axis - 10th
     */
    public XboxGamepad(int port){
        joystick = new Joystick(port);

        leftBumper = new JoystickButton(joystick, 4);
        rightBumper = new JoystickButton(joystick, 5);

        buttonA = new JoystickButton(joystick, 0);
        buttonB = new JoystickButton(joystick, 1);
        buttonX = new JoystickButton(joystick, 2);
        buttonY = new JoystickButton(joystick, 3);

        buttonSelect = new JoystickButton(joystick, 6);
        buttonStart = new JoystickButton(joystick, 7);

        //TODO: Implement dPad and shoulder trigger objects
    }
    /**
     * Returns the current value of the x-axis of the left joystick. <br/>
     * A value of {@code -1} indicates that the joystick is fully left.<br/>
     * A value of {@code 1} indicates that the joystick is fully right.
     * @return The current value of the x-axis of the left joystick.
     */
    public double getLeftX(){ return joystick.getRawAxis(0);}

    /**
     * Returns the current value of the y-axis of the left joystick. <br/>
     * A value of {@code -1} indicates that the joystick is fully down.<br/>
     * A value of {@code 1} indicates that the joystick is fully up.
     * @return The current value of the y-axis of the left joystick.
     */
    public double getLeftY(){ return joystick.getRawAxis(1);}

    /**
     * Returns the current value of the x-axis of the right joystick. <br/>
     * A value of {@code -1} indicates that the joystick is fully left.<br/>
     * A value of {@code 1} indicates that the joystick is fully right.
     * @return The current value of the x-axis of the right joystick.
     */
    public double getRightX(){ return joystick.getRawAxis(5); }

    /**
     * Returns the current value of the y-axis of the right joystick. <br/>
     * A value of {@code -1} indicates that the joystick is fully down.<br/>
     * A value of {@code 1} indicates that the joystick is fully up.
     * @return The current value of the y-axis of the right joystick.
     */
    public double getRightY(){ return joystick.getRawAxis(4); }


}
