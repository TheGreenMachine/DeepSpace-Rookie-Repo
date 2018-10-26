package com.edinarobotics.utils.gamepad;

import com.edinarobotics.utils.gamepad.buttons.XboxDPadButton;
import com.edinarobotics.utils.math.Vector2;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class XboxGamepad {

    private XboxController xboxController;
    private Button leftBumper, rightBumper;
    private Button buttonA, buttonB, buttonX, buttonY;
    private Button buttonSelect, buttonStart;
    private Button leftJoystickButton, rightJoystickButton;
    private Button dPadLeft, dPadDown, dPadRight, dPadUp;

    /**
     * Right stick horizontal axis - 5th
     * Right stick vertical axis - 4th
     *
     * Left stick horizontal axis - X (1?)
     * Left stick vertical axis - Y (0?)
     *
     * dPadUP/dPadDOWN axis - 7th
     * dPadLEFT/dPadRIGHT axis - 6th
     *
     * LT axis - 9th
     * RT axis - 10th
     */
    public XboxGamepad(int port) {
        xboxController = new XboxController(port);

        leftBumper = new JoystickButton(xboxController, 4);
        rightBumper = new JoystickButton(xboxController, 5);

        buttonA = new JoystickButton(xboxController, 0);
        buttonB = new JoystickButton(xboxController, 1);
        buttonX = new JoystickButton(xboxController, 2);
        buttonY = new JoystickButton(xboxController, 3);

        buttonSelect = new JoystickButton(xboxController, 6);
        buttonStart = new JoystickButton(xboxController, 7);

        leftJoystickButton = new JoystickButton(xboxController, 8);
        rightJoystickButton = new JoystickButton(xboxController, 9);

        dPadLeft = new XboxDPadButton(this, XboxDPadButton.XboxDPadButtonType.LEFT);
        dPadRight = new XboxDPadButton(this, XboxDPadButton.XboxDPadButtonType.RIGHT);
        dPadUp = new XboxDPadButton(this, XboxDPadButton.XboxDPadButtonType.UP);
        dPadDown = new XboxDPadButton(this, XboxDPadButton.XboxDPadButtonType.DOWN);

    }
    /**
     * Returns a Button object representing the left bumper of the gamepad. <br/>
     * The bumper is the button that is on the front face of the gamepad
     * above the trigger.
     * @return A Button object for the left bumper.
     */
    public Button leftBumper(){
        return leftBumper;
    }

    /**
     * Returns a Button object representing the right bumper of the gamepad. <br/>
     * The bumper is the button that is on the front face of the gamepad
     * above the trigger.
     * @return A Button object for the right bumper.
     */
    public Button rightBumper(){
        return rightBumper;
    }

    /**
     * Returns a Button object for the left button in the diamond group of
     * buttons on the gamepad. <br/>
     * The diamond group of buttons is the set of four buttons on the right
     * side of the gamepad either labeled 1,2,3,4 or X,Y,B,A.
     * @return A Button object for the left diamond button.
     */
    public Button buttonX() { return buttonX; }

    /**
     * Returns a Button object for the down button in the diamond group of
     * buttons on the gamepad. <br/>
     * The diamond group of buttons is the set of four buttons on the right
     * side of the gamepad either labeled 1,2,3,4 or X,Y,B,A.
     * @return A Button object for the down diamond button.
     */
    public Button buttonA(){
        return buttonA;
    }

    /**
     * Returns a Button object for the right button in the diamond group of
     * buttons on the gamepad. <br/>
     * The diamond group of buttons is the set of four buttons on the right
     * side of the gamepad either labeled 1,2,3,4 or X,Y,B,A.
     * @return A Button object for the right diamond button.
     */
    public Button buttonB(){
        return buttonB;
    }

    /**
     * Returns a Button object for the up button in the diamond group of
     * buttons on the gamepad. <br/>
     * The diamond group of buttons is the set of four buttons on the right
     * side of the gamepad either labeled 1,2,3,4 or X,Y,B,A.
     * @return A Button object for the up diamond button.
     */
    public Button buttonY(){
        return buttonY;
    }

    /**
     * Returns a Button object for the left button in the center of the gamepad. <br/>
     * This button is often labeled "back."
     * @return A Button object for the left button in the center of the gamepad.
     */
    public Button buttonSelect(){
        return buttonSelect;
    }

    /**
     * Returns a Button object for the right button in the center of the gamepad. <br/>
     * This button is often labeled "start."
     * @return A Button object for the right button in the center of the gamepad.
     */
    public Button buttonStart(){
        return buttonStart;
    }

    /**
     * Returns a Button object representing a press of the left xboxController. <br/>
     * This button is bound to the left xboxController being pressed straight down.
     * @return A Button object representing a press of the left xboxController.
     */
    public Button leftJoystickButton(){
        return leftJoystickButton;
    }

    /**
     * Returns a Button object representing a press of the right xboxController. <br/>
     * This button is bound to the right xboxController being pressed straight down.
     * @return A Button object representing a press of the right xboxController.
     */
    public Button rightJoystickButton(){
        return rightJoystickButton;
    }

    /**
     * Returns a Button object representing the d-pad being pressed left.
     * @return A Button object representing the d-pad being pressed left.
     */
    public Button dPadLeft(){
        return dPadLeft;
    }

    /**
     * Returns a Button object representing the d-pad being pressed down.
     * @return A Button object representing the d-pad being pressed down.
     */
    public Button dPadDown(){
        return dPadDown;
    }

    /**
     * Returns a Button object representing the d-pad being pressed right.
     * @return A Button object representing the d-pad being pressed right.
     */
    public Button dPadRight(){
        return dPadRight;
    }

    /**
     * Returns a Button object representing the d-pad being pressed up.
     * @return A Button object representing the d-pad being pressed up.
     */
    public Button dPadUp(){
        return dPadUp;
    }

    /**
     * Returns the current value of the x-axis of the left xboxController. <br/>
     * A value of {@code -1} indicates that the xboxController is fully left.<br/>
     * A value of {@code 1} indicates that the xboxController is fully right.
     * @return The current value of the x-axis of the left xboxController.
     */
    public double getLeftX(){ return xboxController.getRawAxis(0);}

    /**
     * Returns the current value of the y-axis of the left xboxController. <br/>
     * A value of {@code -1} indicates that the xboxController is fully down.<br/>
     * A value of {@code 1} indicates that the xboxController is fully up.
     * @return The current value of the y-axis of the left xboxController.
     */
    public double getLeftY(){ return -xboxController.getRawAxis(1);}

    /**
     * Returns the current value of the x-axis of the right xboxController. <br/>
     * A value of {@code -1} indicates that the xboxController is fully left.<br/>
     * A value of {@code 1} indicates that the xboxController is fully right.
     * @return The current value of the x-axis of the right xboxController.
     */
    public double getRightX(){ return xboxController.getRawAxis(4); }

    /**
     * Returns the current value of the y-axis of the right xboxController. <br/>
     * A value of {@code -1} indicates that the xboxController is fully down.<br/>
     * A value of {@code 1} indicates that the xboxController is fully up.
     * @return The current value of the y-axis of the right xboxController.
     */
    public double getRightY(){ return -xboxController.getRawAxis(5); }

    public double getRT(){ return xboxController.getRawAxis(3); }

    public double getLT() { return xboxController.getRawAxis(2);}

    /**
     * Returns the state of the left xboxController as a Vector2.
     * This vector 2 contains the state of the x- and y- axis of the xboxController.
     * @return A Vector2 representing the state of the left xboxController.
     */
    public Vector2 getLeftJoystick(){
        return new Vector2(getLeftX(), getLeftY());
    }

    /**
     * Returns the state of the right xboxController as a Vector2.
     * This vector 2 contains the state of the x- and y- axis of the xboxController.
     * @return A Vector2 representing the state of the right xboxController.
     */
    public Vector2 getRightJoystick(){
        return new Vector2(getRightX(), getRightY());
    }

    /**
     * Returns the state of the gamepad's xboxControllers together in a
     * GamepadAxisState.
     * @return A GamepadAxisState object containing the states of all the
     * xboxController axes on this Gamepad.
     */
    public GamepadAxisState getGamepadAxisState(){
        Vector2 left = new Vector2(getLeftX(), getLeftY());
        Vector2 right = new Vector2(getRightX(), getRightY());
        return new GamepadAxisState(left, right);
    }

    public int getXboxDPadY() {
        int povValue = xboxController.getPOV();

        if (povValue == 0 || povValue == 45 || povValue == 315){
            return 1;
        } else if (povValue == 90 || povValue == 270 || povValue == -1){
            return 0;
        } else {
            return -1;
        }
    }

    public int getXboxDPadX() {
        int povValue = xboxController.getPOV();

        if (povValue == 0 || povValue == 180 || povValue == -1){
            return 0;
        } else if (povValue == 270 || povValue == 315 || povValue == 225){
            return -1;
        } else {
            return 1;
        }
    }
}
