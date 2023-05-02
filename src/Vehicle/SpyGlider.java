package Vehicle;

import java.util.Objects;

public class SpyGlider extends AirVehicle implements INonMotorized {
    private String powerSource;
    private char energyScore; // A/B/C

    public SpyGlider(String powerSource, int distanceTraveled) {
        super();
        // SpyGlider details that cannot be changed:
        this.isMilitary = true;
        this.model = "Confidential";
        this.numOfPassengers = 1;
        this.maxSpeed = 50;
        this.energyScore = 'C';

        // SpyGlider details entered by user:
        this.powerSource = powerSource;
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public String toString() {
        return "SpyGlider{ " +
                super.toString() +
                ", Power Source=" + powerSource +
                ", Energy Score=" + energyScore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpyGlider spyGlider)) return false;
        if (!super.equals(o)) return false;
        return getEnergyScore() == spyGlider.getEnergyScore() && Objects.equals(getPowerSource(), spyGlider.getPowerSource());
    }

    // check equals without comparing distance, because the distances changing, cause of people taking for test drives
    public boolean equals2(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpyGlider spyGlider)) return false;
        if (!super.equals(o)) return false;
        return getEnergyScore() == spyGlider.getEnergyScore() && Objects.equals(getPowerSource(), spyGlider.getPowerSource());
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerSource, energyScore);
    }

    public String getPowerSource() {
        return powerSource;
    }

    public char getEnergyScore() {
        return energyScore;
    }

    @Override
    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    @Override
    public void setEnergyScore(char energyScore) {
        this.energyScore = energyScore;
    }



}