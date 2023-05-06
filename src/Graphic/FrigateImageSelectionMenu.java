package Graphic;

import Vehicle.Frigate;
import Vehicle.Jeep;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;

public class FrigateImageSelectionMenu {
    private static ImageIcon[] frigateImages = {new ImageIcon("src/Images/frigate1.png"),
            new ImageIcon("src/Images/frigate2.png"),
            new ImageIcon("src/Images/frigate3.png")};
    private static ImageIcon currentFrigateImage = frigateImages[0];

    public static ImageIcon getImageIcon() {
        Object[] options = {frigateImages[0], frigateImages[1], frigateImages[2]};
        int selection = JOptionPane.showOptionDialog(null, "Select Frigate Image", "Frigate Image Selection",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        if (selection >= 0) {
            currentFrigateImage = frigateImages[selection];
        }
        return currentFrigateImage;
    }

    public static void showImageAndToString(Frigate frigate) {
        JLabel label = new JLabel(frigate.toString(), frigate.getImageIcon(), JLabel.CENTER);
        JOptionPane.showMessageDialog(null, label);
    }

}
