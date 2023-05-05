package Vehicle;

import java.util.Objects;

public class LandVehicle extends Vehicle {

    protected int numOfWheels;
    protected boolean roadType; // true = pavement . false=dirt

    public LandVehicle() {
        super();
        this.numOfWheels=0;
        this.roadType=false;
    }
    public LandVehicle(int numOfWheels) { // for amphibious
        super();
        this.numOfWheels=numOfWheels;
        this.roadType=true; // paved for amphibious
    }

    @Override
    public String toString() {

        String flagBool;
        if (this.roadType==true) { // pavement
            flagBool="pavement";
        }
        else // against
            flagBool="dirt";

        return super.toString()  +
                " Number of wheels=" + numOfWheels +
                ", Road Type=" + flagBool
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LandVehicle that = (LandVehicle) o;
        return numOfWheels == that.numOfWheels && roadType == that.roadType;
    }

    // check equals without comparing distance, because the distances changing, cause of people taking for test drives
    @Override
    public boolean equals2(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LandVehicle that = (LandVehicle) o;
        return numOfWheels == that.numOfWheels && roadType == that.roadType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numOfWheels, roadType);
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public void setRoadType(boolean roadType) {
        this.roadType = roadType;
    }

    public int getNumOfWheels() { return numOfWheels; }

    public boolean isRoadType() { return roadType; }
}
