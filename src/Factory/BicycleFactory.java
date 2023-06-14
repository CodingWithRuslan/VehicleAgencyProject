package Factory;

import Graphic.GraphicMenus;
import Vehicle.Vehicle;

public class BicycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return GraphicMenus.scanBicycleGui();
    }
}
