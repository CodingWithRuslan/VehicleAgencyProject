package Factory;
import Graphic.GraphicMenus;
import Vehicle.Vehicle;
public class JeepFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return GraphicMenus.scanJeepGui();
    }
}
