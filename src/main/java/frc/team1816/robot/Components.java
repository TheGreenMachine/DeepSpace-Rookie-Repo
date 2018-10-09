package frc.team1816.robot;

import frc.team1816.robot.subsystems.Drivetrain;

public class Components {
    private static Components instance;

    public Drivetrain drivetrain;

    //Drivetrain Talon Id's
    private final int LEFT_MAIN = 1;
    private final int LEFT_SLAVE_ONE = 2;
    private final int LEFT_SLAVE_TWO = 3;
    private final int RIGHT_MAIN = 5;
    private final int RIGHT_SLAVE_ONE = 6;
    private final int RIGHT_SLAVE_TWO = 7;


    private Components(){
        this.drivetrain = new Drivetrain(
            LEFT_MAIN, LEFT_SLAVE_ONE, LEFT_SLAVE_TWO,
            RIGHT_MAIN, RIGHT_SLAVE_ONE, RIGHT_SLAVE_TWO
        );
    }

    public static Components getInstance(){
        if (instance == null){
            instance = new Components();
        }
        return instance;
    }


}
