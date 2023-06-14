package Factory;

import Graphic.GraphicMenus;
import Vehicle.Vehicle;

public class HybridAircraftFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return GraphicMenus.scanHybridAircraftGui();
    }
}
