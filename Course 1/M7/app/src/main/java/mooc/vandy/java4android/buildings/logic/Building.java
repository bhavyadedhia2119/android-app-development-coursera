package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    private int length;
    private int width;
    private int lotLength;
    private int lotWidth;

    public Building(int length, int width, int lotLength, int lotWidth) {
        setLength(length);
        setLotLength(lotLength);
        setLotWidth(lotWidth);
        setWidth(width);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLotLength() {
        return lotLength;
    }

    public void setLotLength(int lotLength) {
        this.lotLength = lotLength;
    }

    public int getLotWidth() {
        return lotWidth;
    }

    public void setLotWidth(int lotWidth) {
        this.lotWidth = lotWidth;
    }

    /**
     * Other methods
     */
    public int calcBuildingArea() {
        return width * length;
    }

    public int calcLotArea() {
        return lotWidth * lotLength;
    }

    public String toString() {
        if (calcLotArea() > calcBuildingArea()) {
            return "has a big open space";
        } else {
            return "";
        }
    }
}
