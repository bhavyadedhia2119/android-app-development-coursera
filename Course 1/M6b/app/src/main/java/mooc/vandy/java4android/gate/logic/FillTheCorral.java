package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface out;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        this.out = out;
    }

    public void setCorralGates(Gate[] gates, Random selectDirection) {
        for (Gate gate : gates) {
            if (selectDirection.nextBoolean()) {
                gate.open(Gate.IN);
            } else {
                gate.open(Gate.OUT);
            }
            out.println("Gate " + gate.toString());
        }
    }

    public boolean anyCorralAvailable(Gate[] corral) {
        for (Gate aCorral : corral) {
            if (!aCorral.isLocked() && aCorral.getSwingDirection() == Gate.IN) {
                return true;
            }
        }
        return false;
    }

    public int corralSnails(Gate[] corral, Random random) {
        int snailOut = 5;
        int attempts = 0;
        while (snailOut > 0) {
            attempts += 1;
            int gateNumber = new Random().nextInt(4) + 1;
            int snail = random.nextInt(snailOut);
            if (corral[gateNumber].getSwingDirection() == Gate.IN) {
                snailOut -= snail;
            } else {
                snailOut += snail;
            }
            out.println(snail + " are trying to move through coral " + gateNumber);
        }
        out.println("It took " + attempts + " attempts to coral all of the snails.");
        return attempts;
    }
}
