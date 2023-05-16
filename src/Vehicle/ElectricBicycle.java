package Vehicle;

import javax.swing.*;
import java.util.Objects;

public class ElectricBicycle extends LandVehicle implements IMotorized{
    private ImageIcon image;
    private double avgFuelConsumption;

    public ImageIcon getImage() {
        return image;
    }
    public ImageIcon getElectricBicycleImageIcon() {
        return this.image;
    }
    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public double getAvgFuelConsumption() {
        return avgFuelConsumption;
    }

    public double getAvgEngineLifeSpan() {
        return avgEngineLifeSpan;
    }

    private double avgEngineLifeSpan;
    public ElectricBicycle(String model, int distanceTraveled, int numOfPassengers, int maxSpeed, boolean roadType,double avgEngineLifeSpan, ImageIcon image) {
        super();
        this.numOfWheels =2;
        this.model=model;
        this.distanceTraveled=distanceTraveled;
        this.numOfPassengers=numOfPassengers;
        this.maxSpeed=maxSpeed;
        this.roadType=roadType;
        this.avgFuelConsumption=20;
        this.avgEngineLifeSpan=avgEngineLifeSpan;
        this.image = image;
    }

    @Override
    public String toString() {
        return "ElectricBicycle{" + super.toString() +
                ", avgFuelConsumption=" + avgFuelConsumption +
                ", avgEngineLifeSpan=" + avgEngineLifeSpan +
                ",Image ElectricBicycle" +image +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectricBicycle that = (ElectricBicycle) o;
        return Double.compare(that.avgFuelConsumption, avgFuelConsumption) == 0 && Double.compare(that.avgEngineLifeSpan, avgEngineLifeSpan) == 0 && Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), image, avgFuelConsumption, avgEngineLifeSpan);
    }

    @Override
    public void setAvgFuelConsumption(double avgFuelConsumption) {

    }

    @Override
    public void setAvgEngineLifeSpan(double avgEngineLifeSpan) {

    }

    public ImageIcon getImageIcon() {
        return this.image;
    }


}
