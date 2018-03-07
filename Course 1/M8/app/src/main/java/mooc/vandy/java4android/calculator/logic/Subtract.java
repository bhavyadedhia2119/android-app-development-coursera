package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    private int firstArgument;
    private int secondArgument;

    public Subtract(int firstArgument, int secondArgument) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }

    public int getResult() {
        return firstArgument - secondArgument;
    }
}
