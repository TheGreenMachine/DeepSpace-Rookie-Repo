package frc.team1816.robot.commands;

import com.edinarobotics.utils.gamepad.Gamepad;
import edu.wpi.first.wpilibj.command.Command;
import frc.team1816.robot.Components;
import frc.team1816.robot.subsystems.DriveTrain;

public class GamepadDriveCommand extends Command {
    private DriveTrain driveTrain;
    private Gamepad gamepad;

    public GamepadDriveCommand() {
        super("gamepaddrivecommand");
        this.driveTrain = Components.getInstance().drivetrain;
    }
}
