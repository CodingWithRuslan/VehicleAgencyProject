package Graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Graphic.GraphicMenus.printAllVehiclesGuiPopTestDrive;
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
        setTitle("Welcome to the Vehicle Agency DealerShip Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new GridLayout(2, 5));

        ImageIcon imageIconBuy = new ImageIcon("src/Images/buy.png"); // load the image to a imageIcon
        Image imageBuy = imageIconBuy.getImage();
        Image BuyImg = imageBuy.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconBuy = new ImageIcon(BuyImg);
        JButton buyButton = new JButton("Buy",imageIconBuy);
        buyButton.setHorizontalTextPosition(JButton.CENTER);
        buyButton.setVerticalTextPosition(JButton.BOTTOM);
        buyButton.addActionListener(this);
        buyButton.setActionCommand("Buy");


        ImageIcon imageIconTest = new ImageIcon("src/Images/testDrive.png"); // load the image to a imageIcon
        Image imageTest = imageIconTest.getImage();
        Image TestImg = imageTest.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconTest = new ImageIcon(TestImg);
        JButton testButton = new JButton("TestDrive",imageIconTest);
        testButton.setHorizontalTextPosition(JButton.CENTER);
        testButton.setVerticalTextPosition(JButton.BOTTOM);
        testButton.addActionListener(this);
        testButton.setActionCommand("Test");



        ImageIcon imageIconReset = new ImageIcon("src/Images/reset.png"); // load the image to a imageIcon
        Image imageReset = imageIconReset.getImage();
        Image ResetImg = imageReset.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconReset= new ImageIcon(ResetImg);
        JButton resetButton = new JButton("ResetDistances",imageIconReset);
        resetButton.setHorizontalTextPosition(JButton.CENTER);
        resetButton.setVerticalTextPosition(JButton.BOTTOM);
        resetButton.addActionListener(this);
        resetButton.setActionCommand("Reset");



        ImageIcon imageIconChange = new ImageIcon("src/Images/change.png"); // load the image to a imageIcon
        Image imageChange = imageIconChange.getImage();
        Image ChangeImg = imageChange.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconChange= new ImageIcon(ChangeImg);
        JButton changeButton = new JButton("ChangeFlag",imageIconChange);
        changeButton.setHorizontalTextPosition(JButton.CENTER);
        changeButton.setVerticalTextPosition(JButton.BOTTOM);
        changeButton.addActionListener(this);
        changeButton.setActionCommand("Change");



        ImageIcon imageIconAddVehicleMenu = new ImageIcon("src/Images/addVehicleMenu.png"); // load the image to a imageIcon
        Image imageAddVehicleMenu = imageIconAddVehicleMenu.getImage();
        Image AddVehicleMenuImg = imageAddVehicleMenu.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconAddVehicleMenu= new ImageIcon(AddVehicleMenuImg);
        JButton addVehicleMenuButton = new JButton("AddVehicleMenu",imageIconAddVehicleMenu);
        addVehicleMenuButton.setHorizontalTextPosition(JButton.CENTER);
        addVehicleMenuButton.setVerticalTextPosition(JButton.BOTTOM);
        addVehicleMenuButton.addActionListener(this);
        addVehicleMenuButton.setActionCommand("AddVehicleMenu");

        ImageIcon imageIconAvailableMenu = new ImageIcon("src/Images/available.png"); // load the image to a imageIcon
        Image imageAvailableMenu = imageIconAvailableMenu.getImage();
        Image AvailableMenuImg = imageAvailableMenu.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconAvailableMenu= new ImageIcon(AvailableMenuImg);
        JButton availableMenuButton = new JButton("Available",imageIconAvailableMenu);
        availableMenuButton.setHorizontalTextPosition(JButton.CENTER);
        availableMenuButton.setVerticalTextPosition(JButton.BOTTOM);
        availableMenuButton.addActionListener(this);
        availableMenuButton.setActionCommand("Available");



        ImageIcon imageIconQuit = new ImageIcon("src/Images/quit.png"); // load the image to a imageIcon
        Image imageQuit = imageIconQuit.getImage();
        Image QuitImg = imageQuit.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconQuit= new ImageIcon(QuitImg);
        JButton quitButton = new JButton("QuitSystem",imageIconQuit);
        quitButton.setHorizontalTextPosition(JButton.CENTER);
        quitButton.setVerticalTextPosition(JButton.BOTTOM);
        quitButton.addActionListener(this);
        quitButton.setActionCommand("QuitSystem");


        // Add the components to the GUI
        add(buyButton);
        add(testButton);
        add(resetButton);
        add(changeButton);
        add(addVehicleMenuButton);
        add(availableMenuButton);
        add(quitButton);

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
                GraphicMenus.printAllVehiclesGuiPopBuy();
                break;
            case "Test":
                //GraphicTest.main(null); // before ex2 with this we used to TestDrive...
                GraphicMenus.printAllVehiclesGuiPopTestDrive();
                break;

            case "Reset":
                GraphicMenus.resetDistanceTraveledAll();
                break;

            case "Change":
                new GraphicFlags();
                //GraphicMenus.changeFlagOfAllMarineVehiclesGui();
                break;
            case "AddVehicleMenu":
                dispose();
                MainMenu.main(null);
                break;
            case "Available":
               GraphicMenus.printAllVehiclesGuiPop();
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