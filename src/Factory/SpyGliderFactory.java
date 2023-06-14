package Factory;
import Graphic.GraphicMenus;
import Vehicle.Vehicle;
public class SpyGliderFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return GraphicMenus.scanSpyGliderGui();
    }
}
