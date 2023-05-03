package Graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicBuy extends JFrame implements ActionListener {
    //private JButton jeepButton;
    public GraphicBuy() {
        // Set up the Third Menu (BUY)
        setTitle("Vehicle Agency - Buy Vehicles");
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
        JButton addFrigateButton = new JButton("Buy Frigate");
        JButton addSpyGliderButton = new JButton("Buy SpyGlider");
        JButton addGliderButton = new JButton("Buy ToyGlider");
        JButton addAmphibiousVehicleButton = new JButton("Buy Amphibious");
        JButton addBicycleButton = new JButton("Buy Bicycle");
        JButton addCruiseShipButton = new JButton("Buy CruiseShip");

        JButton addFinishBuyingButton = new JButton("Finish Buying");
        addFinishBuyingButton.addActionListener(this);
        addFinishBuyingButton.setActionCommand("FinishBuying");




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
        new GraphicBuy();
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
                GraphicMenus.buyJeepGui();
                break;

            case "Frigate":
                //
                break;


            //Rest of Cases


            case "FinishBuying":
                System.out.println("close menu3");
                dispose(); // closes this JFrame
                System.out.println("closedd");
                break;
            default:
                break;
        }



    }

}