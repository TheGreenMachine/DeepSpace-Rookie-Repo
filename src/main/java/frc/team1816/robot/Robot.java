package frc.team1816.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.TimedRobot;
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
    Timer timer;


 //   public static final DriveTrainSubsystem DriveTrainSub = new DriveTrainSubsystem();

    //@Override
    public void robotInit() {
       // myRobot = new RobotDrive(1  ,2);
        joystick1 = new Joystick(1);
        timer = new Timer();
        leftdrive1 = new TalonSRX(1);
        leftdrive2 = new TalonSRX(2);
        rightdrive1 = new TalonSRX(3);
        rightdrive2 = new TalonSRX(4);
        joystick2 = new Joystick(2);

        Controls.getInstance();
        Components.getInstance();

    }

    //@Override
    public void disabledInit() { }

    //@Override
    public void autonomousInit() {
        timer.reset(); // Resets the timer to 0
        timer.start(); // Start counting
    }

    //@Override
    public void teleopInit() {


    }
    //@Override
    public void testInit() { }


    //@Override
    public void disabledPeriodic() { }
    
    //@Override
    public void autonomousPeriodic() {
        if (timer.get() < 2.0) {

        } else {

        }
    }

    //@Override
    public void teleopPeriodic() {

    }

    //@Override
    public void testPeriodic() {
        LiveWindow.run();
    }
}