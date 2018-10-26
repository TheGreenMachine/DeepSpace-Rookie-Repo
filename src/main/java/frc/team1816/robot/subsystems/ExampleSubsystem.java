package frc.team1816.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ExampleSubsystem extends Subsystem {

    private TalonSRX tmLeft = new TalonSRX(14);
    private TalonSRX tfLeft1 = new TalonSRX(13);


    private TalonSRX tmRight = new TalonSRX(5);
    private TalonSRX tfRight1 = new TalonSRX(4);



    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public ExampleSubsystem() {
    }

    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
        this.tfLeft1.follow(tmLeft);
        this.tfRight1.follow(tmRight);

    }

    public TalonSRX getTmLeft() {
        return tmLeft;
    }

    public TalonSRX getTmRight() {
        return tmRight;
    }
}

