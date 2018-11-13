package frc.team1816.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team1816.robot.commands.GamepadDriveCommand;
import frc.team1816.robot.subsystems.DriveTrain;

public class Robot extends TimedRobot {

    private DriveTrain driveTrain;

    @Override
    public void robotInit() {
        Components.getInstance();
        Controls.getInstance();

        driveTrain = Components.getInstance().drivetrain;
    }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }

    @Override
    public void teleopInit() { driveTrain.setDefaultCommand(new GamepadDriveCommand());}

    @Override
    public void testInit() { }

    @Override
    public void disabledPeriodic() { }
    
    @Override
    public void autonomousPeriodic() { }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void testPeriodic() { }
}