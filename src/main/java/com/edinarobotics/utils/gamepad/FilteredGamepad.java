package com.edinarobotics.utils.gamepad;

import com.edinarobotics.utils.gamepad.gamepadfilters.GamepadFilterSet;
import com.edinarobotics.utils.math.Vector2;

public class FilteredGamepad implements TwoJoystickSet {
    private final GamepadBase gamepad;
    private GamepadFilterSet filters;

    public FilteredGamepad(GamepadBase gamepad, GamepadFilterSet filters) {
        this.gamepad = gamepad;
        this.filters = filters;
    }

    public FilteredGamepad(GamepadBase gamepad) {
        this(gamepad, new GamepadFilterSet());
    }

    /**
     * Returns the state of the gamepad's inputDevices together in a
     * GamepadAxisState with all filters contained in the FilterSet applied.
     *
     * @return An filtered GamepadAxisState object containing the states of all
     * the inputDevice axes on this Gamepad.
     */
    @Override
    public GamepadAxisState getGamepadAxisState() {
        return filters.filter(gamepad.getGamepadAxisState());
    }

    @Override
    public Vector2 getLeftJoystick() {
        return getGamepadAxisState().getLeftJoystick();
    }

    @Override
    public Vector2 getRightJoystick() {
        return getGamepadAxisState().getRightJoystick();
    }

    /**
     * Returns the current value of the x-axis of the left joystick. <br/>
     * A value of {@code -1} indicates that the joystick is fully left.<br/>
     * A value of {@code 1} indicates that the joystick is fully right.
     *
     * @return The current value of the x-axis of the left joystick after
     * being sent through the given GamepadFilterSet.
     */
    @Override
    public double getLeftX() {
        return getLeftJoystick().getX();
    }

    /**
     * Returns the current value of the y-axis of the left joystick. <br/>
     * A value of {@code -1} indicates that the joystick is fully down.<br/>
     * A value of {@code 1} indicates that the joystick is fully up.
     *
     * @return The current value of the y-axis of the left joystick after
     * being sent through the given GamepadFilterSet.
     */
    @Override
    public double getLeftY() {
        return getLeftJoystick().getY();
    }

    /**
     * Returns the current value of the x-axis of the right joystick. <br/>
     * A value of {@code -1} indicates that the joystick is fully left.<br/>
     * A value of {@code 1} indicates that the joystick is fully right.
     *
     * @return The current value of the x-axis of the right joystick after
     * being sent through the given GamepadFilterSet.
     */
    @Override
    public double getRightX() {
        return getRightJoystick().getX();
    }

    /**
     * Returns the current value of the y-axis of the right joystick. <br/>
     * A value of {@code -1} indicates that the joystick is fully down.<br/>
     * A value of {@code 1} indicates that the joystick is fully up.
     *
     * @return The current value of the y-axis of the right joystick after
     * being sent through the given GamepadFilterSet.
     */
    @Override
    public double getRightY() {
        return getRightJoystick().getY();
    }

    public double getLT() {
        if (getGamepadAxisState() instanceof XboxGamepadAxisState) {
            XboxGamepadAxisState xboxGamepadAxisState = (XboxGamepadAxisState) getGamepadAxisState();
            return xboxGamepadAxisState.getLeftTrigger();
        }
        return 0;
    }

    public double getRT() {
        if (getGamepadAxisState() instanceof XboxGamepadAxisState) {
            XboxGamepadAxisState xboxGamepadAxisState = (XboxGamepadAxisState) getGamepadAxisState();
            return xboxGamepadAxisState.getRightTrigger();
        }
        return 0;
    }

    public GamepadFilterSet getFilters() {
        return filters;
    }

    public void setFilters(GamepadFilterSet filters) {
        this.filters = filters;
    }
}
