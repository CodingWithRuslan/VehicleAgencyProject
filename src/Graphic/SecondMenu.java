package Graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static System.Main.Agency;
import static System.Main.amountOfVehicles;
import static System.Main.capacityOfAgency;

import System.Menus;

public class SecondMenu extends JFrame implements ActionListener {
    //private JButton jeepButton;
    public SecondMenu() {
        // Set up the Second Menu
        //Welcome to the Vehicle Agency DealerShip
        //
        //Hello user, Choose Option:
        //1 : Buy A Vehicle
        //2 : Take Vehicle for a test drive
        //3 : Reset distance traveled for ALL the Vehicles
        //4 : Change flag of the Marine Vehicles of the user
        //5 : Quit System
        setTitle("Welcome to the Vehicle Agency DealerShip");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new GridLayout(2, 4));

        //buy button+image
        ImageIcon imageIcon = new ImageIcon("src/Images/buy.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image JeepImg = image.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(JeepImg);  // transform it back
        JButton buyButton = new JButton(imageIcon);
        buyButton.addActionListener(this);
        buyButton.setActionCommand("Buy");

        //buy button+image
        JButton addTestVehicleButton = new JButton("Test Vehicle");
        addTestVehicleButton.addActionListener(this);
        addTestVehicleButton.setActionCommand("Test");


        JButton addResetDistancesButton = new JButton("Reset Distances");
        addResetDistancesButton.addActionListener(this);
        addResetDistancesButton.setActionCommand("Reset");


        JButton addChangeFlagButton = new JButton("Change Flag");
        addChangeFlagButton.addActionListener(this);
        addChangeFlagButton.setActionCommand("Change");

        JButton addVehicleMenuButton = new JButton("Add Vehicle Menu");
        addVehicleMenuButton.addActionListener(this);
        addVehicleMenuButton.setActionCommand("AddVehicleMenu");


        JButton addFinishAddingButton = new JButton("Quit System");
        addFinishAddingButton.addActionListener(this);
        addFinishAddingButton.setActionCommand("QuitSystem");


        // Add the components to the GUI
        add(buyButton);
        add(addTestVehicleButton);
        add(addResetDistancesButton);
        add(addChangeFlagButton);
        add(addVehicleMenuButton);
        add(addFinishAddingButton);

        // Make the window visible
        setVisible(true);
    }


    public static void main(String[] args) {
        new SecondMenu();
    }

    Menus a = new Menus();
    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();
        //boolean exit = true;
        //while (exit) {


        // Execute the appropriate action based on the button clicked
        switch (command) {
            case "Buy":
                GraphicBuy.main(null);

                break;
            case "Test":
                GraphicTest.main(null);
                break;

            case "Reset":
                GraphicMenus.resetDistanceTraveledAll();
                break;

            case "Change":
                GraphicMenus.changeFlagOfAllMarineVehiclesGui();
                break;
            case "AddVehicleMenu":
                dispose();
                MainMenu.main(null);
                break;



            case "QuitSystem":
                System.out.println("close menu2");
                dispose(); // closes this JFrame
                System.out.println("closedd");
                break;
            default:
                break;
        }
        Menus m = new Menus();
        m.printAllVehicles();

    }

}