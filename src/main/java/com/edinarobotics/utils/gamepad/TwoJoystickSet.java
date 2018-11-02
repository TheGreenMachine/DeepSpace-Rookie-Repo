package com.edinarobotics.utils.gamepad;

import com.edinarobotics.utils.math.Vector2;

public interface TwoJoystickSet {

    /**
     * Returns the state of the gamepad's joystick together in a
     * GamepadAxisState.
     *
     * @return A GamepadAxisState object containing the states of all the
     * joystick axes on this Gamepad.
     */
    GamepadAxisState getGamepadAxisState();

    /**
     * Returns the state of the left joystick as a Vector2.
     * This vector 2 contains the state of the x- and y- axis of the joystick.
     *
     * @return A Vector2 representing the state of the left joystick.
     */
    Vector2 getLeftJoystick();

    /**
     * Returns the state of the right joystick as a Vector2.
     * This vector 2 contains the state of the x- and y- axis of the joystick.
     *
     * @return A Vector2 representing the state of the right joystick.
     */
    Vector2 getRightJoystick();

    /**
     * Returns the current value of the x-axis of the left joystick. <br/>
     * A value of {@code -1} indicates that the joystick is fully left.<br/>
     * A value of {@code 1} indicates that the joystick is fully right.
     *
     * @return The current value of the x-axis of the left joystick.
     */
    double getLeftX();

    /**
     * Returns the current value of the y-axis of the left joystick. <br/>
     * A value of {@code -1} indicates that the joystick is fully down.<br/>
     * A value of {@code 1} indicates that the joystick is fully up.
     *
     * @return The current value of the y-axis of the left joystick.
     */
    double getLeftY();

    /**
     * Returns the current value of the x-axis of the right joystick. <br/>
     * A value of {@code -1} indicates that the joystick is fully left.<br/>
     * A value of {@code 1} indicates that the joystick is fully right.
     *
     * @return The current value of the x-axis of the right joystick.
     */
    double getRightX();

    /**
     * Returns the current value of the y-axis of the right joystick. <br/>
     * A value of {@code -1} indicates that the joystick is fully down.<br/>
     * A value of {@code 1} indicates that the joystick is fully up.
     *
     * @return The current value of the y-axis of the right joystick.
     */
    double getRightY();
}
