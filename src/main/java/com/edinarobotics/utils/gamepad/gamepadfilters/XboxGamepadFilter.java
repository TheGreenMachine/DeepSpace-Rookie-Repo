package com.edinarobotics.utils.gamepad.gamepadfilters;

import com.edinarobotics.utils.gamepad.XboxGamepadAxisState;

public interface XboxGamepadFilter {

    public XboxGamepadAxisState filter(XboxGamepadAxisState toFilter);
}
