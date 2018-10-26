package com.edinarobotics.utils.gamepad;

import com.edinarobotics.utils.math.Vector2;

public class XboxGamepadAxisState {
    private Vector2 left, right;
    public XboxGamepadAxisState(Vector2 left, Vector2 right){
        this.left = left;
        this.right = right;
    }
    public Vector2 getLeftJoystick() { return left; }
    public Vector2 getRightJoystick() { return right; }
    public double getLeftMagnitude() { return getLeftJoystick().magnitude();}
    public double getRightMagnitude() { return getRightJoystick().magnitude();}
    public double getLeftDirection() { return Math.toDegrees(Math.atan2(left.getX(), left.getY())); }
    public double getRightDirection() { return Math.toDegrees(Math.atan2(right.getX(), right.getY())); }
}
