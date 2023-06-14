package Factory;

import Graphic.GraphicMenus;
import Vehicle.Vehicle;

public class AmphibiousVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return GraphicMenus.scanAmphibiousGui();
    }
}
