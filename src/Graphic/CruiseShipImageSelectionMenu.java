
package Graphic;

        import Vehicle.CruiseShip;
        import Vehicle.Frigate;
        import Vehicle.Jeep;

        import javax.swing.ImageIcon;
        import javax.swing.JComboBox;
        import javax.swing.JLabel;
        import javax.swing.JOptionPane;
        import javax.swing.JPanel;
        import java.awt.*;

public class CruiseShipImageSelectionMenu {
    private static ImageIcon[] cruiseShipImages = {new ImageIcon("src/Images/cruiseShip1.png"),
            new ImageIcon("src/Images/cruiseShip2.png"),
            new ImageIcon("src/Images/cruiseShip3.png")};
    private static ImageIcon currentCruiseShipImage = cruiseShipImages[0];

    public static ImageIcon getImageIcon() {
        Object[] options = {cruiseShipImages[0], cruiseShipImages[1], cruiseShipImages[2]};
        int selection = JOptionPane.showOptionDialog(null, "Select CruiseShip Image", "CruiseShip Image Selection",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        if (selection >= 0) {
            currentCruiseShipImage = cruiseShipImages[selection];
        }
        return currentCruiseShipImage;
    }

    public static void showImageAndToString(CruiseShip cruiseShip) {
        JLabel label = new JLabel(cruiseShip.toString(), cruiseShip.getImageIcon(), JLabel.CENTER);
        JOptionPane.showMessageDialog(null, label);
    }

}
