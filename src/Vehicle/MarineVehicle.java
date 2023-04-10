package Vehicle;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MarineVehicle that)) return false;
        if (!super.equals(o)) return false;
        return getSailWindDirection() == that.getSailWindDirection() && Objects.equals(getCountryFlag(), that.getCountryFlag());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSailWindDirection(), getCountryFlag());
    }
}