package frc.team1816.robot;

import com.edinarobotics.utils.gamepad.FilteredXboxGamepad;
import com.edinarobotics.utils.gamepad.XboxGamepad;
import com.edinarobotics.utils.gamepad.gamepadfilters.XboxDeadzoneFilter;
import com.edinarobotics.utils.gamepad.gamepadfilters.XboxPowerFilter;
import com.edinarobotics.utils.gamepad.gamepadfilters.XboxGamepadFilter;
import com.edinarobotics.utils.gamepad.gamepadfilters.XboxGamepadFilterSet;


import java.util.List;
import java.util.ArrayList;

public class Controls {
    private static Controls instance;

    public XboxGamepad xboxGamepadDriver;

    private Controls() {
        List<XboxGamepadFilter> xboxGamepadFilters =  new ArrayList<>();
        xboxGamepadFilters.add(new XboxDeadzoneFilter(0.05));
        xboxGamepadFilters.add(new XboxPowerFilter(2));
        XboxGamepadFilterSet xboxGamepadDriverFilterSet = new XboxGamepadFilterSet((xboxGamepadFilters));

        xboxGamepadDriver = new FilteredXboxGamepad(0, xboxGamepadDriverFilterSet);
    }

    public static Controls getInstance(){
        if (instance == null){
            instance = new Controls();
        }
        return instance;
    }

    public double getDriveSpeed() { return xboxGamepadDriver.getLeftY();}
    public double getTurnSpeed() { return xboxGamepadDriver.getRightX();}

}
