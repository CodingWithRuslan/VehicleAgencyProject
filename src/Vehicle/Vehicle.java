package Vehicle;

public abstract class Vehicle {
    protected String model; // the name of the vehicle model.
    protected int distanceTraveled; // the distance the vehicle has traveled in its lifetime.
    protected int maxPassengers; //  the maximum number of passengers in the vehicle.
    protected int maxSpeed; // the maximum speed of the vehicle.

    public Vehicle(String model, int maxPassengers, int maxSpeed) {
        this.model = model;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.distanceTraveled = 0; // Note that a vehicle starts with distance traveled = 0.
    }

    //All vehicles have: the ability to move (gets the distance the vehicle has traveled and updates it accordingly)
    public void move(int distance) {
        this.distanceTraveled += distance;
    }

    //we need to add get and set for each data member of abstract class Vehicle so we can get and update them.
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}

