package Vehicle;

public abstract class AirVehicle extends Vehicle{

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



    public void setMilitary(boolean military) {
        isMilitary = military;
    }
}