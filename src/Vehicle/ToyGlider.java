package Vehicle;

import javax.swing.*;
import java.util.Objects;

public class ToyGlider extends AirVehicle implements INonMotorized {
    private String powerSource;
    private char energyScore; // A/B/C

    private ImageIcon image;
    public ToyGlider(int distanceTraveled, ImageIcon image) {
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
        this.image = image;
    }

    @Override
    public String toString() {
        return "ToyGlider{" +
                super.toString() +
                ", Power Source= " + powerSource +
                ", Energy Score= " + energyScore  +
                ",Image Jeep" +image +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToyGlider toyGlider)) return false;
        if (!super.equals(o)) return false;
        return energyScore == toyGlider.energyScore && Objects.equals(powerSource, toyGlider.powerSource);
    }

    // check equals without comparing distance, because the distances changing, cause of people taking for test drives
    public boolean equals2(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToyGlider toyGlider)) return false;
        if (!super.equals(o)) return false;
        return energyScore == toyGlider.energyScore && Objects.equals(powerSource, toyGlider.powerSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerSource, energyScore);
    }

    @Override
    public void setPowerSource(String powerSource) { this.powerSource = powerSource; }

    @Override
    public void setEnergyScore(char energyScore) { this.energyScore = energyScore; }

    public String getPowerSource() { return powerSource; }

    public char getEnergyScore() { return energyScore; }

    public ImageIcon getImageIcon() {
        return this.image;
    }

    public ImageIcon getToyGliderImageIcon() {
        return this.image;
    }
}