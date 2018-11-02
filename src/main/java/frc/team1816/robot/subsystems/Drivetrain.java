package frc.team1816.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem{
    private TalonSRX tmLeft;
    private TalonSRX tfLeft1;
    private TalonSRX tmRight;
    private TalonSRX tfRight1;

    public Drivetrain(int tmLeft, int tfLeft1, int tmRight, int tfRight1) {
        this.tmLeft = new TalonSRX(tmLeft);
        this.tfLeft1 = new TalonSRX(tfLeft1);
        this.tmRight = new TalonSRX(tmRight);
        this.tfRight1 = new TalonSRX(tfRight1);

        this.tmRight.setInverted(true);
        this.tmLeft.set(ControlMode.Follower, tfLeft1);
        this.tmRight.set(ControlMode.Follower, tfRight1);
    }

    public void initDefaultCommand() {

    }

    public void setPower(double leftPower, double rightPower) {
        tmLeft.set(ControlMode.PercentOutput, leftPower);
        tmRight.set(ControlMode.PercentOutput, rightPower);
    }

}
