package Factory;

import Graphic.GraphicMenus;
import Vehicle.Vehicle;

public class ElectricBicycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return GraphicMenus.scanElectricBicycleGui();
    }
}
