package Graphic;

import Vehicle.Jeep;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;

public class JeepImageSelectionMenu {
    private static ImageIcon[] jeepImages = {new ImageIcon("src/Images/jeep1.png"),
            new ImageIcon("src/Images/jeep2.png"),
            new ImageIcon("src/Images/jeep3.png")};
    private static ImageIcon currentJeepImage = jeepImages[0];

    public static ImageIcon getImageIcon() {
        Object[] options = {jeepImages[0], jeepImages[1], jeepImages[2]};
        int selection = JOptionPane.showOptionDialog(null, "Select Jeep Image", "Jeep Image Selection",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        if (selection >= 0) {
            currentJeepImage = jeepImages[selection];
        }
        return currentJeepImage;
    }

    public static void showImageAndToString(Jeep jeep) {
        JLabel label = new JLabel(jeep.toString(), jeep.getImageIcon(), JLabel.CENTER);
        JOptionPane.showMessageDialog(null, label);
    }

}
