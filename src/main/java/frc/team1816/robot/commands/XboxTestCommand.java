package frc.team1816.robot.commands;

import com.edinarobotics.utils.gamepad.XboxGamepad;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;
import frc.team1816.robot.Controls;


public class XboxTestCommand extends Command {
    private XboxController controller;
    public XboxTestCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        controller = new XboxController(0);
    }


    /**
     * The initialize method is called just before the first time
     * this Command is run after being started.
     */
    @Override
    protected void initialize() {
    }


    /**
     * The execute method is called repeatedly when this Command is
     * scheduled to run until this Command either finishes or is canceled.
     */
    @Override
    protected void execute() {
//        System.out.println("Unfiltered:");

        System.out.println("Left: " + controller.getRawAxis(0) + " " + controller.getY(GenericHID.Hand.kLeft));
//        System.out.printf("RX: %.2f\tRY: %.2f%n", gamepad.getRightX(), gamepad.getRightY());
//        System.out.printf("LT: %.2f\tRT: %.2f%n", gamepad.getLT(), gamepad.getRT());
//        System.out.println("Filtered:");
//        System.out.printf("LX: %.2f\tLY: %.2f%n", gamepad.filtered.getLeftX(), gamepad.filtered.getLeftY());
//        System.out.printf("RX: %.2f\tRY: %.2f%n", gamepad.filtered.getRightX(), gamepad.filtered.getRightY());
//        try {
//            System.out.printf("LT: %.2f\tRT: %.2f%n", gamepad.filtered.getLT(), gamepad.filtered.getRT());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("Buttons:");
//        System.out.printf("A: %b\tB: %b\tX: %b\tY: %b%n",
//                gamepad.buttonA().get(), gamepad.buttonB().get(),
//                gamepad.buttonX().get(), gamepad.buttonY().get()
//        );
//        System.out.printf("DPad: %d %d", gamepad.getDPadX(), gamepad.getDPadY());
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
    @Override
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
    @Override
    protected void end() {
        System.out.println("Finishing!");
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
    @Override
    protected void interrupted() {
        System.out.println("Interrupted!");
//        super.interrupted();
        end();
    }
}
