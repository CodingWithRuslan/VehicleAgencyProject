package Graphic;

import Vehicle.ElectricBicycle;
import Vehicle.HybridAircraft;
import Vehicle.Frigate;
import Vehicle.Jeep;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;
public class HybridAircraftImageSelectionMenu {
    private static ImageIcon[] hybridaircraftImages = {new ImageIcon("src/Images/hybridaircraft1.png"),
            new ImageIcon("src/Images/hybridaircraft2.png"),
            new ImageIcon("src/Images/hybridaircraft3.png")};
    private static ImageIcon currentHybridAircraftImage = hybridaircraftImages[0];

    public static ImageIcon getImageIcon() {
        Object[] options = {hybridaircraftImages[0], hybridaircraftImages[1], hybridaircraftImages[2]};
        int selection = JOptionPane.showOptionDialog(null, "Select HybridAircraft Image", "HybridAircraft Image Selection",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        if (selection >= 0) {
            currentHybridAircraftImage = hybridaircraftImages[selection];
        }
        return currentHybridAircraftImage;
    }

    public static void showImageAndToString(HybridAircraft hybridAircraft) {
        JLabel label = new JLabel(hybridAircraft.toString(), hybridAircraft.getImageIcon(), JLabel.CENTER);
        JOptionPane.showMessageDialog(null, label);
    }
}
