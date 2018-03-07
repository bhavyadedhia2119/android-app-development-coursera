package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    private int firstArgument;
    private int secondArgument;

    public Multiply(int firstArgument, int secondArgument) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }

    public int getResult() {
        return firstArgument * secondArgument;
    }
}
