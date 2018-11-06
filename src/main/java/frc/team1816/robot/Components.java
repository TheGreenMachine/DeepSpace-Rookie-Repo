package frc.team1816.robot;

import frc.team1816.robot.subsystems.DrivetrainFRC;

public class Components {

    private static final int RIGHT_MASTER = 5;
    private static final int RIGHT_SLAVE = 4;
    private static final int LEFT_MASTER = 14;
    private static final int LEFT_SLAVE = 13;

    private static Components instance;
    public DrivetrainFRC drivetrain;

    private Components(){
        this.drivetrain = new DrivetrainFRC(RIGHT_MASTER, RIGHT_SLAVE, LEFT_MASTER, LEFT_SLAVE);
    }

    public static Components getInstance(){
        if (instance == null){
            instance = new Components();
        }
        return instance;
    }


}
