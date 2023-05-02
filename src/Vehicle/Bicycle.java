package Vehicle;

import java.util.Objects;

public class Bicycle extends LandVehicle implements INonMotorized{

    private String powerSource;
    private char energyScore; // A/B/C

    public Bicycle(String model, int distanceTraveled, int numOfPassengers, int maxSpeed, boolean roadType) {
        super();
        this.numOfWheels =2;
        this.energyScore='A';
        this.powerSource="Manual";
        this.model=model;
        this.distanceTraveled=distanceTraveled;
        this.numOfPassengers=numOfPassengers;
        this.maxSpeed=maxSpeed;
        this.roadType=roadType;
    }

    @Override
    public void setPowerSource(String powerSource) {

    }

    @Override
    public void setEnergyScore(char energyScore) {

    }

    @Override
    public String toString() {
        return "Bicycle{" + super.toString() +
                ", Power Source=" + powerSource +
                ", Energy Score=" + energyScore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bicycle bicycle)) return false;
        if (!super.equals(o)) return false;
        return energyScore == bicycle.energyScore && Objects.equals(powerSource, bicycle.powerSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerSource, energyScore);
    }
}