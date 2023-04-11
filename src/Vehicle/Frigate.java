package Vehicle;
import java.util.*;

public class Frigate extends MarineVehicle implements IMotorized{

    private double avgFuelConsumption;
    private double avgEngineLifeSpan;

    public Frigate(String model, int numOfPassengers, int maxSpeed, boolean sailWindDirection, int distanceTraveled ) {
        super();
        //all below const for frigate
        this.avgEngineLifeSpan = 4;
        this.avgFuelConsumption = 500;
        this.countryFlag="israel";
        //all below are from user input
        this.model=model;
        this.numOfPassengers=numOfPassengers;
        this.maxSpeed=maxSpeed;
        this.sailWindDirection=sailWindDirection;
        this.distanceTraveled=distanceTraveled;
    }

   /* @Override
    public String toString() {
        String flagBool;
        if (this.sailWindDirection=true) { // with
            flagBool="with";
        }
        else // against
            flagBool="against";
        return "Frigate{" +
                ", Model: '" + model + '\'' +
                ", traveled: " + distanceTraveled + " Km" +
                ", Max speed of " + maxSpeed + " Mph" +
                ", can carry max of " + numOfPassengers + " people." +
                " Under " + countryFlag + " flag" +
                ", " + flagBool + " the wind. " +
                "Engine: " + avgFuelCons + "L" +
                ", lifetime of " + engineLifeSpan + " Years." +
                '}';
    } */

    @Override
    public String toString() {
        return  super.toString() +
                "Engine: " + avgFuelConsumption + "L" +
                ", lifetime of = " + avgEngineLifeSpan + " years. " +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Frigate frigate)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(frigate.avgFuelConsumption, avgFuelConsumption) == 0 && Double.compare(frigate.avgEngineLifeSpan, avgEngineLifeSpan) == 0;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(avgFuelConsumption, avgEngineLifeSpan);
    }

    @Override
    public void setAvgFuelConsumption(double avgFuelConsumption) {
        this.avgFuelConsumption=avgFuelConsumption;
    }

    @Override
    public void setAvgEngineLifeSpan(double avgEngineLifeSpan) {
        this.avgEngineLifeSpan=avgEngineLifeSpan;
    }
}