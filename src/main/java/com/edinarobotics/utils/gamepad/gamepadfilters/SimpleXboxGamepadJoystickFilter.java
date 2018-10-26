package com.edinarobotics.utils.gamepad.gamepadfilters;

import com.edinarobotics.utils.gamepad.JoystickAxisState;
import com.edinarobotics.utils.gamepad.XboxGamepadAxisState;
import com.edinarobotics.utils.math.Vector2;

public abstract class SimpleXboxGamepadJoystickFilter implements XboxGamepadFilter, JoystickFilter{

    public XboxGamepadAxisState filter(XboxGamepadAxisState toFilter){
        double leftX = applyFilter(toFilter.getLeftJoystick().getX());
        double leftY = applyFilter(toFilter.getLeftJoystick().getY());
        double rightX = applyFilter(toFilter.getRightJoystick().getX());
        double rightY = applyFilter(toFilter.getRightJoystick().getY());
        Vector2 left = new Vector2(leftX, leftY);
        Vector2 right = new Vector2(rightX, rightY);
        return new XboxGamepadAxisState(left, right);
    }

    public JoystickAxisState filter(JoystickAxisState toFilter){
        double x = applyFilter(toFilter.getX());
        double y = applyFilter(toFilter.getY());
        double twist = applyFilter(toFilter.getTwist());
        double throttle = toFilter.getThrottle();
        Vector2 joystick = new Vector2(x, y);
        return new JoystickAxisState(joystick, twist, throttle);
    }

    protected abstract double applyFilter(double toFilter);
}
