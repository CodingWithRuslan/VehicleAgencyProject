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
        setTitle("Vehicle Agency - Add Vehicles");
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
        JButton addFrigateButton = new JButton("Add Frigate");
        JButton addSpyGliderButton = new JButton("Add SpyGlider");
        JButton addGliderButton = new JButton("Add ToyGlider");
        JButton addAmphibiousVehicleButton = new JButton("Add Amphibious");
        JButton addBicycleButton = new JButton("Add Bicycle");
        JButton addCruiseShipButton = new JButton("Add CruiseShip");

        JButton addFinishAddingButton = new JButton("Finish Adding");
        addFinishAddingButton.addActionListener(this);
        addFinishAddingButton.setActionCommand("FinishAdding");




        // Add the components to the GUI
        add(jeepButton);
        add(addFrigateButton);
        add(addSpyGliderButton);
        add(addGliderButton);
        add(addAmphibiousVehicleButton);
        add(addBicycleButton);
        add(addCruiseShipButton);
        add(addFinishAddingButton);

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
                break;
            case "SpyGlider":
                // Code for SpyGlider action
                break;
            case "ToyGlider":
                // Code for boat ToyGlider
                break;
            case "Amphibious":
                // Code for Amphibious action
                break;
            case "Bicycle":
                // Code for Bicycle action
                break;
            case "CruiseShip":
                // Code for CruiseShip action
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
    }
}