package Factory;
import Graphic.GraphicMenus;
import Vehicle.Vehicle;
public class FrigateFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return GraphicMenus.scanFrigateGui();
    }
}