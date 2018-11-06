package frc.team1816.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.team1816.robot.commands.DriveTrainCommand;
import frc.team1816.robot.subsystems.DriveTrainSubsystem;
//import frc.team1816.robot.commands.DriveTrainCommand;
//import frc.team1816.robot.subsystems.DriveTrainSubsystem;
// import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends TimedRobot {

   // double leftpower;
   // double rightpower;
    TalonSRX leftdrive1;
    TalonSRX leftdrive2;
    TalonSRX rightdrive1;
    TalonSRX rightdrive2;
    RobotDrive myRobot;
    Joystick joystick1;
    Joystick joystick2;
    DriveTrainSubsystem drivetrain;



 //   public static final DriveTrainSubsystem DriveTrainSub = new DriveTrainSubsystem();


    public void robotInit() {


        drivetrain = Components.getInstance().driveTrainSubsystem;
        leftdrive1 = new TalonSRX(1);
        leftdrive2 = new TalonSRX(2);
        rightdrive1 = new TalonSRX(3);
        rightdrive2 = new TalonSRX(4);
        joystick2 = new Joystick(0);
        joystick1 = new Joystick(1);

        Controls.getInstance();
        Components.getInstance();

    }

    //@Override
    public void disabledInit() { }

    //@Override
    public void autonomousInit() {

    }

    //@Override
    public void teleopInit() {
        drivetrain.setDefaultCommand(new DriveTrainCommand());

    }
    //@Override
    public void testInit() { }


    //@Override
    public void disabledPeriodic() { }
    
    //@Override
    public void autonomousPeriodic() {

    }

    //@Override
    public void teleopPeriodic() {

    }

    //@Override
    public void testPeriodic() {
        LiveWindow.run();
    }
}