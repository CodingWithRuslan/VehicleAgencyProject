package Vehicle;

import java.util.Objects;

public class ToyGlider extends AirVehicle implements INonMotorized {
    private String powerSource;
    private char energyScore; // A/B/C
    public ToyGlider(int distanceTraveled) {
        super();
        // ToyGlider details that cannot be changed:
        this.isMilitary = false;
        this.numOfPassengers = 0;
        this.model = "Toy";
        this.maxSpeed = 10;
        this.energyScore = 'A';
        this.powerSource = "Manual";

        // ToyGlider details entered by user:
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public String toString() {
        return "ToyGlider{" +
                super.toString() +
                ", Power Source= " + powerSource +
                ", Energy Score= " + energyScore +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToyGlider toyGlider = (ToyGlider) o;
        return energyScore == toyGlider.energyScore && Objects.equals(powerSource, toyGlider.powerSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerSource, energyScore);
    }

    @Override
    public void setPowerSource(String powerSource) {

    }

    @Override
    public void setEnergyScore(char energyScore) {

    }
}