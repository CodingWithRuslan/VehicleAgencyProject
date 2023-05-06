package Graphic;

import Vehicle.Jeep;
import Vehicle.SpyGlider;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;

public class SpyGliderImageSelectionMenu {
    private static ImageIcon[] spyGliderImages = {new ImageIcon("src/Images/spyGlider1.png"),
            new ImageIcon("src/Images/spyGlider2.png"),
            new ImageIcon("src/Images/spyGlider3.png")};
    private static ImageIcon currentSpyGliderImage = spyGliderImages[0];

    public static ImageIcon getImageIcon() {
        Object[] options = {spyGliderImages[0], spyGliderImages[1], spyGliderImages[2]};
        int selection = JOptionPane.showOptionDialog(null, "Select SpyGlider Image", "SpyGlider Image Selection",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        if (selection >= 0) {
            currentSpyGliderImage = spyGliderImages[selection];
        }
        return currentSpyGliderImage;
    }

    public static void showImageAndToString(SpyGlider spyGlider) {
        JLabel label = new JLabel(spyGlider.toString(), spyGlider.getImageIcon(), JLabel.CENTER);
        JOptionPane.showMessageDialog(null, label);
    }

}
