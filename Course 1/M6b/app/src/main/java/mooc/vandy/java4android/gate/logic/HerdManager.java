package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface output;

    /**
     * The input Gate object.
     */
    private Gate eastGate;

    /**
     * The output Gate object.
     */
    private Gate westGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;

    /**
     * Size of the herd
     */
    private static final int HERD = 24;

    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        this.output = out;

        this.westGate = westGate;
        this.westGate.open(Gate.IN);

        this.eastGate = eastGate;
        this.eastGate.open(Gate.OUT);
    }

    public void simulateHerd(Random random) {
        int herdIn = HERD;
        int herdOut = 0;

        // printing initial status
        output.println("There are currently " + herdIn + " snails in the pen and "
                + herdOut + " snails in the pasture");

        //loop through the max iterations and move some snails..
        // hopefully they don't move as slow as they travel
        for (int i = 0; i < MAX_ITERATIONS; i++) {
            // find out what direction we are moving
            int direction = 0;
            if (herdOut == 0) {
                direction = Gate.OUT;
            } else if (herdIn == 0) {
                direction = Gate.IN;
            } else {
                direction = random.nextInt(herdOut) + 1;
            }
            // determine the number to transfer
            int transferCount = 0;
            if (direction == Gate.IN) {
                transferCount = random.nextInt(herdOut) + 1;
            } else {
                transferCount = random.nextInt(herdIn) + 1;
            }
            // Transfer those slimy things
            int countTransferred = 0;
            if (direction == Gate.IN) {
                countTransferred = westGate.thru(transferCount);
            } else {
                countTransferred = eastGate.thru(transferCount);
                herdIn += countTransferred;
                herdOut -= countTransferred;
            }
        }
        //Print status after the snails have been transferred
        output.println("There are currently " + herdIn + " snails in the pen and "
                + herdOut + " snails in the pasture");
    }
}
