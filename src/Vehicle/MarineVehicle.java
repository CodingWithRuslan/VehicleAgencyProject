package Vehicle;

public abstract class MarineVehicle extends Vehicle{

    protected boolean sailWindDirection; //true=with . false=against
    protected String countryFlag;

    public MarineVehicle() {
        super();
        this.sailWindDirection=false;
        this.countryFlag="";
    }

    public boolean getSailWindDirection() {
        return sailWindDirection;
    }

    public void setSailWindDirection(boolean sailWindDirection) {
        this.sailWindDirection = sailWindDirection;
    }

    public String getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    public String toString() {
        String flagBool="";
        if (this.sailWindDirection == true) { // with
            flagBool="with";
        }
        else
            flagBool="against";
        return "Frigate{" +
                super.toString() +
                " Under " + countryFlag + " flag" +
                ", " + flagBool + " the wind. ";
    }

}