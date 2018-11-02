package frc.team1816.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team1816.robot.commands.DriveCommand;
import frc.team1816.robot.subsystems.Drivetrain;

public class Robot extends TimedRobot {

    Drivetrain drivetrain;


    @Override
    public void robotInit() {
        Components.getInstance();

    }

    @Override
    public void disabledInit() {

    }

    @Override
    public void autonomousInit() {

    }

    @Override
    public void teleopInit() {
        drivetrain.setDefaultCommand(new DriveCommand());
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
        Scheduler.getInstance().run();

    }

    @Override
    public void testPeriodic() {

    }
}