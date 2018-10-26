package com.edinarobotics.utils.gamepad.gamepadfilters;

import java.util.List;
import com.edinarobotics.utils.gamepad.XboxGamepadAxisState;

public class XboxGamepadFilterSet implements XboxGamepadFilter{
    private List<XboxGamepadFilter> filters;

    public XboxGamepadFilterSet(List<XboxGamepadFilter> filters) { this.filters = filters; }

    public XboxGamepadAxisState filter(XboxGamepadAxisState toFilter){
        XboxGamepadAxisState current = toFilter;

        for (XboxGamepadFilter filter : filters){
            current = filter.filter(current);
        }
        return current;
    }

}
