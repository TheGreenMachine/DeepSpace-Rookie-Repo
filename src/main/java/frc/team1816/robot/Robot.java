package frc.team1816.robot;

import com.edinarobotics.utils.gamepad.Gamepad;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team1816.robot.commands.GamepadDriveCommand;
import frc.team1816.robot.subsystems.Drivetrain;

public class Robot extends TimedRobot {

    private Drivetrain drivetrain;
    private Gamepad gamepadDriver;

    @Override
    public void robotInit() {
        // Initializes components and controls,
        // which are needed to initialize subsystems
        Components.getInstance();
        Controls.getInstance();

        drivetrain = Components.getInstance().drivetrain;
        gamepadDriver = Controls.getInstance().gamepadDriver;
    }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }

    @Override
    public void teleopInit() {
        drivetrain.setDefaultCommand(new GamepadDriveCommand(gamepadDriver));
    }

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