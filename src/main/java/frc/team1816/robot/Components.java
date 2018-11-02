package frc.team1816.robot;

import frc.team1816.robot.subsystems.Drivetrain;

public class Components {

    private static Components instance;
    public Drivetrain drivetrain;

    private Components(){
        this.drivetrain = new Drivetrain(14,13,5,4);
    }

    public static Components getInstance(){
        if (instance == null){
            instance = new Components();
        }
        return instance;
    }


    }
