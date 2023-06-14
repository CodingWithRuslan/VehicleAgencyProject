package Factory;

import Graphic.GraphicMenus;
import Vehicle.Vehicle;

public class ToyGliderFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return GraphicMenus.scanToyGliderGui();
    }
}
