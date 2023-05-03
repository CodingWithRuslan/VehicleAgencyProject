package Graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicTest extends JFrame implements ActionListener {
    //private JButton jeepButton;
    public GraphicTest() {
        // Set up the Third Menu (BUY)
        setTitle("Vehicle Agency - Test Vehicles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new GridLayout(2, 4));

        //Jeep button+image
        ImageIcon imageIcon = new ImageIcon("src/Images/jeep.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image JeepImg = image.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(JeepImg);  // transform it back
        JButton jeepButton = new JButton(imageIcon);
        jeepButton.addActionListener(this);
        jeepButton.setActionCommand("Jeep");

        //Frigate button+image and rest needs to be done same as above^
        JButton addFrigateButton = new JButton("Test Frigate");
        JButton addSpyGliderButton = new JButton("Test SpyGlider");
        JButton addGliderButton = new JButton("Test ToyGlider");
        JButton addAmphibiousVehicleButton = new JButton("Test Amphibious");
        JButton addBicycleButton = new JButton("Test Bicycle");
        JButton addCruiseShipButton = new JButton("Test CruiseShip");

        JButton addFinishBuyingButton = new JButton("Finish Test");
        addFinishBuyingButton.addActionListener(this);
        addFinishBuyingButton.setActionCommand("FinishTest");




        // Add the components to the GUI
        add(jeepButton);
        add(addFrigateButton);
        add(addSpyGliderButton);
        add(addGliderButton);
        add(addAmphibiousVehicleButton);
        add(addBicycleButton);
        add(addCruiseShipButton);
        add(addFinishBuyingButton);

        // Make the window visible
        setVisible(true);
    }


    public static void main(String[] args) {
        new GraphicTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GraphicMenus.printAllVehiclesGuiPop();

        String command = e.getActionCommand();
        //boolean exit = true;
        //while (exit) {


        // Execute the appropriate action based on the button clicked
        switch (command) {
            case "Jeep":
                GraphicMenus.testDriveJeepGui();
                break;

            case "Frigate":
                //
                break;


            //Rest of Cases


            case "FinishTest":
                System.out.println("close menu4");
                dispose(); // closes this JFrame
                System.out.println("closedd");
                break;
            default:
                break;
        }


    }

}