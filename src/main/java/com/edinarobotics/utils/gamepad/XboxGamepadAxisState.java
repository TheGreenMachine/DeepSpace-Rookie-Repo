package com.edinarobotics.utils.gamepad;

import com.edinarobotics.utils.math.Vector2;

public class XboxGamepadAxisState extends GamepadAxisState {
    private double leftTrigger, rightTrigger;

    public XboxGamepadAxisState(
            Vector2 left, Vector2 right,
            double leftTrigger, double rightTrigger
    ) {
        super(left, right);
        this.leftTrigger = leftTrigger;
        this.rightTrigger = rightTrigger;
    }

    /**
     * Returns the raw axis value of the left analog trigger.
     * @return The degree to which the left analog trigger is depressed
     *         in the range [0.0, 1.0], where 0.0 represents the neutral state
     */
    public double getLeftTrigger() {
        return leftTrigger;
    }

    /**
     * Returns the raw axis value of the right analog trigger.
     * @return The degree to which the right analog trigger is depressed
     *         in the range [0.0, 1.0], where 0.0 represents the neutral state
     */
    public double getRightTrigger() {
        return rightTrigger;
    }
}
