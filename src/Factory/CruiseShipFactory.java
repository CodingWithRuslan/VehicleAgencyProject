package Factory;

import Graphic.GraphicMenus;
import Vehicle.Vehicle;

public class CruiseShipFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return GraphicMenus.scanCruiseShipGui();
    }
}
