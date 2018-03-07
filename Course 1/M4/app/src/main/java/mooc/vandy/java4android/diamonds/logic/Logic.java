package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
        implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface out;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out) {
        this.out = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {
        printStartOrEndBoundary(size);
        printUpperPart(size);
        printCenterLine(size);
        printLowerPart(size);
        printStartOrEndBoundary(size);
    }

    private void printSpaces(int size, int i) {
        for (int j = size; j > i; j--) {
            out.print(" ");
        }
    }

    private void printInsidePart(int size) {
        for (int i = 1; i <= 2 * (size - 1); i++) {
            if (size % 2 == 0) {
                out.print("-");
            } else {
                out.print("=");
            }
        }
    }

    private void printUpperPart(int size) {
        for (int i = 1; i < size; i++) {
            out.print("|");
            printSpaces(size, i);
            out.print("/");
            printInsidePart(i);
            out.print("\\");
            printSpaces(size, i);
            out.println("|");
        }
    }

    private void printLowerPart(int size) {
        for (int i = size - 1; i > 0; i--) {
            out.print("|");
            for (int j = size; j > i; j--) {
                out.print(" ");
            }
            out.print("\\");
            printInsidePart(i);
            out.print("/");
            printSpaces(size, i);
            out.println("|");
        }
    }


    private void printCenterLine(int size) {
        out.print("|");
        out.print("<");
        printInsidePart(size);
        out.print(">");
        out.println("|");
    }

    private void printStartOrEndBoundary(int size) {
        out.print("+");
        for (int i = 0; i < size * 2; i++) {
            out.print("-");
        }
        out.print("+");
        out.println("");
    }

}
