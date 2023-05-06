
package Graphic;

        import Vehicle.Bicycle;
        import Vehicle.Frigate;
        import Vehicle.Jeep;

        import javax.swing.ImageIcon;
        import javax.swing.JComboBox;
        import javax.swing.JLabel;
        import javax.swing.JOptionPane;
        import javax.swing.JPanel;
        import java.awt.*;

public class BicycleImageSelectionMenu {
    private static ImageIcon[] bicycleImages = {new ImageIcon("src/Images/bicycle1.png"),
            new ImageIcon("src/Images/bicycle2.png"),
            new ImageIcon("src/Images/bicycle3.png")};
    private static ImageIcon currentBicycleImage = bicycleImages[0];

    public static ImageIcon getImageIcon() {
        Object[] options = {bicycleImages[0], bicycleImages[1], bicycleImages[2]};
        int selection = JOptionPane.showOptionDialog(null, "Select Bicycle Image", "Bicycle Image Selection",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        if (selection >= 0) {
            currentBicycleImage = bicycleImages[selection];
        }
        return currentBicycleImage;
    }

    public static void showImageAndToString(Bicycle bicycle) {
        JLabel label = new JLabel(bicycle.toString(), bicycle.getImageIcon(), JLabel.CENTER);
        JOptionPane.showMessageDialog(null, label);
    }

}
