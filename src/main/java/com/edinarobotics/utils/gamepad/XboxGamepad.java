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

        //TODO: Implement dPad and triggers
    }
}
