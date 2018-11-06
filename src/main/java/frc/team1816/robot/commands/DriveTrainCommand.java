package frc.team1816.robot.commands;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.edinarobotics.utils.gamepad.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;
import com.edinarobotics.utils.gamepad.Gamepad;
import static com.edinarobotics.utils.math.Math1816.coerceValue;
import frc.team1816.robot.Components;
import frc.team1816.robot.Controls;
import frc.team1816.robot.subsystems.DriveTrainSubsystem;


public class DriveTrainCommand extends Command {

    private DriveTrainSubsystem drivetrain;

    private Joystick joystick;

    public DriveTrainCommand() {

        drivetrain = Components.getInstance().driveTrainSubsystem;
        joystick = Controls.getInstance().joystick1;
        requires(drivetrain);


    }


    /**
     * The initialize method is called just before the first time
     * this Command is run after being started.
     */
//    @Override
    protected void initialize() {

    }


    /**
     * The execute method is called repeatedly when this Command is
     * scheduled to run until this Command either finishes or is canceled.
     */
//    @Override
    protected void execute() {
        double value;
        value = joystick.getX();

        if (value == 1.0) {
            drivetrain.active(0.25, 0.25);
        }

    }






    /**
     * <p>
     * Returns whether this command is finished. If it is, then the command will be removed and
     * {@link #end()} will be called.
     * </p><p>
     * It may be useful for a team to reference the {@link #isTimedOut()}
     * method for time-sensitive commands.
     * </p><p>
     * Returning false will result in the command never ending automatically. It may still be
     * cancelled manually or interrupted by another command. Returning true will result in the
     * command executing once and finishing immediately. It is recommended to use
     * {@link edu.wpi.first.wpilibj.command.InstantCommand} (added in 2017) for this.
     * </p>
     *
     * @return whether this command is finished.
     * @see Command#isTimedOut() isTimedOut()
     */
  //  @Override
    protected boolean isFinished() {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false;
    }


    /**
     * Called once when the command ended peacefully; that is it is called once
     * after {@link #isFinished()} returns true. This is where you may want to
     * wrap up loose ends, like shutting off a motor that was being used in the
     * command.
     */
    // @Override
    protected void end() {

    }

    /**
     * <p>
     * Called when the command ends because somebody called {@link #cancel()} or
     * another command shared the same requirements as this one, and booted it out. For example,
     * it is called when another command which requires one or more of the same
     * subsystems is scheduled to run.
     * </p><p>
     * This is where you may want to wrap up loose ends, like shutting off a motor that was being
     * used in the command.
     * </p><p>
     * Generally, it is useful to simply call the {@link #end()} method within this
     * method, as done here.
     * </p>
     */
 //   @Override
    protected void interrupted() {
        super.interrupted();
    }
}