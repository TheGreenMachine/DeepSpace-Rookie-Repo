package com.edinarobotics.utils.gamepad.gamepadfilters;

public class XboxDeadzoneFilter extends SimpleXboxGamepadJoystickFilter {
    private final double radius;

    public XboxDeadzoneFilter (double radius){ this.radius = radius; }

    protected double applyFilter(double value){
        if(Math.abs(value) < radius){
            return 0.0;
        }
        return value;
    }
}
