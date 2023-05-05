package Graphic;

import Vehicle.MarineVehicle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static System.Main.Agency;
import static System.Main.amountOfVehicles;

public class GraphicFlags extends JFrame implements ActionListener {
    //private JButton jeepButton;
    public GraphicFlags() {
        // "Israel","USA","Germany","Italy","Greece","Somalia","Somalia","Pirates"
        setTitle("Change flag of the Marine Vehicles:");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new GridLayout(2, 4));

        //Israelbutton+image
        ImageIcon imageIconIsrael = new ImageIcon("src/Images/israel.png"); // load the image to a imageIcon
        Image imageIsrael = imageIconIsrael.getImage(); // transform it
        Image IsraelImg = imageIsrael.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconIsrael = new ImageIcon(IsraelImg);  // transform it back
        JButton israelButton = new JButton(imageIconIsrael);
        israelButton.addActionListener(this);
        israelButton.setActionCommand("Israel");

        //Frigate button+image and rest needs to be done same as above^

        //USAbutton+image
        ImageIcon imageIconUSA = new ImageIcon("src/Images/usa.png"); // load the image to a imageIcon
        Image imageUSA = imageIconUSA.getImage(); // transform it
        Image USAImg = imageUSA.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconUSA = new ImageIcon(USAImg);  // transform it back
        JButton usaButton = new JButton(imageIconUSA);
        usaButton.addActionListener(this);
        usaButton.setActionCommand("USA");

        //Germanybutton+image
        ImageIcon imageIconGermany = new ImageIcon("src/Images/germany.png"); // load the image to a imageIcon
        Image imageGermany = imageIconGermany.getImage(); // transform it
        Image GermanyImg = imageGermany.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconGermany = new ImageIcon(GermanyImg);  // transform it back
        JButton germanyButton = new JButton(imageIconGermany);
        germanyButton.addActionListener(this);
        germanyButton.setActionCommand("Germany");

        //Italybutton+image
        ImageIcon imageIconItaly = new ImageIcon("src/Images/italy.png"); // load the image to a imageIcon
        Image imageItaly = imageIconItaly.getImage(); // transform it
        Image ItalyImg = imageItaly.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconItaly = new ImageIcon(ItalyImg);  // transform it back
        JButton italyButton = new JButton(imageIconItaly);
        italyButton.addActionListener(this);
        italyButton.setActionCommand("Italy");

        //Greecebutton+image
        ImageIcon imageIconGreece = new ImageIcon("src/Images/greece.png"); // load the image to a imageIcon
        Image imageGreece = imageIconGreece.getImage(); // transform it
        Image GreeceImg = imageGreece.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconGreece = new ImageIcon(GreeceImg);  // transform it back
        JButton greeceButton = new JButton(imageIconGreece);
        greeceButton.addActionListener(this);
        greeceButton.setActionCommand("Greece");


        //Somaliabutton+image
        ImageIcon imageIconSomalia = new ImageIcon("src/Images/somalia.png"); // load the image to a imageIcon
        Image imageSomalia = imageIconSomalia.getImage(); // transform it
        Image SomaliaImg = imageSomalia.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconSomalia = new ImageIcon(SomaliaImg);  // transform it back
        JButton somaliaButton = new JButton(imageIconSomalia);
        somaliaButton.addActionListener(this);
        somaliaButton.setActionCommand("Somalia");


        //Piratesbutton+image
        ImageIcon imageIconPirates = new ImageIcon("src/Images/pirates.png"); // load the image to a imageIcon
        Image imagePirates = imageIconPirates.getImage(); // transform it
        Image PiratesImg = imagePirates.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconPirates = new ImageIcon(PiratesImg);  // transform it back
        JButton piratesButton = new JButton(imageIconPirates);
        piratesButton.addActionListener(this);
        piratesButton.setActionCommand("Pirates");

        JButton changeFinishBuyingButton = new JButton("Finish Change");
        changeFinishBuyingButton.addActionListener(this);
        changeFinishBuyingButton.setActionCommand("FinishChange");




        // Add the components to the GUI
        add(israelButton);
        add(usaButton);
        add(germanyButton);
        add(italyButton);
        add(greeceButton);
        add(somaliaButton);
        add(piratesButton);
        add(changeFinishBuyingButton);

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
            case "Israel":
                for (int i = 0; i < amountOfVehicles; i++) {
                    if (Agency[i] instanceof MarineVehicle) {
                        ((MarineVehicle) Agency[i]).setCountryFlag("Israel");
                    }
                }
                JOptionPane.showMessageDialog(null, "Flag for All the Marine Vehicles have been Changed to " + "Israel" +".");
                //GraphicMenus.buyJeepGui();
                break;

            case "USA":
                for (int i = 0; i < amountOfVehicles; i++) {
                    if (Agency[i] instanceof MarineVehicle) {
                        ((MarineVehicle) Agency[i]).setCountryFlag("USA");
                    }
                }
                JOptionPane.showMessageDialog(null, "Flag for All the Marine Vehicles have been Changed to " + "USA" +".");
                //GraphicMenus.buyFrigateGui();
                //
                break;
            case "Germany":
                for (int i = 0; i < amountOfVehicles; i++) {
                    if (Agency[i] instanceof MarineVehicle) {
                        ((MarineVehicle) Agency[i]).setCountryFlag("Germany");
                    }
                }
                JOptionPane.showMessageDialog(null, "Flag for All the Marine Vehicles have been Changed to " + "Germany" +".");
                //GraphicMenus.buySpyGliderGui();
                //
                break;
            case "Italy":
                for (int i = 0; i < amountOfVehicles; i++) {
                    if (Agency[i] instanceof MarineVehicle) {
                        ((MarineVehicle) Agency[i]).setCountryFlag("Italy");
                    }
                }
                JOptionPane.showMessageDialog(null, "Flag for All the Marine Vehicles have been Changed to " + "Italy" +".");
                //GraphicMenus.buyToyGliderGui();
                //
                break;
            case "Greece":
                for (int i = 0; i < amountOfVehicles; i++) {
                    if (Agency[i] instanceof MarineVehicle) {
                        ((MarineVehicle) Agency[i]).setCountryFlag("Greece");
                    }
                }
                JOptionPane.showMessageDialog(null, "Flag for All the Marine Vehicles have been Changed to " + "Greece" +".");
                //GraphicMenus.buyAmphibiousGui();
                //
                break;
            case "Somalia":
                for (int i = 0; i < amountOfVehicles; i++) {
                    if (Agency[i] instanceof MarineVehicle) {
                        ((MarineVehicle) Agency[i]).setCountryFlag("Somalia");
                    }
                }
                JOptionPane.showMessageDialog(null, "Flag for All the Marine Vehicles have been Changed to " + "Somalia" +".");
                //GraphicMenus.buyBicycleGui();
                //
                break;
            case "Pirates":
                for (int i = 0; i < amountOfVehicles; i++) {
                    if (Agency[i] instanceof MarineVehicle) {
                        ((MarineVehicle) Agency[i]).setCountryFlag("Pirates");
                    }
                }
                JOptionPane.showMessageDialog(null, "Flag for All the Marine Vehicles have been Changed to " + "Pirates" +".");
                //GraphicMenus.buyCruiseShipGui();
                //
                break;


            case "FinishChange":
                System.out.println("close menu3");
                dispose(); // closes this JFrame
                System.out.println("closed");
                break;
            default:
                break;
        }



    }

}
