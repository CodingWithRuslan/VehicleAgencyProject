package Vehicle;

import javax.swing.*;
import java.util.Objects;

public class HybridAircraft extends Vehicle implements IMotorized     {
    AirVehicle airVehicle;
    LandVehicle landVehicle;
    MarineVehicle marineVehicle;
    /** The Fuel avg. */
    private double avgFuelConsumption;
    /** The AvgLifeSpan **/
    private double avgEngineLifeSpan;

    private String powerSource;
    private char energyScore; // A/B/C

    public double getAvgFuelConsumption() {
        return avgFuelConsumption;
    }

    public double getAvgEngineLifeSpan() {
        return avgEngineLifeSpan;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public char getEnergyScore() {
        return energyScore;
    }

    public void setEnergyScore(char energyScore) {
        this.energyScore = energyScore;
    }

    public ImageIcon getHybridAircraftImageIcon() {
        return this.image;
    }

    public ImageIcon getImageIcon() {
        return this.image;
    }
    public void setImage(ImageIcon image) {
        this.image = image;
    }

    private ImageIcon image;

    public HybridAircraft(String model, int distanceTraveled , int numOfPassengers , int maxSpeed,double avgFuelConsumption, double avgEngineLifeSpan, int numOfWheels, boolean sailWindDirection, String countryFlag,String powerSource,char energyScore, ImageIcon image){
        super();
        this.model=model;
        this.distanceTraveled=distanceTraveled;
        this.numOfPassengers=numOfPassengers;
        this.maxSpeed=maxSpeed;
        this.avgFuelConsumption=avgFuelConsumption;
        this.avgEngineLifeSpan=avgEngineLifeSpan;
        this.powerSource = powerSource;
        this.energyScore= energyScore;
        this.image = image;
        landVehicle = new LandVehicle(numOfWheels); //this.roadType =true; // will be in constructor // // true = paved
        marineVehicle = new MarineVehicle(sailWindDirection, countryFlag);
        airVehicle = new AirVehicle(true);
    }

    @Override
        public String toString() {
            String flagBool="";
            //  this.isMilitary = true;
            String militaryBool="";
            if (marineVehicle.getSailWindDirection() == true) { // with
                flagBool="with";
            }
            else
                flagBool="against";
        if (airVehicle.getisMilitary() == true) { // with
            militaryBool="Yes";
        }
        else
            militaryBool="NOT";

            return  "HybridAircraft{" + super.toString() +
                    " Engine: " + avgFuelConsumption + "L" +
                    ", lifetime of = " + avgEngineLifeSpan + " years. " +
                    "Number of wheels=" + landVehicle.getNumOfWheels() +
                    ", Road Type=" + "pavement. " +
                    " Under " + marineVehicle.getCountryFlag() + " flag" +
                    ", " + flagBool + " the wind. "  +
                    ", " + militaryBool + " Military. "  +
                    ",Image HybridAircraft" +image +
                    '}';
            // Marine: sailWindDirection, countryFlag
            // Land: numOfWheels, roadType
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HybridAircraft that = (HybridAircraft) o;
        return Double.compare(that.avgFuelConsumption, avgFuelConsumption) == 0 && Double.compare(that.avgEngineLifeSpan, avgEngineLifeSpan) == 0 && energyScore == that.energyScore && Objects.equals(airVehicle, that.airVehicle) && Objects.equals(landVehicle, that.landVehicle) && Objects.equals(marineVehicle, that.marineVehicle) && Objects.equals(powerSource, that.powerSource) && Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), airVehicle, landVehicle, marineVehicle, avgFuelConsumption, avgEngineLifeSpan, powerSource, energyScore, image);
    }

    @Override
    public void setAvgFuelConsumption(double avgFuelConsumption) {

    }

    @Override
    public void setAvgEngineLifeSpan(double avgEngineLifeSpan) {


    }
}
