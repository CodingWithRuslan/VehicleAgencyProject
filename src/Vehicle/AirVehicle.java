package Vehicle;

//Air vehicles have: updating / receiving the information what is the use of the vehicle (military or civilian)

public abstract class AirVehicle extends Vehicle {
    protected boolean isMilitary; // true = military ,  false = civilian

    public AirVehicle(String model, int maxPassengers, int maxSpeed) {
        super(model, maxPassengers, maxSpeed);
        this.isMilitary = false;
    }

    // receiving the information what is the use of the vehicle, true = military ,  false = civilian
    public boolean isMilitary() {
        return isMilitary;
    }

    // setting the information what is the use of the vehicle, true = military ,  false = civilian
    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    //abstract method fly() because flying is a unique behavior of air vehicles that is not applicable to marine or land vehicles.

    public abstract void fly();
    // Any additional methods or variables can be added here.
}
