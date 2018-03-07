package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
        extends Building {

    private String businessName;
    private int parkingSpaces;
    private static int totalNumberOfOffices = 0;

    //Constructors
    public Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        totalNumberOfOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName) {
        super(length, width, lotLength, lotWidth);
        this.businessName = businessName;
        totalNumberOfOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces) {
        super(length, width, lotLength, lotWidth);
        this.businessName = businessName;
        this.parkingSpaces = parkingSpaces;
        totalNumberOfOffices++;
    }

    //Getters and Setters
    public String getBusinessName() {
        return businessName;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public void setBusinessName(String mBusinessName) {
        this.businessName = mBusinessName;
    }

    public void setParkingSpaces(int mParkingSpaces) {
        this.parkingSpaces = mParkingSpaces;
    }

    //Methods
    @Override
    public String toString() {
        String businessName = "unoccupied";
        if (getBusinessName() != null) {
            businessName = getBusinessName() + " ";
        }
        String NumOfParkingSpaces = "";
        if (getParkingSpaces() > 0) {
            NumOfParkingSpaces = "has " + getParkingSpaces() + " parking spaces";
        }
        return "Business: " + businessName + NumOfParkingSpaces + " (total offices: " + totalNumberOfOffices + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Office) {
            if (this.calcBuildingArea() == ((Office) obj).calcBuildingArea() && this.parkingSpaces == ((Office) obj).parkingSpaces) {
                return true;
            }
        }
        return false;
    }

}
