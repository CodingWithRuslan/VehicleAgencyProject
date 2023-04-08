package Vehicle;

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

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public void setRoadType(boolean roadType) {
        this.roadType = roadType;
    }
}