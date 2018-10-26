package com.edinarobotics.utils.gamepad;

import com.edinarobotics.utils.gamepad.gamepadfilters.XboxGamepadFilterSet;
import com.edinarobotics.utils.math.Vector2;

public class FilteredXboxGamepad extends XboxGamepad{
    private XboxGamepadFilterSet filters;

    public FilteredXboxGamepad(int port, XboxGamepadFilterSet filterSet){
        super(port);
        this.filters = filterSet;
    }
    public Vector2 getLeftJoystick() { return getGamepadAxisState().getLeftJoystick(); }
    public Vector2 getRightJoystick() { return getGamepadAxisState().getRightJoystick(); }

    public XboxGamepadAxisState getXboxGamepadAxisState() {
        double leftx = super.getLeftX();
        double lefty = super.getLeftY();
        double leftT = super.getLT();
        double rightx = super.getRightX();
        double righty = super.getRightY();
        double rightT = super.getRT();
        Vector2 left = new Vector2(leftx, lefty);
        Vector2 right = new Vector2(rightx, righty);
        XboxGamepadAxisState state = new XboxGamepadAxisState(left, right);
        return filters.filter(state);
    }

    public double getLeftX() { return getLeftJoystick().getX(); }
    public double getLeftY() { return getLeftJoystick().getY(); }
    public double getRightX() { return getRightJoystick().getX(); }
    public double getRightY() { return getRightJoystick().getY(); }
}
