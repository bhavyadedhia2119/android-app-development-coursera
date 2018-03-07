package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    private double firstArgument;
    private double secondArgument;

    public Divide(double firstArgument, double secondArgument) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }

    public double getResult() {
        return firstArgument / secondArgument;
    }
}
