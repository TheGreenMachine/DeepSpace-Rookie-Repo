package frc.team1816.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class Robot extends TimedRobot {
	public final static int RIGHT_MAIN = 5;
	public final static int RIGHT_FOLLOW = 4;
	public final static int LEFT_MAIN = 14;
	public final static int LEFT_FOLLOW = 13;	
	/** our test talon */
	TalonSRX leftTalonMain = new TalonSRX(LEFT_MAIN);
	TalonSRX leftTalonFollow = new TalonSRX(LEFT_FOLLOW);
	TalonSRX rightTalonMain = new TalonSRX(RIGHT_MAIN);
	TalonSRX rightTalonFollow = new TalonSRX(RIGHT_FOLLOW);
	
	/* our test gamepad */
	Joystick _joy = new Joystick(0);
	/** save buttons each loop */
	boolean[] _btnsLast = {false, false, false, false, false, false, false, false, false, false};
	/** desired brake mode, init value assigned here */
	boolean _brake = true;
	int leftSpeed = 0;
	int rightSpeed = 0;

	/** c'tor Select the brake mode to start with. */
	public Robot() {
		/* override brake setting programmatically */
		leftTalonMain.setNeutralMode(_brake ? NeutralMode.Brake : NeutralMode.Coast);
		leftTalonFollow.setNeutralMode(NeutralMode.Coast);
		
		leftTalonFollow.set(ControlMode.Follower, LEFT_MAIN);
		rightTalonFollow.set(ControlMode.Follower, RIGHT_MAIN);
		System.out.println("brake:" + _brake); /* instrument to console */
	}

	/** Every loop, flip brake mode if button1 when is pressed. */
	public void commonloop() {
		/* get buttons */
		boolean[] btns = new boolean[_btnsLast.length];
		for (int i = 1; i < _btnsLast.length; ++i)
			btns[i] = _joy.getRawButton(i);

		/* flip brake when btn1 is pressed */
		if (btns[1] && !_btnsLast[1]) {
			_brake = !_brake;
			/* override brake setting programmatically */
			leftTalonMain.setNeutralMode(_brake ? NeutralMode.Brake : NeutralMode.Coast);
			/* instrument to console */
			System.out.println("brake:" + _brake); 
		}
		double throttle = _joy.getRawAxis(0);
		System.out.println("Throttle: " + throttle);

		double lspeed = 0.2;
		double rspeed = 0.2;
		if (throttle < 0) {
			lspeed = -throttle * lspeed;
		} else {
			rspeed = throttle * rspeed;
		}
		leftTalonMain.set(ControlMode.PercentOutput, lspeed);
		System.out.printf("set left speed :%.2f\n", lspeed); 
		rightTalonMain.set(ControlMode.PercentOutput, -rspeed);
		System.out.printf("set right speed :%.2f\n", rspeed); 

		/* save buttons states for on-press detection */
		for (int i = 1; i < 10; ++i)
			_btnsLast[i] = btns[i];
	}

	public void disabledPeriodic() {
		commonloop(); /* just call a "common" loop */
	}

	public void teleopPeriodic() {
		commonloop(); /* just call a "common" loop */
	}
	
    @Override
    public void robotInit() { }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }

    @Override
    public void teleopInit() { }

    @Override
    public void testInit() { }

    @Override
    public void autonomousPeriodic() { }

    @Override
    public void testPeriodic() { }
}