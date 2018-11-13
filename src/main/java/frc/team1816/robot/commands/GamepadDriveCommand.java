package frc.team1816.robot.commands;

import com.edinarobotics.utils.gamepad.Gamepad;
import com.edinarobotics.utils.math.Math1816;
import edu.wpi.first.wpilibj.command.Command;
import frc.team1816.robot.Components;
import frc.team1816.robot.Controls;
import frc.team1816.robot.subsystems.DriveTrain;

public class GamepadDriveCommand extends Command {
    private DriveTrain driveTrain;
    private Gamepad gamepad;

    public GamepadDriveCommand() {
        super("gamepaddrivecommand");
        this.driveTrain = Components.getInstance().drivetrain;
        this.gamepad = Controls.getInstance().gamepadDriver;
        requires(driveTrain);
    }

    @Override
    protected void execute() {
        double speed = Controls.getInstance().getDriveSpeed();
        double turn = Controls.getInstance().getDriveTurn();

        System.out.println("Gamepad Left Y: " + gamepad.getLeftY() + " Right X: " + gamepad.getRightX());

        double leftPower = Math1816.coerceValue(1,-1, speed + turn);
        double rightPower = Math1816.coerceValue(1, -1, speed - turn);

        System.out.println("Left Power: " + leftPower + "Right Power: " + rightPower);

        if (turn == 0){
            driveTrain.setDriveTrain(0.5 * leftPower, 0.5 * rightPower);
        } else if (turn != 0) {
            driveTrain.setDriveTrain(0.5 * leftPower, 0.5 * rightPower);
        }
    }

    @Override
    protected void end() { this.driveTrain.setDriveTrain(0,0); }

    @Override
    protected void interrupted(){ end(); }

    @Override
    protected boolean isFinished() { return false; }
}
