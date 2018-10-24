package frc.team1816.robot;

import frc.team1816.robot.subsystems.DriveTrainSubsystem;

public class Components {
    private static Components instance;

    public DriveTrainSubsystem driveTrainSubsystem;

    private final int LEFT_MAIN = 14;
    private final int LEFT_SLAVE_ONE = 13;
    private final int RIGHT_MAIN = 5;
    private final int RIGHT_SLAVE_ONE = 4;


    public Components(){
    this.driveTrainSubsystem = new DriveTrainSubsystem(LEFT_MAIN, LEFT_SLAVE_ONE, RIGHT_MAIN, RIGHT_SLAVE_ONE);
    }

    public static Components getInstance(){
        if (instance == null){
            instance = new Components();
        }
        return instance;
    }


}
