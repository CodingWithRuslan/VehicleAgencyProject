package Vehicle;
/*
Marine Vehicle have: updating / accepting whether it is sailing with the direction of the wind as well as updating / accepting under the flag of which country it is sailing.
* */

public abstract class MarineVehicle extends Vehicle {
    protected boolean sailingWithWind; // it is sailing with the direction of the wind  ? true=with . false=against
    private String countryFlag; // under the flag of which country it is sailing.

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




}
