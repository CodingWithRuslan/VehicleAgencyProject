
package Graphic;
        import Vehicle.AmphibiousVehicle;
        import Vehicle.ToyGlider;
        import Vehicle.Jeep;
        import Vehicle.SpyGlider;

        import javax.swing.ImageIcon;
        import javax.swing.JComboBox;
        import javax.swing.JLabel;
        import javax.swing.JOptionPane;
        import javax.swing.JPanel;
        import java.awt.*;


public class AmphibiousImageSelectionMenu {
    private static ImageIcon[] amphibiousImages = {new ImageIcon("src/Images/amphibious1.png"),
            new ImageIcon("src/Images/amphibious2.png"),
            new ImageIcon("src/Images/amphibious3.png")};
    private static ImageIcon currentAmphibiousImage = amphibiousImages[0];

    public static ImageIcon getImageIcon() {
        Object[] options = {amphibiousImages[0], amphibiousImages[1], amphibiousImages[2]};
        int selection = JOptionPane.showOptionDialog(null, "Select Amphibious Image", "Amphibious Image Selection",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        if (selection >= 0) {
            currentAmphibiousImage = amphibiousImages[selection];
        }
        return currentAmphibiousImage;
    }

    public static void showImageAndToString(AmphibiousVehicle amphibious) {
        JLabel label = new JLabel(amphibious.toString(), amphibious.getImageIcon(), JLabel.CENTER);
        JOptionPane.showMessageDialog(null, label);
    }

}

