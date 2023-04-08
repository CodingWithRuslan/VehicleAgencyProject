package Vehicle;

//Land vehicles have to receive a number of wheels, receive information on the type of road on which the vehicle can move (pavement, dirt)
    public abstract class LandVehicle extends Vehicle {
    protected int numberOfWheels;
    protected boolean roadType; // true = pavement . false=dirt

    public LandVehicle(String model, int maxPassengers, int maxSpeed, int numberOfWheels) {
        super(model, maxPassengers, maxSpeed);
        this.numberOfWheels = numberOfWheels;
        this.roadType = false;
    }

    // get NumberOfWheels for LandVehicle
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // set NumberOfWheels for LandVehicle
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    //receive information on the type of road on which the vehicle can move (pavement, dirt), true = pavement . false=dirt
    public boolean isRoadType() {
        return roadType;
    }

    //set information on the type of road on which the vehicle can move (pavement, dirt), true = pavement . false=dirt
    public void setRoadType(boolean roadType) {
        this.roadType = roadType;
    }

    ////abstract method drive() because driving is a unique behavior of land vehicles
    public abstract void drive();

}
