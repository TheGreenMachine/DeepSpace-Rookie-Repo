package frc.team1816.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.team1816.robot.subsystems.ExampleSubsystem;

public class Robot extends TimedRobot {

    ExampleSubsystem ex = new ExampleSubsystem();

    @Override
    public void robotInit() {
        ex.initDefaultCommand();
        System.out.println("Initialized...");

    }

    @Override
    public void disabledInit() {

    }

    @Override
    public void autonomousInit() {

    }

    @Override
    public void teleopInit() {

    }

    @Override
    public void testInit() {

    }


    @Override
    public void disabledPeriodic() {

    }
    
    @Override
    public void autonomousPeriodic() {

    }

    @Override
    public void teleopPeriodic() {
        System.out.println("Teleop");
        Components.getInstance().move();
    }

    @Override
    public void testPeriodic() {

    }
}