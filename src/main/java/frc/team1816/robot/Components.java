package frc.team1816.robot;

import frc.team1816.robot.subsystems.Chassis;

public class Components {
    private static Components instance;

    public Chassis chassis;

    public Components(){
        this.chassis = new Chassis();
    }

    public static Components getInstance(){
        if (instance == null){
            instance = new Components();
        }
        return instance;
    }


}
