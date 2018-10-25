package frc.team1816.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

  private TalonSRX
      leftMain, leftSlaveOne,
      rightMain, rightSlaveOne;

  private double leftPower = 0;
  private double rightPower = 0;

  public Drivetrain(
      int leftMain, int leftSlaveOne,
      int rightMain, int rightSlaveOne
  ) {
    super();
    this.leftMain = new TalonSRX(leftMain);
    this.leftSlaveOne = new TalonSRX(leftSlaveOne);

    this.rightMain = new TalonSRX(rightMain);
    this.rightSlaveOne = new TalonSRX(rightSlaveOne);

    this.leftMain.setInverted(true);
    this.leftSlaveOne.setInverted(true);

    this.leftMain.setNeutralMode(NeutralMode.Brake);
    this.leftSlaveOne.setNeutralMode(NeutralMode.Brake);

    this.rightMain.setNeutralMode(NeutralMode.Brake);
    this.rightSlaveOne.setNeutralMode(NeutralMode.Brake);

    this.leftSlaveOne.set(ControlMode.Follower, leftMain);

    this.rightSlaveOne.set(ControlMode.Follower, rightMain);
  }

  public void setDrivetrain(double leftPower, double rightPower){
    this.leftPower = leftPower;
    this.rightPower = rightPower;
    update();
  }

  public void update(){
    this.leftMain.set(ControlMode.PercentOutput, leftPower);
    this.rightMain.set(ControlMode.PercentOutput, rightPower);
  }


  @Override
  protected void initDefaultCommand() {

  }
}
