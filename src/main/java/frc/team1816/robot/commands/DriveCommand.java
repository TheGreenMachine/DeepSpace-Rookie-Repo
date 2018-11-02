package frc.team1816.robot.commands;

import com.edinarobotics.utils.gamepad.Gamepad;
import edu.wpi.first.wpilibj.command.Command;
import frc.team1816.robot.subsystems.Drivetrain;

public class DriveCommand extends Command {
    private Gamepad gamepad;
    private Drivetrain drivetrain;


    public DriveCommand() {
        requires(drivetrain);
    }

    @Override
    protected void initialize() {
        super.initialize();
    }

    @Override
    protected void execute() {
        while (gamepad.diamondLeft().get()) {
            drivetrain.setPower(0.25, 0);
            System.out.println("Left wheel power: 0.25");
        }

        while (gamepad.diamondRight().get()) {
            drivetrain.setPower(0,0.25);
            System.out.println("Right wheel power: 0.25");
        }

        while (gamepad.diamondUp().get()) {
            drivetrain.setPower(0.25, 0.25);
            System.out.println("Right wheel power: 0.25" + " Left wheel power: 0.25");
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
}
