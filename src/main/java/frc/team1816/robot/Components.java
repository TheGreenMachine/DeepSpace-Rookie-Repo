package frc.team1816.robot;

import frc.team1816.robot.subsystems.DriveTrain;

public class Components {
    private static Components instance;

    private DriveTrain drivetrain;

    private final int LEFT_MAIN = 14;
    private final int LEFT_FOLLOW = 13;

    private final int RIGHT_MAIN = 5;
    private final int RIGHT_FOLLOW = 4;

    private Components(){
        this.drivetrain = new DriveTrain(LEFT_MAIN, LEFT_FOLLOW, RIGHT_MAIN, RIGHT_FOLLOW);
    }

    public static Components getInstance(){
        if (instance == null){
            instance = new Components();
        }
        return instance;
    }


}
