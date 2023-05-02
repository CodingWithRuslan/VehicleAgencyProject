package Vehicle;

import java.util.Objects;

public abstract class Vehicle {

    public void move(int distance){
        distanceTraveled+=distance;
    }
    protected String model;
    protected int distanceTraveled ;
    protected int numOfPassengers;
    protected int maxSpeed;

    public Vehicle() {
        this.model ="";
        this.distanceTraveled = 0;
        this.numOfPassengers = 0;
        this.maxSpeed = 0;
    }

    @Override
    public String toString() {
        return
                "Model: " + model +
                        ", traveled: " + distanceTraveled + " Km" +
                        ", Max speed of " + maxSpeed + " Mph" +
                        ", can carry max of " + numOfPassengers + " people."
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return distanceTraveled == vehicle.distanceTraveled && numOfPassengers == vehicle.numOfPassengers && maxSpeed == vehicle.maxSpeed && Objects.equals(model, vehicle.model);
    }

    public boolean equals2(Object o) { // check equals without comparing distance, because the distances changing, cause of people taking for test drives
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return numOfPassengers == vehicle.numOfPassengers && maxSpeed == vehicle.maxSpeed && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, distanceTraveled, numOfPassengers, maxSpeed);
    }

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

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }




}