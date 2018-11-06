package frc.team1816.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DrivetrainFRC extends Subsystem {
    TalonSRX rightmaster;
    TalonSRX rightslave;
    TalonSRX leftmaster;
    TalonSRX leftslave;

    public DrivetrainFRC (int w, int x, int y, int z) {
        rightmaster = new TalonSRX(w);
        rightslave = new TalonSRX(x);
        leftmaster = new TalonSRX(y);
        leftslave = new TalonSRX(z);
    }
    public void initRobot() {
        rightslave.follow(rightmaster);
        leftslave.follow(leftmaster);
    }
    public void moveRobot(double speedright, double speedleft) {
        rightmaster.set(ControlMode.PercentOutput, speedright);
        leftmaster.set(ControlMode.PercentOutput, speedleft);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

