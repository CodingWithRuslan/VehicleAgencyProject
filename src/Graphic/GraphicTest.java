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
        Image imageJeep = imageIcon.getImage(); // transform it
        Image JeepImg = imageJeep.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(JeepImg);  // transform it back
        JButton jeepButton = new JButton(imageIcon);
        jeepButton.addActionListener(this);
        jeepButton.setActionCommand("Jeep");

        //Frigate button+image and rest needs to be done same as above^

        //Frigate button+image and rest needs to be done same as above^
        ImageIcon imageIconFrigate = new ImageIcon("src/Images/frigate.png"); // load the image to a imageIcon
        Image imageFrigate = imageIconFrigate.getImage();
        Image FrigateImg = imageFrigate.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconFrigate = new ImageIcon(FrigateImg);
        JButton frigateButton = new JButton(imageIconFrigate);
        frigateButton.addActionListener(this);
        frigateButton.setActionCommand("Frigate");

        //JButton addFrigateButton = new JButton("Add Frigate");

        // finish buttons below
        //JButton addSpyGliderButton = new JButton("Add SpyGlider");
        //
        ImageIcon imageIconSpyGlider = new ImageIcon("src/Images/spyGlider.png"); // load the image to a imageIcon
        Image imageSpyGlider = imageIconSpyGlider.getImage();
        Image SpyGliderImg = imageSpyGlider.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconSpyGlider = new ImageIcon(SpyGliderImg);
        JButton spyGliderButton = new JButton(imageIconSpyGlider);
        spyGliderButton.addActionListener(this);
        spyGliderButton.setActionCommand("SpyGlider");

        //JButton addGliderButton = new JButton("Add ToyGlider");
        //toyGlider
        ImageIcon imageIconToyGlider = new ImageIcon("src/Images/toyGlider.png"); // load the image to a imageIcon
        Image imageToyGlider = imageIconToyGlider.getImage();
        Image ToyGliderImg = imageToyGlider.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconToyGlider = new ImageIcon(ToyGliderImg);
        JButton toyGliderButton = new JButton(imageIconToyGlider);
        toyGliderButton.addActionListener(this);
        toyGliderButton.setActionCommand("ToyGlider");
        //

        //JButton addAmphibiousButton = new JButton("Add Amphibious");
        ImageIcon imageIconAmphibious = new ImageIcon("src/Images/amphibious.png"); // load the image to a imageIcon
        Image imageAmphibious = imageIconAmphibious.getImage();
        Image AmphibiousImg = imageAmphibious.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconAmphibious= new ImageIcon(AmphibiousImg);
        JButton amphibiousButton = new JButton(imageIconAmphibious);
        amphibiousButton.addActionListener(this);
        amphibiousButton.setActionCommand("Amphibious");


        //JButton addBicycleButton = new JButton("Add Bicycle");
        ImageIcon imageIconBicycle = new ImageIcon("src/Images/bicycle.png"); // load the image to a imageIcon
        Image imageBicycle = imageIconBicycle.getImage();
        Image BicycleImg = imageBicycle.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconBicycle= new ImageIcon(BicycleImg);
        JButton bicycleButton = new JButton(imageIconBicycle);
        bicycleButton.addActionListener(this);
        bicycleButton.setActionCommand("Bicycle");


        //JButton addCruiseShipButton = new JButton("Add CruiseShip");
        ImageIcon imageIconCruiseShip = new ImageIcon("src/Images/cruiseShip.png"); // load the image to a imageIcon
        Image imageCruiseShip = imageIconCruiseShip.getImage();
        Image CruiseShipImg = imageCruiseShip.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconCruiseShip= new ImageIcon(CruiseShipImg);
        JButton cruiseShipButton = new JButton(imageIconCruiseShip);
        cruiseShipButton.addActionListener(this);
        cruiseShipButton.setActionCommand("CruiseShip");

        //

        JButton addFinishTestButton = new JButton("Finish Test");
        addFinishTestButton.addActionListener(this);
        addFinishTestButton.setActionCommand("FinishTest");




        // Add the components to the GUI
        add(jeepButton);
        add(frigateButton);
        add(spyGliderButton);
        add(toyGliderButton);
        add(amphibiousButton);
        add(bicycleButton);
        add(cruiseShipButton);
        add(addFinishTestButton);

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
                GraphicMenus.testDriveFrigateGui();
                //
                break;
            case "SpyGlider":
                GraphicMenus.testDriveSpyGliderGui();
                //
                break;
            case "ToyGlider":
                GraphicMenus.testDriveToyGliderGui();
                //
                break;
            case "Amphibious":
                GraphicMenus.testDriveAmphibiousGui();
                //
                break;
            case "Bicycle":
                GraphicMenus.testDriveBicycleGui();
                //
                break;
            case "CruiseShip":
                GraphicMenus.testDriveCruiseShipGui();
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