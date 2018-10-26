package com.edinarobotics.utils.gamepad.buttons;

import com.edinarobotics.utils.gamepad.XboxGamepad;
import edu.wpi.first.wpilibj.buttons.Button;

public class XboxDPadButton extends Button {
    private final XboxGamepad xboxGamepad;
    private final XboxDPadButtonType buttonType;

    public XboxDPadButton(XboxGamepad xboxGamepad, XboxDPadButtonType buttonType) {
        this.xboxGamepad = xboxGamepad;
        this.buttonType = buttonType;
    }

    @Override
    public boolean get(){
        if (buttonType == XboxDPadButtonType.UP) {
            return xboxGamepad.getXboxDPadY() == 1;
        } else if (buttonType == XboxDPadButtonType.DOWN) {
            return xboxGamepad.getXboxDPadY() == -1;
        } else if (buttonType == XboxDPadButtonType.LEFT) {
            return xboxGamepad.getXboxDPadX() == -1;
        } else if (buttonType == XboxDPadButtonType.RIGHT) {
            return xboxGamepad.getXboxDPadX() == 1;
        }

        return false;
    }
    public enum XboxDPadButtonType{
        UP((byte) 0, "up"),
        DOWN((byte) 1, "down"),
        LEFT((byte) 2, "left"),
        RIGHT((byte) 3, "right");

        private final byte value;
        private final String name;

        XboxDPadButtonType(byte value, String name){
            this.value = value;
            this.name = name;
        }

        private byte getValue() {
            return value;
        }

        /**
         * Gives the name of this XboxDPadButtonType for debugging purposes.
         *
         * @return The name of this XboxDPadButtonType in lower case.
         */
        public String getName() {
            return name.toLowerCase();
        }

        /**
         * Provides a human-readable String representation of this object.
         *
         * @return A human-readable String representation of this object.
         */
        public String toString() {
            return "Xbox D-Pad " + getName();
        }
    }
}