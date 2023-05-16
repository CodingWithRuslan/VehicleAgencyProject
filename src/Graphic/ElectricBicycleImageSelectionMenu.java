package Graphic;

import Vehicle.ElectricBicycle;
import Vehicle.Frigate;
import Vehicle.Jeep;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;

public class ElectricBicycleImageSelectionMenu {
    private static ImageIcon[] electricbicycleImages = {new ImageIcon("src/Images/electricbicycle1.png"),
            new ImageIcon("src/Images/electricbicycle2.png"),
            new ImageIcon("src/Images/electricbicycle3.png")};
    private static ImageIcon currentElectricBicycleImage = electricbicycleImages[0];

    public static ImageIcon getImageIcon() {
        Object[] options = {electricbicycleImages[0], electricbicycleImages[1], electricbicycleImages[2]};
        int selection = JOptionPane.showOptionDialog(null, "Select ElectricBicycle Image", "ElectricBicycle Image Selection",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        if (selection >= 0) {
            currentElectricBicycleImage = electricbicycleImages[selection];
        }
        return currentElectricBicycleImage;
    }

    public static void showImageAndToString(ElectricBicycle electricBicycle) {
        JLabel label = new JLabel(electricBicycle.toString(), electricBicycle.getImageIcon(), JLabel.CENTER);
        JOptionPane.showMessageDialog(null, label);
    }
}
