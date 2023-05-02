package Vehicle;

import java.util.Objects;

public class AirVehicle extends Vehicle{

    boolean isMilitary; // true = military ,  false = civilian

    public AirVehicle() {
        super();
        this.isMilitary = false;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", isMilitary=" + isMilitary

                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirVehicle that)) return false;
        if (!super.equals(o)) return false;
        return isMilitary() == that.isMilitary();
    }

    public boolean equals2(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirVehicle that)) return false;
        if (!super.equals(o)) return false;
        return isMilitary() == that.isMilitary();
    }
    // check equals without comparing distance, because the distances changing, cause of people taking for test drives

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isMilitary());
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }
}