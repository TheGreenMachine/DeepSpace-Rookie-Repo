package frc.team1816.robot.commands;

import com.edinarobotics.utils.gamepad.Gamepad;
import edu.wpi.first.wpilibj.command.Command;
import frc.team1816.robot.Components;
import frc.team1816.robot.Controls;
import frc.team1816.robot.subsystems.Drivetrain;

public class DriveCommand extends Command {
    private Gamepad gamepad;
    private Drivetrain drivetrain;


    public DriveCommand() {
        drivetrain = Components.getInstance().drivetrain;
        gamepad = Controls.getInstance().gamepad;
        requires(drivetrain);
    }

    @Override
    protected void initialize() {
        super.initialize();
    }

    @Override
    protected void execute() {
        if(gamepad.dPadLeft().get()) {
            drivetrain.setPower(0.25, 0);
            System.out.println("Left Wheel power: 0.25");
        } else if(gamepad.dPadRight().get()) {
            drivetrain.setPower(0, 0.25);
            System.out.println("Right wheel power: 0.25");
        } else if(gamepad.dPadUp().get()) {
            drivetrain.setPower(0.25, 0.25);
            System.out.println("Right wheel power: 0.25" + " Left wheel power: 0.25");
        } else {
            drivetrain.setPower(0,0);
        }

    }

    @Override
    protected boolean isFinished () {
        return false;
    }

    @Override
    protected void end() {
        drivetrain.setPower(0, 0);
    }

    @Override
    protected void interrupted() {
        end();
    }
}