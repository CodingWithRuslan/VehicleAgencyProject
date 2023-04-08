package Vehicle;

public abstract class Vehicle {

    protected void move(int distance){
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