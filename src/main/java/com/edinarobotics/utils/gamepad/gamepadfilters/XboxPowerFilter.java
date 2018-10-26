package com.edinarobotics.utils.gamepad.gamepadfilters;

import com.edinarobotics.utils.math.Math1816;

public class XboxPowerFilter extends SimpleXboxGamepadJoystickFilter {
    private final int power;

    public XboxPowerFilter(int power){ this.power = power; }

    @Override
    protected double applyFilter(double value) {
        return Math1816.signum(value)*Math.abs(Math.pow(value, this.power));
    }
}
