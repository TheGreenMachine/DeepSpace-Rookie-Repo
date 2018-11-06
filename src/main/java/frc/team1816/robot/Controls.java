package frc.team1816.robot;

import com.edinarobotics.utils.gamepad.Joystick;
import com.edinarobotics.utils.gamepad.gamepadfilters.GamepadFilter;
import com.edinarobotics.utils.gamepad.gamepadfilters.DeadzoneFilter;
import com.edinarobotics.utils.gamepad.gamepadfilters.PowerFilter;
import com.edinarobotics.utils.gamepad.Gamepad;
import com.edinarobotics.utils.gamepad.gamepadfilters.GamepadFilterSet;
import com.edinarobotics.utils.gamepad.FilteredGamepad;
import java.util.List;
import java.util.ArrayList;

public class Controls {
    private static Controls instance;

    public Joystick joystick1;
    public Joystick joystick2;


    public  Controls() {


        joystick1 = new Joystick(0);
        joystick2 = new Joystick(1);


    }

    public static Controls getInstance(){
        if (instance == null){
            instance = new Controls();
        }
        return instance;
    }
}
