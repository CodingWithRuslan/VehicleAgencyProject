package Vehicle;

import java.util.Objects;

public abstract class LandVehicle extends Vehicle {

    protected int numOfWheels;
    protected boolean roadType; // true = pavement . false=dirt

    public LandVehicle() {
        super();
        this.numOfWheels=0;
        this.roadType=false;
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
}