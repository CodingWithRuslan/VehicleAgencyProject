package Vehicle;

public abstract class Vehicle {
    protected String model; // the name of the vehicle model.
    protected int distanceTraveled; // the distance the vehicle has traveled in its lifetime.
    protected int maxPassengers; //  the maximum number of passengers in the vehicle.
    protected int maxSpeed; // the maximum speed of the vehicle.

    // Constructor for Vehicle class
    public Vehicle(String model, int maxPassengers, int maxSpeed) {
        this.model = model;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.distanceTraveled = 0; // Note that a vehicle starts with distance traveled = 0.
    }

    //check
    // Moves the vehicle a certain distance
    public void move(int distance) {
        this.distanceTraveled += distance;
    }


    // Returns the name of the vehicle model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Returns the total distance the vehicle has traveled in its lifetime
    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    // Returns the maximum number of passengers the vehicle can accommodate
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    // Returns the maximum speed of the vehicle
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // toString method to return a string representation of the object
    // Includes name of the model and distance traveled
    @Override
    public String toString() {
        return "Model: " + model + ", Distance Traveled: " + distanceTraveled;
    }


}

