package frc.team1816.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team1816.robot.Components;
import frc.team1816.robot.subsystems.Chassis;

import java.awt.*;

public class Drive extends Command{

    private Chassis chassis;

    public Drive() {
        this.chassis = Components.getInstance().chassis;
        requires(chassis);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        chassis.setPower(0.2);
        System.out.println("Setpoint: " + chassis.getPower());
    }

    @Override
    protected void end() {
        this.chassis.setPower(0);
    }

    @Override
    protected void interrupted() {
        end();
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
