package frc.team1816.robot.commands;

import com.edinarobotics.utils.gamepad.Gamepad;
import edu.wpi.first.wpilibj.command.Command;
import frc.team1816.robot.Components;
import frc.team1816.robot.Controls;
import frc.team1816.robot.subsystems.Drivetrain;

import static com.edinarobotics.utils.math.Math1816.coerceValue;

public class GamepadDriveCommand extends Command {
  private Drivetrain drivetrain;
  private Gamepad gamepadDriver;

  public GamepadDriveCommand(){
    super("gamepaddrivecommand");
    this.drivetrain = Components.getInstance().drivetrain;
    this.gamepadDriver = Controls.getInstance().gamepadDriver;
    requires(drivetrain);
  }

  @Override
  protected void execute() {
    double speed = gamepadDriver.getLeftY();
    double turn = gamepadDriver.getRightX();
    System.out.println("Gamepad LeftY " + gamepadDriver.getLeftY() + " RightX " + gamepadDriver.getRightX());
    double leftPower = coerceValue(1, -1, speed + turn);
    double rightPower = coerceValue(1, -1, speed - turn);
    System.out.println("Left Power: " + leftPower + " Right Power: " + rightPower);
    drivetrain.setDrivetrain(0.3*leftPower, 0.3*rightPower);
  }

  @Override
  protected void end() {
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
