package frc.team1816.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Chassis extends Subsystem {

    private TalonSRX right1 = new TalonSRX(5);
    private TalonSRX right2 = new TalonSRX(4);
    private TalonSRX left1 = new TalonSRX(14);
    private TalonSRX left2 = new TalonSRX(13);

    public void setPower(double power) {
        left1.set(ControlMode.PercentOutput, power);
        left2.set(ControlMode.PercentOutput, power);
        right1.set(ControlMode.PercentOutput, -power);
        right2.set(ControlMode.PercentOutput, -power);
    }

    public double[] getPower() {
        double[] powers = new double[4];

        powers[1] = right1.getMotorOutputPercent();
        powers[2] = right2.getMotorOutputPercent();
        powers[3] = left1.getMotorOutputPercent();
        powers[4] = left2.getMotorOutputPercent();

        return powers;
    }

    @Override
    protected void initDefaultCommand() { }
}
