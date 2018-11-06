package frc.team1816.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
//import frc.team1816.robot.RobotMap;

public class DriveTrainSubsystem extends Subsystem {

        private TalonSRX leftTalon1, leftTalon2, rightTalon1, rightTalon2;

        private double leftpower = 0, rightpower = 0;

        public DriveTrainSubsystem(int leftTalon1, int leftTalon2, int rightTalon1, int rightTalon2 ) {

        this.leftTalon1 = new TalonSRX(leftTalon1);
        this.leftTalon2 = new TalonSRX(leftTalon2);
        this.rightTalon1 = new TalonSRX(rightTalon1);
        this.rightTalon2 = new TalonSRX(rightTalon2);

        this.leftTalon2.set(ControlMode.Follower, leftTalon1);
        this.rightTalon2.set(ControlMode.Follower, rightTalon1);

        this.rightTalon1.setInverted(true);
        this.rightTalon2.setInverted(true);



        }
        public void active(double speedLeft, double speedRight)  {

            this.leftTalon1.set(ControlMode.PercentOutput, speedLeft);
            this.rightTalon1.set(ControlMode.PercentOutput, speedRight);


        }
        public void setDriveTrain() {

        }

        public void update() {


        }


    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
      //  setDefaultCommand(new DriveTrainCommand());
    }
}

