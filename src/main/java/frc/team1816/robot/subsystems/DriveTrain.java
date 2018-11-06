package frc.team1816.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
    private TalonSRX leftMain, leftFollow, rightMain, rightFollow;
    private double leftPower, rightPower = 0;

    public DriveTrain(int leftMain, int leftFollow, int rightMain, int rightFollow) {
        super();
        this.leftMain = new TalonSRX(leftMain);
        this.leftFollow = new TalonSRX(leftFollow);
        this.rightMain = new TalonSRX(rightMain);
        this.rightFollow = new TalonSRX(rightFollow);

        this.leftMain.setInverted(true);
        this.leftFollow.setInverted(true);

        this.leftMain.setNeutralMode(NeutralMode.Brake);
        this.leftFollow.setNeutralMode(NeutralMode.Brake);
        this.rightMain.setNeutralMode(NeutralMode.Brake);
        this.rightFollow.setNeutralMode(NeutralMode.Brake);

        this.leftFollow.set(ControlMode.Follower, leftMain);
        this.rightFollow.set(ControlMode.Follower, rightMain);
    }
    public void setDriveTrain(double leftPower, double rightPower){
        this.leftPower = leftPower;
        this.rightPower = rightPower;
        update();
    }

    public void update(){
        this.leftMain.set(ControlMode.PercentOutput, leftPower);
        this.rightMain.set(ControlMode.PercentOutput, rightPower);
    }

    @Override
    protected void initDefaultCommand() { }
}
