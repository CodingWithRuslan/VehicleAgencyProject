/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyEventWindow extends JFrame {
    private final JLabel lbPrompt;
    private final JTextField tbPrompt;
    public MyEventWindow() {
        super("Nice Title");
        JButton btOk = new JButton("Ok");
        btOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbPrompt.setText(tbPrompt.getText() + ", Prompt:");
            }
        });
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.add(lbPrompt = new JLabel("Prompt:"));
        this.add(tbPrompt = new JTextField());
        this.add(btOk);
        this.pack();
        this.setVisible(true);
    }
    public static void main(String[] args) {
        MyEventWindow window = new MyEventWindow();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}*/
package Graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import System.Menus;


import static System.Main.Agency;
import static System.Main.amountOfVehicles;

public class MainMenu extends JFrame implements ActionListener {
    //private JButton jeepButton;
    public MainMenu() {
        // Set up the main window
        setTitle("Vehicle Agency - Add Vehicles Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new GridLayout(2, 4));

        //Jeep button+image
        ImageIcon imageIcon = new ImageIcon("src/Images/jeep.png"); // load the image to a imageIcon
        Image imageJeep = imageIcon.getImage(); // transform it
        Image JeepImg = imageJeep.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(JeepImg);  // transform it back
        JButton jeepButton = new JButton("Jeep",imageIcon);
        jeepButton.setHorizontalTextPosition(JButton.CENTER);
        jeepButton.setVerticalTextPosition(JButton.BOTTOM);
        jeepButton.addActionListener(this);
        jeepButton.setActionCommand("Jeep");

        //Frigate button+image and rest needs to be done same as above^

        //Frigate button+image and rest needs to be done same as above^
        ImageIcon imageIconFrigate = new ImageIcon("src/Images/frigate.png"); // load the image to a imageIcon
        Image imageFrigate = imageIconFrigate.getImage();
        Image FrigateImg = imageFrigate.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconFrigate = new ImageIcon(FrigateImg);
        JButton frigateButton = new JButton("Frigate",imageIconFrigate);
        frigateButton.setHorizontalTextPosition(JButton.CENTER);
        frigateButton.setVerticalTextPosition(JButton.BOTTOM);
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
        JButton spyGliderButton = new JButton("SpyGlider",imageIconSpyGlider);
        spyGliderButton.setHorizontalTextPosition(JButton.CENTER);
        spyGliderButton.setVerticalTextPosition(JButton.BOTTOM);
        spyGliderButton.addActionListener(this);
        spyGliderButton.setActionCommand("SpyGlider");

        //JButton addGliderButton = new JButton("Add ToyGlider");
        //toyGlider
        ImageIcon imageIconToyGlider = new ImageIcon("src/Images/toyGlider.png"); // load the image to a imageIcon
        Image imageToyGlider = imageIconToyGlider.getImage();
        Image ToyGliderImg = imageToyGlider.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconToyGlider = new ImageIcon(ToyGliderImg);
        JButton toyGliderButton = new JButton("ToyGlider",imageIconToyGlider);
        toyGliderButton.setHorizontalTextPosition(JButton.CENTER);
        toyGliderButton.setVerticalTextPosition(JButton.BOTTOM);
        toyGliderButton.addActionListener(this);
        toyGliderButton.setActionCommand("ToyGlider");
        //

        //JButton addAmphibiousButton = new JButton("Add Amphibious");
        ImageIcon imageIconAmphibious = new ImageIcon("src/Images/amphibious.png"); // load the image to a imageIcon
        Image imageAmphibious = imageIconAmphibious.getImage();
        Image AmphibiousImg = imageAmphibious.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconAmphibious= new ImageIcon(AmphibiousImg);
        JButton amphibiousButton = new JButton("Amphibious",imageIconAmphibious);
        amphibiousButton.setHorizontalTextPosition(JButton.CENTER);
        amphibiousButton.setVerticalTextPosition(JButton.BOTTOM);
        amphibiousButton.addActionListener(this);
        amphibiousButton.setActionCommand("Amphibious");


        //JButton addBicycleButton = new JButton("Add Bicycle");
        ImageIcon imageIconBicycle = new ImageIcon("src/Images/bicycle.png"); // load the image to a imageIcon
        Image imageBicycle = imageIconBicycle.getImage();
        Image BicycleImg = imageBicycle.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconBicycle= new ImageIcon(BicycleImg);
        JButton bicycleButton = new JButton("Bicycle",imageIconBicycle);
        bicycleButton.setHorizontalTextPosition(JButton.CENTER);
        bicycleButton.setVerticalTextPosition(JButton.BOTTOM);
        bicycleButton.addActionListener(this);
        bicycleButton.setActionCommand("Bicycle");


        //JButton addCruiseShipButton = new JButton("Add CruiseShip");
        ImageIcon imageIconCruiseShip = new ImageIcon("src/Images/cruiseShip.png"); // load the image to a imageIcon
        Image imageCruiseShip = imageIconCruiseShip.getImage();
        Image CruiseShipImg = imageCruiseShip.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconCruiseShip= new ImageIcon(CruiseShipImg);
        JButton cruiseShipButton = new JButton("CruiseShip",imageIconCruiseShip);
        cruiseShipButton.setHorizontalTextPosition(JButton.CENTER);
        cruiseShipButton.setVerticalTextPosition(JButton.BOTTOM);
        cruiseShipButton.addActionListener(this);
        cruiseShipButton.setActionCommand("CruiseShip");

        //

        ImageIcon imageIconFinish = new ImageIcon("src/Images/finish.png"); // load the image to a imageIcon
        Image imageFinish = imageIconFinish.getImage();
        Image FinishImg = imageFinish.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconFinish= new ImageIcon(FinishImg);
        JButton finishButton = new JButton("FinishAdding",imageIconFinish);
        finishButton.setHorizontalTextPosition(JButton.CENTER);
        finishButton.setVerticalTextPosition(JButton.BOTTOM);
        finishButton.addActionListener(this);
        finishButton.setActionCommand("FinishAdding");




        // Add the components to the GUI
        add(jeepButton);
        add(frigateButton);
        add(spyGliderButton);
        add(toyGliderButton);
        add(amphibiousButton);
        add(bicycleButton);
        add(cruiseShipButton);
        // finish buttons below;
        add(finishButton);

        // Make the window visible
        setVisible(true);
    }


    public static void main(String[] args) {
        new MainMenu();
    }
    static Menus a = new Menus();
    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();
        //boolean exit = true;
        //while (exit) {


        // Execute the appropriate action based on the button clicked
        switch (command) {
            case "Jeep":
                Agency[amountOfVehicles] = GraphicMenus.scanJeepGui();
                amountOfVehicles++;
                break;
            case "Frigate":
                // Code for Frigate action
                Agency[amountOfVehicles] = GraphicMenus.scanFrigateGui();
                amountOfVehicles++;
                break;
            case "SpyGlider":
                // Code for SpyGlider action
                Agency[amountOfVehicles] = GraphicMenus.scanSpyGliderGui();
                amountOfVehicles++;
                break;
            case "ToyGlider":
                // Code for boat ToyGlider
                Agency[amountOfVehicles] = GraphicMenus.scanToyGliderGui();
                amountOfVehicles++;
                break;
            case "Amphibious":
                // Code for Amphibious action
                Agency[amountOfVehicles] = GraphicMenus.scanAmphibiousGui();
                amountOfVehicles++;
                break;
            case "Bicycle":
                // Code for Bicycle action
                Agency[amountOfVehicles] = GraphicMenus.scanBicycleGui();
                amountOfVehicles++;
                break;
            case "CruiseShip":
                // Code for CruiseShip action
                Agency[amountOfVehicles] = GraphicMenus.scanCruiseShipGui();
                amountOfVehicles++;
                break;
            case "FinishAdding":
                System.out.println("close");
                dispose();
                System.out.println("closedd");
                SecondMenu.main(null);
                break;
            default:
                break;
        }
        Menus m = new Menus();
        m.printAllVehicles();
        GraphicMenus.printAllVehiclesGuiPop();
        //GraphicMenus.printAllVehiclesGuiPop();
    }
}