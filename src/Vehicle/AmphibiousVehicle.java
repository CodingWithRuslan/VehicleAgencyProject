package Vehicle;

import javax.swing.*;
import java.util.Objects;

public class AmphibiousVehicle extends Vehicle implements IMotorized{

    LandVehicle landVehicle;
    MarineVehicle marineVehicle;
    /** The Fuel avg. */
    private double avgFuelConsumption;
    /** The AvgLifeSpan **/
    private double avgEngineLifeSpan;

    private ImageIcon image;

    //Vehicle+MarineVehicle+LandVehicle:
    // super: model, distanceTraveled , numOfPassengers , maxSpeed
    // Marine: sailWindDirection, countryFlag
    // Land: numOfWheels, roadType
    public AmphibiousVehicle(String model, int distanceTraveled , int numOfPassengers , int maxSpeed,double avgFuelConsumption, double avgEngineLifeSpan, int numOfWheels, boolean sailWindDirection, String countryFlag, ImageIcon image) {
        // AmphibiousVehicle details that cannot be changed:  Paved
        // AmphibiousVehicle details entered by user: model type, average fuel consumption, max speed, average life of the engine.
        super();
        this.model=model;
        this.distanceTraveled=distanceTraveled;
        this.numOfPassengers=numOfPassengers;
        this.maxSpeed=maxSpeed;
        this.avgFuelConsumption=avgFuelConsumption;
        this.avgEngineLifeSpan=avgEngineLifeSpan;
        this.image = image;
        landVehicle = new LandVehicle(numOfWheels); //this.roadType =true; // will be in constructor // // true = paved
        marineVehicle = new MarineVehicle(sailWindDirection, countryFlag);
    }


    @Override
    public void setAvgFuelConsumption(double avgFuelConsumption) { this.avgFuelConsumption=avgFuelConsumption; }

    @Override
    public void setAvgEngineLifeSpan(double avgEngineLifeSpan) { this.avgEngineLifeSpan=avgEngineLifeSpan; }

    public double getAvgFuelConsumption() { return avgFuelConsumption; }

    public double getAvgEngineLifeSpan() { return avgEngineLifeSpan; }


    @Override
    public String toString() {
        String flagBool="";
        if (marineVehicle.getSailWindDirection() == true) { // with
            flagBool="with";
        }
        else
            flagBool="against";
        return  "Amphibious{" + super.toString() +
                " Engine: " + avgFuelConsumption + "L" +
                ", lifetime of = " + avgEngineLifeSpan + " years. " +
                "Number of wheels=" + landVehicle.getNumOfWheels() +
                ", Road Type=" + "pavement. " +
                " Under " + marineVehicle.getCountryFlag() + " flag" +
                ", " + flagBool + " the wind. "  +
                ",Image Amphibious" +image +
                '}';
        // Marine: sailWindDirection, countryFlag
        // Land: numOfWheels, roadType
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AmphibiousVehicle that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(that.getAvgFuelConsumption(), getAvgFuelConsumption()) == 0 && Double.compare(that.getAvgEngineLifeSpan(), getAvgEngineLifeSpan()) == 0 && Objects.equals(landVehicle, that.landVehicle) && Objects.equals(marineVehicle, that.marineVehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), landVehicle, marineVehicle, getAvgFuelConsumption(), getAvgEngineLifeSpan());
    }

    public ImageIcon getImageIcon() {
        return this.image;
    }

    public ImageIcon getAmphibiousVehicleImageIcon() {
        return this.image;
    }

}