package com.edinarobotics.utils.gamepad;

import com.edinarobotics.utils.gamepad.buttons.DPadButton;
import com.edinarobotics.utils.math.Vector2;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * A base class defining available behavior and
 * functionality for all gamepads.
 *
 * @since 2018-11-1
 */
public abstract class GamepadBase {
    protected GenericHID inputDevice;
    protected Button leftBumper, rightBumper;
    protected Button buttonA, buttonB, buttonX, buttonY;
    protected Button buttonSelect, buttonStart;
    protected Button leftJoystickButton, rightJoystickButton;
    protected Button dPadLeft, dPadDown, dPadRight, dPadUp;
    protected Button leftTrigger, rightTrigger;

    protected GamepadBase() {
        dPadLeft = new DPadButton(this, DPadButton.DPadButtonType.LEFT);
        dPadRight = new DPadButton(this, DPadButton.DPadButtonType.RIGHT);
        dPadUp = new DPadButton(this, DPadButton.DPadButtonType.UP);
        dPadDown = new DPadButton(this, DPadButton.DPadButtonType.DOWN);
    }

    /**
     * Returns the current value of the x-axis of the left inputDevice. <br/>
     * A value of {@code -1} indicates that the inputDevice is fully left.<br/>
     * A value of {@code 1} indicates that the inputDevice is fully right.
     *
     * @return The current value of the x-axis of the left inputDevice.
     */
    protected abstract double getLeftX();

    /**
     * Returns the current value of the y-axis of the left inputDevice. <br/>
     * A value of {@code -1} indicates that the inputDevice is fully down.<br/>
     * A value of {@code 1} indicates that the inputDevice is fully up.
     *
     * @return The current value of the y-axis of the left inputDevice.
     */
    protected abstract double getLeftY();

    /**
     * Returns the current value of the x-axis of the right inputDevice. <br/>
     * A value of {@code -1} indicates that the inputDevice is fully left.<br/>
     * A value of {@code 1} indicates that the inputDevice is fully right.
     *
     * @return The current value of the x-axis of the right inputDevice.
     */
    protected abstract double getRightX();

    /**
     * Returns the current value of the y-axis of the right inputDevice. <br/>
     * A value of {@code -1} indicates that the inputDevice is fully down.<br/>
     * A value of {@code 1} indicates that the inputDevice is fully up.
     *
     * @return The current value of the y-axis of the right inputDevice.
     */
    protected abstract double getRightY();

    /**
     * Returns a Button object representing the left bumper of the gamepad. <br/>
     * The bumper is the button that is on the front face of the gamepad
     * above the trigger.
     *
     * @return A Button object for the left bumper.
     */
    public Button leftBumper() {
        return leftBumper;
    }

    /**
     * Returns a Button object representing the right bumper of the gamepad. <br/>
     * The bumper is the button that is on the front face of the gamepad
     * above the trigger.
     *
     * @return A Button object for the right bumper.
     */
    public Button rightBumper() {
        return rightBumper;
    }

    /**
     * Returns a Button object for the left button in the diamond group of
     * buttons on the gamepad. <br/>
     * The diamond group of buttons is the set of four buttons on the right
     * side of the gamepad either labeled 1,2,3,4 or X,Y,B,A.
     *
     * @return A Button object for the left diamond button.
     */
    public Button buttonX() {
        return buttonX;
    }

    /**
     * Returns a Button object for the down button in the diamond group of
     * buttons on the gamepad. <br/>
     * The diamond group of buttons is the set of four buttons on the right
     * side of the gamepad either labeled 1,2,3,4 or X,Y,B,A.
     *
     * @return A Button object for the down diamond button.
     */
    public Button buttonA() {
        return buttonA;
    }

    /**
     * Returns a Button object for the right button in the diamond group of
     * buttons on the gamepad. <br/>
     * The diamond group of buttons is the set of four buttons on the right
     * side of the gamepad either labeled 1,2,3,4 or X,Y,B,A.
     *
     * @return A Button object for the right diamond button.
     */
    public Button buttonB() {
        return buttonB;
    }

    /**
     * Returns a Button object for the up button in the diamond group of
     * buttons on the gamepad. <br/>
     * The diamond group of buttons is the set of four buttons on the right
     * side of the gamepad either labeled 1,2,3,4 or X,Y,B,A.
     *
     * @return A Button object for the up diamond button.
     */
    public Button buttonY() {
        return buttonY;
    }

    /**
     * Returns a Button object for the left button in the center of the gamepad. <br/>
     * This button is often labeled "back."
     *
     * @return A Button object for the left button in the center of the gamepad.
     */
    public Button buttonSelect() {
        return buttonSelect;
    }

    /**
     * Returns a Button object for the right button in the center of the gamepad. <br/>
     * This button is often labeled "start."
     *
     * @return A Button object for the right button in the center of the gamepad.
     */
    public Button buttonStart() {
        return buttonStart;
    }

    /**
     * Returns a Button object representing a press of the left xboxController. <br/>
     * This button is bound to the left xboxController being pressed straight down.
     *
     * @return A Button object representing a press of the left xboxController.
     */
    public Button leftJoystickButton() {
        return leftJoystickButton;
    }

    /**
     * Returns a Button object representing a press of the right xboxController. <br/>
     * This button is bound to the right xboxController being pressed straight down.
     *
     * @return A Button object representing a press of the right xboxController.
     */
    public Button rightJoystickButton() {
        return rightJoystickButton;
    }

    /**
     * Returns a Button object representing the d-pad being pressed left.
     *
     * @return A Button object representing the d-pad being pressed left.
     */
    public Button dPadLeft() {
        return dPadLeft;
    }

    /**
     * Returns a Button object representing the d-pad being pressed down.
     *
     * @return A Button object representing the d-pad being pressed down.
     */
    public Button dPadDown() {
        return dPadDown;
    }

    /**
     * Returns a Button object representing the d-pad being pressed right.
     *
     * @return A Button object representing the d-pad being pressed right.
     */
    public Button dPadRight() {
        return dPadRight;
    }

    /**
     * Returns a Button object representing the d-pad being pressed up.
     *
     * @return A Button object representing the d-pad being pressed up.
     */
    public Button dPadUp() {
        return dPadUp;
    }

    /**
     * Returns a Button object representing the left trigger of the gamepad. <br/>
     * The trigger is the larger button on the bottom of the front face of
     * the gamepad.
     *
     * @return A Button object for the left trigger.
     */
    public Button leftTrigger() {
        return leftTrigger;
    }

    /**
     * Returns a Button object representing the right trigger of the gamepad. <br/>
     * The trigger is the larger button on the bottom of the front face of
     * the gamepad.
     *
     * @return A Button object for the right trigger.
     */
    public Button rightTrigger() {
        return rightTrigger;
    }

    /**
     * Returns the state of the left inputDevice as a Vector2.
     * This vector 2 contains the state of the x- and y- axis of the inputDevice.
     *
     * @return A Vector2 representing the state of the left inputDevice.
     */
    public Vector2 getLeftJoystick() {
        return new Vector2(getLeftX(), getLeftY());
    }

    /**
     * Returns the state of the right inputDevice as a Vector2.
     * This vector 2 contains the state of the x- and y- axis of the inputDevice.
     *
     * @return A Vector2 representing the state of the right inputDevice.
     */
    public Vector2 getRightJoystick() {
        return new Vector2(getRightX(), getRightY());
    }

    /**
     * Returns the state of the gamepad's inputDevices together in a
     * GamepadAxisState.
     *
     * @return A GamepadAxisState object containing the states of all the
     * inputDevice axes on this Gamepad.
     */
    public GamepadAxisState getGamepadAxisState() {
        Vector2 left = new Vector2(getLeftX(), getLeftY());
        Vector2 right = new Vector2(getRightX(), getRightY());
        return new GamepadAxisState(left, right);
    }

    public int getDPadY() {
        int povValue = inputDevice.getPOV();

        if (povValue == 0 || povValue == 45 || povValue == 315) {
            return 1;
        } else if (povValue == 90 || povValue == 270 || povValue == -1) {
            return 0;
        } else {
            return -1;
        }
    }

    public int getDPadX() {
        int povValue = inputDevice.getPOV();

        if (povValue == 0 || povValue == 180 || povValue == -1) {
            return 0;
        } else if (povValue == 270 || povValue == 315 || povValue == 225) {
            return -1;
        } else {
            return 1;
        }
    }
}
