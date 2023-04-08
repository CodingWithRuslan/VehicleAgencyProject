package Vehicle;
/*
Marine Vehicle have: updating / accepting whether it is sailing with the direction of the wind as well as updating / accepting under the flag of which country it is sailing.
* */

public abstract class MarineVehicle extends Vehicle {
    protected boolean sailingWithWind; // it is sailing with the direction of the wind  ? true=with . false=against
    protected String countryFlag; // under the flag of which country it is sailing.

    public MarineVehicle(String model, int maxPassengers, int maxSpeed) {
        super(model, maxPassengers, maxSpeed);
        this.sailingWithWind = false;
        this.countryFlag = "";
    }

    //updating whether it is sailing with the direction of the wind
    public void setSailingWithWind(boolean sailingWithWind) {
        this.sailingWithWind = sailingWithWind;
    }

    // check if it is sailing with the direction of the wind
    public boolean isSailingWithWind() {
        return sailingWithWind;
    }

    //get the flag of which country it is sailing.
    public String getCountryFlag() {
        return countryFlag;
    }

    //set the flag of which country it is sailing.
    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    //abstract method sail() because sailing is a unique behavior of marine vehicles and each vehicle can implement it different.
    public abstract void sail();

    // Any additional methods or variables can be added here.

}
