package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    private int firstArgument;
    private int secondArgument;

    public Add(int firstArgument, int secondArgument) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }

    public int getResult() {
        return firstArgument + secondArgument;
    }
}
