package com.edinarobotics.utils.gamepad.buttons;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.Button;

public class AnalogButton extends Button {
    private final GenericHID inputDevice;
    private final int axis;
    private final double threshold;

    public AnalogButton(GenericHID inputDevice, int axis, double threshold) {
        this.inputDevice = inputDevice;
        this.axis = axis;
        this.threshold = threshold;
    }

    public AnalogButton(GenericHID inputDevice, int axis) {
        this(inputDevice, axis, 0.5);
    }

    @Override
    public boolean get() {
        return (inputDevice.getRawAxis(axis) > threshold);
    }
}
