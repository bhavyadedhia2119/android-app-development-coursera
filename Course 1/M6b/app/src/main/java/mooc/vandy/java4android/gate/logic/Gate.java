package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    public static final int OUT = -1;
    public static final int IN = 1;
    public static final int CLOSED = 0;

    private int swing;
    private boolean locked;

    Gate() {
        swing = CLOSED;
        locked = true;
    }


    public boolean open(int direction) {
        if (setSwing(direction)) {
            locked = false;
            return true;
        }
        return false;
    }

    public boolean setSwing(int direction) {
        if (direction == -1 || direction == 1) {
            swing = direction;
            return true;
        }
        return false;
    }

    public int getSwingDirection() {
        return swing;
    }

    public int thru(int count) {
        if (swing == -1 || swing == 1) {
            return swing * count;
        }
        return 0;
    }

    public void close() {
        swing = CLOSED;
        locked = true;
    }

    public boolean isLocked() {
        return locked;
    }

    @Override
    public String toString() {
        if (locked) {
            return "This gate is closed";
        }

        if (!isLocked() && swing == IN) {
            return "This gate is open and swings to enter the pen only";
        }

        if (!isLocked() && swing == OUT) {
            return "This gate is open and swings to exit the pen only";
        }

        return "This gate has an invalid swing direction";
    }
}
