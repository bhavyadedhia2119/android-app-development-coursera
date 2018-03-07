package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage
        extends House {
    private boolean secondFloor;

    public Cottage(int length, int lotLength, int lotWidth) {
        super(length, length, lotLength, lotWidth);
    }

    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor) {
        super(dimension, dimension, lotLength, lotWidth, owner);
        this.secondFloor = secondFloor;
    }

    public boolean hasSecondFloor() {
        return secondFloor;
    }

    public void setSecondFloor(boolean secondFloor) {
        this.secondFloor = secondFloor;
    }

    @Override
    public String toString() {
        String secondFloor = "";
        if (hasSecondFloor()) {
            secondFloor = "is a two story cottage";
        }
        return super.toString() + "; " + secondFloor;
    }
}

