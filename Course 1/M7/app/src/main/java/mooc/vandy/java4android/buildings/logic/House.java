package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House
        extends Building {
    private String owner;
    private boolean pool;

    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        super(length, width, lotLength, lotWidth);
        this.owner = owner;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        super(length, width, lotLength, lotWidth);
        this.owner = owner;
        this.pool = pool;
    }

    public boolean hasPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Building) {
            if (this.calcBuildingArea() == ((House) o).calcBuildingArea() &&
                    this.pool == ((House) o).pool)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String owner = "n/a";
        if (owner != null) {
            owner = this.owner;
        }
        String poolStr = "";
        if (hasPool()) {
            poolStr = "has a pool";
        }
        return "Owner: " + owner + ";" + poolStr + " " + super.toString();
    }
}
