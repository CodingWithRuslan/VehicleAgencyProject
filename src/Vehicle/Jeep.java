package Vehicle;

import java.util.Objects;

public class Jeep extends LandVehicle implements IMotorized, ICommercial {
    private String typeOfLicense;
    private double avgFuelConsumption;
    private double avgEngineLifeSpan;


    public Jeep(String model, double avgFuelConsumption, int maxSpeed, double avgEngineLifeSpan) {
        super();
        // Jeep details that cannot be changed: Land, Motor, 4Wheels, 5PPl, Dirt
        this.numOfWheels=4;
        this.numOfPassengers=5;
        this.roadType =false; // // false = dirt
        this.typeOfLicense="MINI"; // because the license is always MINI (by the #1 exercise rules)

        // Jeep details entered by user: model type, average fuel consumption, max speed, average life of the engine.
        this.model=model;
        this.avgFuelConsumption=avgFuelConsumption;
        this.maxSpeed=maxSpeed;
        this.avgEngineLifeSpan=avgEngineLifeSpan;
    }


    @Override
    public String toString() {
        String ourRoadType;
        if (this.roadType==true) {
            ourRoadType="pavement";
        }
        else
            ourRoadType="dirt";
        return "Jeep{" + super.toString() +
                ", typeOfLicense=" + typeOfLicense +
                ", avgFuelConsumption=" + avgFuelConsumption +
                ", avgEngineLifeSpan=" + avgEngineLifeSpan +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jeep jeep = (Jeep) o;
        return Double.compare(jeep.avgFuelConsumption, avgFuelConsumption) == 0 && Double.compare(jeep.avgEngineLifeSpan, avgEngineLifeSpan) == 0 && Objects.equals(typeOfLicense, jeep.typeOfLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfLicense, avgFuelConsumption, avgEngineLifeSpan);
    }

    @Override
    public void setTypeOfLicense(String typeOfLicense) {
        this.typeOfLicense=typeOfLicense;
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