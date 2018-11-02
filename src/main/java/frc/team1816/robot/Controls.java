package frc.team1816.robot;

import com.edinarobotics.utils.gamepad.XboxGamepad;
import com.edinarobotics.utils.gamepad.gamepadfilters.DeadzoneFilter;
import com.edinarobotics.utils.gamepad.gamepadfilters.GamepadFilter;
import com.edinarobotics.utils.gamepad.gamepadfilters.GamepadFilterSet;
import com.edinarobotics.utils.gamepad.gamepadfilters.PowerFilter;

import java.util.ArrayList;
import java.util.List;

public class Controls {
    private static Controls instance;

    public XboxGamepad xboxGamepadDriver;

    private Controls() {
        xboxGamepadDriver = new XboxGamepad(0);
        GamepadFilterSet filterSet = xboxGamepadDriver.filtered.getFilters();
        filterSet.add(new DeadzoneFilter(0.05));
        filterSet.add(new PowerFilter(2));
    }

    public static Controls getInstance() {
        if (instance == null){
            instance = new Controls();
        }
        return instance;
    }

    public double getDriveSpeed() { return xboxGamepadDriver.getLeftY();}
    public double getTurnSpeed() { return xboxGamepadDriver.getRightX();}

}
