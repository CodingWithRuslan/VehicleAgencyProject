
package Graphic;
       import Vehicle.ToyGlider;
        import Vehicle.Jeep;
        import Vehicle.SpyGlider;

        import javax.swing.ImageIcon;
        import javax.swing.JComboBox;
        import javax.swing.JLabel;
        import javax.swing.JOptionPane;
        import javax.swing.JPanel;
        import java.awt.*;

public class ToyGliderImageSelectionMenu {
    private static ImageIcon[] toyGliderImages = {new ImageIcon("src/Images/toyGlider1.png"),
            new ImageIcon("src/Images/toyGlider2.png"),
            new ImageIcon("src/Images/toyGlider3.png")};
    private static ImageIcon currentToyGliderImage = toyGliderImages[0];

    public static ImageIcon getImageIcon() {
        Object[] options = {toyGliderImages[0], toyGliderImages[1], toyGliderImages[2]};
        int selection = JOptionPane.showOptionDialog(null, "Select ToyGlider Image", "ToyGlider Image Selection",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        if (selection >= 0) {
            currentToyGliderImage = toyGliderImages[selection];
        }
        return currentToyGliderImage;
    }

    public static void showImageAndToString(ToyGlider toyGlider) {
        JLabel label = new JLabel(toyGlider.toString(), toyGlider.getImageIcon(), JLabel.CENTER);
        JOptionPane.showMessageDialog(null, label);
    }

}

