package frc.team1816.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.edinarobotics.utils.gamepad.Gamepad;
import frc.team1816.robot.subsystems.ExampleSubsystem;

public class Components {

    private static Components instance;
    ExampleSubsystem ex = new ExampleSubsystem();
    private Gamepad gamepad, gamepad1;


    private Components(){
        gamepad = new Gamepad(0);
        gamepad1 = new Gamepad(1);
    }

    public static Components getInstance(){
        if (instance == null){
            instance = new Components();
        }
        return instance;
    }

    public void move() {
        while (gamepad.equals(true)) {
            ex.getTmLeft().set(ControlMode.Velocity, 0.25);
            System.out.println("Left wheel power: 0.25");
        }

        if (gamepad1.equals(true)) {
            ex.getTmRight().set(ControlMode.Velocity, 0.25);
            System.out.println("Right wheel power: 0.25");
        }
    }


}
