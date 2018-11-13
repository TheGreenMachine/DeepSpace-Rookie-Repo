package frc.team1816.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team1816.robot.commands.XboxTestCommand;

public class Robot extends TimedRobot {

    XboxTestCommand command;
    @Override
    public void robotInit() {
        Components.getInstance();
        Controls.getInstance();
    }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() {
        command = new XboxTestCommand();
        command.start();
    }

    @Override
    public void teleopInit() { }

    @Override
    public void testInit() { }


    @Override
    public void disabledPeriodic() { }
    
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopPeriodic() {
    }

    @Override
    public void testPeriodic() { }
}