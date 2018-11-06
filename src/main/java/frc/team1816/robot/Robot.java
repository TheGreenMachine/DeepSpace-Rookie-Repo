package frc.team1816.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team1816.robot.commands.Drive;
import frc.team1816.robot.subsystems.Chassis;

public class Robot extends TimedRobot {

    private Chassis chassis;

    @Override
    public void robotInit() {
        Components.getInstance();
        Controls.getInstance();

        this.chassis = Components.getInstance().chassis;
    }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }

    @Override
    public void teleopInit() {
        chassis.setDefaultCommand(new Drive());
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