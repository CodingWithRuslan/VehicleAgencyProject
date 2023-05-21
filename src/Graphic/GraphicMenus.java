package Graphic;

import Vehicle.Vehicle;
import Vehicle.MarineVehicle;
import Vehicle.Jeep;
import Vehicle.Frigate;
import Vehicle.SpyGlider;
import Vehicle.ToyGlider;
import Vehicle.AmphibiousVehicle;
import Vehicle.Bicycle;
import Vehicle.CruiseShip;
import Vehicle.ElectricBicycle;
import Vehicle.HybridAircraft;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import System.Menus;

import static System.Main.*;
import Vehicle.MarineVehicle;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Random;
import java.util.Vector;


public class GraphicMenus extends JFrame implements ActionListener {


    public static void printAllVehiclesGui(){
        // Print all the List Available Vehicles in stock.
        System.out.println("\nList of Available Vehicles in stock:");
        for (int i = 0; i < amountOfVehicles; i++) {
            System.out.println(Agency[i]);
        }
    }

    /*public static void printAllVehiclesGuiPop() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < amountOfVehicles; i++) {
            stringBuilder.append(Agency[i]);
            stringBuilder.append("\n");
        }
        String joinedString = stringBuilder.toString();
        JOptionPane.showMessageDialog(null, "List of Available Vehicles in stock:\n" + joinedString);
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof Jeep) {
                Jeep jeep = (Jeep) Agency[i];
                JeepImageSelectionMenu.showImageAndToString(jeep);
            }
        }
    }*/
    public static void printAllVehiclesGuiPop() {
        JPanel panel = new JPanel(new GridLayout(0, 3)); // create a panel with 3 columns
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof Jeep) {
                Jeep jeep = (Jeep) Agency[i];
                ImageIcon imageIcon = jeep.getJeepImageIcon();
                String jeepToString = jeep.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(jeepToString); // set tooltip with the Jeep's toString method
                panel.add(label);
            }
            if (Agency[i] instanceof Frigate) {
                Frigate frigate = (Frigate) Agency[i];
                ImageIcon imageIcon = frigate.getFrigateImageIcon();
                String frigateToString = frigate.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(frigateToString); // set tooltip with the Jeep's toString method
                panel.add(label);
            }
            if (Agency[i] instanceof SpyGlider) {
                SpyGlider spyGlider = (SpyGlider) Agency[i];
                ImageIcon imageIcon = spyGlider.getSpyGliderImageIcon();
                String spyGliderToString = spyGlider.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(spyGliderToString); // set tooltip with the Jeep's toString method
                panel.add(label);
            }
            if (Agency[i] instanceof ToyGlider) {
                ToyGlider toyGlider = (ToyGlider) Agency[i];
                ImageIcon imageIcon = toyGlider.getToyGliderImageIcon();
                String toyGliderToString = toyGlider.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(toyGliderToString); // set tooltip with the Jeep's toString method
                panel.add(label);
            }
            if (Agency[i] instanceof AmphibiousVehicle) {
                AmphibiousVehicle amphibiousVehicle = (AmphibiousVehicle) Agency[i];
                ImageIcon imageIcon = amphibiousVehicle.getAmphibiousVehicleImageIcon();
                String amphibiousVehicleToString = amphibiousVehicle .toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(amphibiousVehicleToString); // set tooltip with the Jeep's toString method
                panel.add(label);
            }

            if (Agency[i] instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) Agency[i];
                ImageIcon imageIcon = bicycle.getBicycleImageIcon();
                String bicycleToString = bicycle.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(bicycleToString); // set tooltip with the Jeep's toString method
                panel.add(label);
            }

            if (Agency[i] instanceof CruiseShip) {
                CruiseShip cruiseShip = (CruiseShip) Agency[i];
                ImageIcon imageIcon = cruiseShip.getCruiseShipImageIcon();
                String cruiseShipToString = cruiseShip.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(cruiseShipToString); // set tooltip with the Jeep's toString method
                panel.add(label);
            }

            if (Agency[i] instanceof ElectricBicycle) {
                ElectricBicycle electricBicycle = (ElectricBicycle) Agency[i];
                ImageIcon imageIcon = electricBicycle.getElectricBicycleImageIcon();
                String electricBicycleToString = electricBicycle.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(electricBicycleToString); // set tooltip with the Jeep's toString method
                panel.add(label);
            }

            if (Agency[i] instanceof HybridAircraft) {
                HybridAircraft hybridAircraft = (HybridAircraft) Agency[i];
                ImageIcon imageIcon = hybridAircraft.getHybridAircraftImageIcon();
                String hybridAircraftToString = hybridAircraft.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(hybridAircraftToString); // set tooltip with the Jeep's toString method
                panel.add(label);
            }

        }
        JOptionPane.showMessageDialog(null, panel, "List of Available Vehicles in stock:", JOptionPane.PLAIN_MESSAGE);
    }

/*
    //TestDrive method will be opend when user clicks on TestDrive , it will show the user window with all the Agency vehicles .
    // when the user clicks on some vehicle it will provide him the option to enter the distance travled of test drive.
    //Note : Example :testDriveJeepGui(Jeep jeep) , i did minor change to the method , on the argument recived and
    // inside the method insted of using scanJeep i recive the jeep as paramter so i store it Vehicle j = jeep.
    // before it was Vehicle f = scanJeepGui();


 */
    public static void printAllVehiclesGuiPopTestDrive() {
        JPanel panel = new JPanel(new GridLayout(0, 3)); // create a panel with 3 columns
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof Jeep) {
                Jeep jeep = (Jeep) Agency[i];
                ImageIcon imageIcon = jeep.getJeepImageIcon();
                String jeepToString = jeep.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(jeepToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        testDriveJeepGui(jeep);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }
            if (Agency[i] instanceof Frigate) {
                Frigate frigate = (Frigate) Agency[i];
                ImageIcon imageIcon = frigate.getFrigateImageIcon();
                String frigateToString = frigate.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(frigateToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        testDriveFrigateGui(frigate);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }
            if (Agency[i] instanceof SpyGlider) {
                SpyGlider spyGlider = (SpyGlider) Agency[i];
                ImageIcon imageIcon = spyGlider.getSpyGliderImageIcon();
                String spyGliderToString = spyGlider.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(spyGliderToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        testDriveSpyGliderGui(spyGlider);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }
            if (Agency[i] instanceof ToyGlider) {
                ToyGlider toyGlider = (ToyGlider) Agency[i];
                ImageIcon imageIcon = toyGlider.getToyGliderImageIcon();
                String toyGliderToString = toyGlider.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(toyGliderToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        testDriveToyGliderGui(toyGlider);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }
            if (Agency[i] instanceof AmphibiousVehicle) {
                AmphibiousVehicle amphibiousVehicle = (AmphibiousVehicle) Agency[i];
                ImageIcon imageIcon = amphibiousVehicle.getAmphibiousVehicleImageIcon();
                String amphibiousVehicleToString = amphibiousVehicle .toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(amphibiousVehicleToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        testDriveAmphibiousGui(amphibiousVehicle);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }

            if (Agency[i] instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) Agency[i];
                ImageIcon imageIcon = bicycle.getBicycleImageIcon();
                String bicycleToString = bicycle.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(bicycleToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        testDriveBicycleGui(bicycle);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }

            if (Agency[i] instanceof CruiseShip) {
                CruiseShip cruiseShip = (CruiseShip) Agency[i];
                ImageIcon imageIcon = cruiseShip.getCruiseShipImageIcon();
                String cruiseShipToString = cruiseShip.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(cruiseShipToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        testDriveCruiseShipGui(cruiseShip);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }

            if (Agency[i] instanceof ElectricBicycle) {
                ElectricBicycle electricBicycle = (ElectricBicycle) Agency[i];
                ImageIcon imageIcon = electricBicycle.getElectricBicycleImageIcon();
                String electricBicycleToString = electricBicycle.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(electricBicycleToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        testDriveElectricBicycleGui(electricBicycle);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }

            if (Agency[i] instanceof HybridAircraft) {
                HybridAircraft hybridAircraft = (HybridAircraft) Agency[i];
                ImageIcon imageIcon = hybridAircraft.getHybridAircraftImageIcon();
                String hybridAircraftToString = hybridAircraft.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(hybridAircraftToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        testDriveHybridAircraftGui(hybridAircraft);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }





        }
        JOptionPane.showMessageDialog(null, panel, "List of Available Vehicles in stock:", JOptionPane.PLAIN_MESSAGE);
    }
    public static void printAllVehiclesGuiPopBuy() {
        JPanel panel = new JPanel(new GridLayout(0, 3)); // create a panel with 3 columns
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof Jeep) {
                /*Jeep jeep = (Jeep) Agency[i];
                ImageIcon imageIcon = jeep.getJeepImageIcon();
                String jeepToString = jeep.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(jeepToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        buyJeepGui(jeep);
                        //printAllVehiclesGuiPop(); // add this method the show the update to user.
                    }
                });
                panel.add(label);*/
                /*Jeep jeep = (Jeep) Agency[i];
                ImageIcon imageIcon = jeep.getJeepImageIcon();
                String jeepToString = jeep.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(jeepToString); // Set a description in the toString method of the zip
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        //selectedJeep = jeep;
                        // Show confirmation window
                        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to buy this vehicle?", "Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            buyJeepGui(jeep);
                        }
                    }
                });
                panel.add(label);*/
                Jeep jeep = (Jeep) Agency[i];
                ImageIcon imageIcon = jeep.getJeepImageIcon();
                String jeepToString = jeep.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(jeepToString); // Set a description in the toString method of the vehicle
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        buyJeepGui(jeep);
                    }
                });
                panel.add(label);

            }
            if (Agency[i] instanceof Frigate) {
                Frigate frigate = (Frigate) Agency[i];
                ImageIcon imageIcon = frigate.getFrigateImageIcon();
                String frigateToString = frigate.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(frigateToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        buyFrigateGui(frigate);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }
            if (Agency[i] instanceof SpyGlider) {
                SpyGlider spyGlider = (SpyGlider) Agency[i];
                ImageIcon imageIcon = spyGlider.getSpyGliderImageIcon();
                String spyGliderToString = spyGlider.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(spyGliderToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        buySpyGliderGui(spyGlider);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }
            if (Agency[i] instanceof ToyGlider) {
                ToyGlider toyGlider = (ToyGlider) Agency[i];
                ImageIcon imageIcon = toyGlider.getToyGliderImageIcon();
                String toyGliderToString = toyGlider.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(toyGliderToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        buyToyGliderGui(toyGlider);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }
            if (Agency[i] instanceof AmphibiousVehicle) {
                AmphibiousVehicle amphibiousVehicle = (AmphibiousVehicle) Agency[i];
                ImageIcon imageIcon = amphibiousVehicle.getAmphibiousVehicleImageIcon();
                String amphibiousVehicleToString = amphibiousVehicle .toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(amphibiousVehicleToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        buyAmphibiousGui(amphibiousVehicle);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }

            if (Agency[i] instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) Agency[i];
                ImageIcon imageIcon = bicycle.getBicycleImageIcon();
                String bicycleToString = bicycle.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(bicycleToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        buyBicycleGui(bicycle);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }

            if (Agency[i] instanceof CruiseShip) {
                CruiseShip cruiseShip = (CruiseShip) Agency[i];
                ImageIcon imageIcon = cruiseShip.getCruiseShipImageIcon();
                String cruiseShipToString = cruiseShip.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(cruiseShipToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        buyCruiseShipGui(cruiseShip);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }

            if (Agency[i] instanceof ElectricBicycle) {
                ElectricBicycle electricBicycle = (ElectricBicycle) Agency[i];
                ImageIcon imageIcon = electricBicycle.getElectricBicycleImageIcon();
                String electricBicycleToString = electricBicycle.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(electricBicycleToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        buyElectricBicycleGui(electricBicycle);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }

            if (Agency[i] instanceof HybridAircraft) {
                HybridAircraft hybridAircraft = (HybridAircraft) Agency[i];
                ImageIcon imageIcon = hybridAircraft.getHybridAircraftImageIcon();
                String hybridAircraftToString = hybridAircraft.toString();
                JLabel label = new JLabel(imageIcon);
                label.setToolTipText(hybridAircraftToString); // set tooltip with the Jeep's toString method
                label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        buyHybridAircraftGui(hybridAircraft);
                        //printAllVehiclesGuiPop(); // add this to show the update right away after the action.
                    }
                });
                panel.add(label);
            }




        }
        JOptionPane.showMessageDialog(null, panel, "List of Available Vehicles in stock:", JOptionPane.PLAIN_MESSAGE);
    }

    /*public static void printAllVehiclesGuiPop() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < amountOfVehicles; i++) {
            stringBuilder.append(Agency[i]);
            stringBuilder.append("\n");
        }
        String joinedString = stringBuilder.toString();
        JOptionPane.showMessageDialog(null, "List of Available Vehicles in stock:\n" + joinedString);
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof Jeep) {
                Jeep jeep = (Jeep) Agency[i];
                JeepImageSelectionMenu.showImageAndToString(jeep);
            }
        }
    }*/

    /*public static void printAllVehiclesGuiPop() {
        // Print all the List Available Vehicles in stock.
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < amountOfVehicles; i++) {
            stringBuilder.append(Agency[i].toString());
            stringBuilder.append("\n");
        }
        String joinedString = stringBuilder.toString();
        JOptionPane.showMessageDialog(null, "List of Available Vehicles in stock:\n" + joinedString);

        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof Jeep) {
                Jeep jeep = (Jeep) Agency[i];
                ImageIcon imageIcon = jeep.getJeepImageIcon();
                String jeepToString = jeep.toString();
                JeepImageSelectionMenu.showImageAndToString(imageIcon, jeepToString);
            }
        }
    }*/


    /*public static void printAllVehiclesGuiPop(){
        // Print all the List Available Vehicles in stock.

        String[] strArray = { };
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < amountOfVehicles; i++) {
            stringBuilder.append(Agency[i]);
            stringBuilder.append("\n");
        }
        String joinedString = stringBuilder.toString();
        JOptionPane.showMessageDialog(null, "List of Available Vehicles in stock:\n" + joinedString);
        for (int i = 0; i < amountOfVehicles; i++) {
            if(Agency[i] instanceof Jeep){JeepImageSelectionMenu.showImageAndToString((Jeep)Agency[i]);}
        }
    }*/




    /*public static void printAllVehiclesGuiPopTable(){
        // Print all the List Available Vehicles in stock.

        String[] strArray = { };
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < amountOfVehicles; i++) {
            stringBuilder.append(Agency[i]);
            stringBuilder.append("\n");
        }
        String joinedString = stringBuilder.toString();
        //JOptionPane.showMessageDialog(null, "List of Available Vehicles in stock:\n" + joinedString);

        String rows[] = joinedString.split("\n");



        Vector<Vector<String>> dataVector = new Vector<Vector<String>>();
        for (String row : rows) {
            //row = row.trim();  //UPDATE
            Vector<String> data = new Vector<String>();
            data.addAll(Arrays.asList(row.split(",")));
            dataVector.add(data);
            if (row =="image"){

            }
        }

        Vector<String> header = new Vector<String>(2);
        header.add("Model");
        header.add("Traveled");
        header.add("MaxSpeed");
        header.add("MaxPeople");
        header.add("NumOfWheels");
        header.add("RoadType");
        header.add("typeOfLicense");
        header.add("avgFuelConsumption");
        header.add("avgEngineLifeSpan");
        header.add("image");


        TableModel model = new DefaultTableModel(dataVector, header);
        JTable table = new JTable(model);

        JFrame frame = new JFrame("DemoFrame");
        frame.add(new JScrollPane(table));
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );



    }*/

    public static Vehicle scanJeepGui(){
        String modelJeep = JOptionPane.showInputDialog(null, "Please Enter Model: ");
        double avgFuelConsumptionJeep = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Average Fuel Consumption: "));
        int maxSpeedJeep = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Max speed: "));
        double avgEngineLifeSpanJeep = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Average Engine Life Span: "));
        /*String[] imageOptions = { "jeep1.png", "jeep2.png", "jeep3.png" }; // limited image options
        String imageJeep = (String) JOptionPane.showInputDialog(null, "Please select an image:", "Select Image",
                JOptionPane.PLAIN_MESSAGE, null, imageOptions, imageOptions[0]);*/
        ImageIcon imageJeep = JeepImageSelectionMenu.getImageIcon();
        Vehicle a = new Jeep(modelJeep, avgFuelConsumptionJeep, maxSpeedJeep, avgEngineLifeSpanJeep,imageJeep);
        return a;
    }

    public static Vehicle scanFrigateGui(){
        String modelFrigate = JOptionPane.showInputDialog(null, "Please Enter Model: ");
        int numOfPassengersFrigate = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Number of passengers: "));
        int maxSpeedFrigate = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Max speed: "));
        String withWindDirectionFrigate = JOptionPane.showInputDialog(null, "Sailing in wind direction? (yes or no): ");
        boolean sailWindDirectionFrigate = false;
        if (withWindDirectionFrigate.equals("yes")) {
            sailWindDirectionFrigate = true;
        } // else it stays false (no)
        int distanceTraveledFrigate = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Distance traveled: "));
        ImageIcon imageFrigate = FrigateImageSelectionMenu.getImageIcon();
        Vehicle a = new Frigate(modelFrigate, numOfPassengersFrigate, maxSpeedFrigate, sailWindDirectionFrigate, distanceTraveledFrigate,imageFrigate);
        return a;
    }

    public static Vehicle scanSpyGliderGui(){
        String powerSourceSpyGlider = JOptionPane.showInputDialog(null, "Please Enter Power Source (Battery, Solar, Fuel, Manual): ");
        int distanceTraveledSpyGlider = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Distance traveled: "));
        ImageIcon imageSpyGlider = SpyGliderImageSelectionMenu.getImageIcon();
        Vehicle a = new SpyGlider(powerSourceSpyGlider, distanceTraveledSpyGlider,imageSpyGlider);
        return a;
    }

    public static Vehicle scanToyGliderGui(){
        int distanceTraveledSpyGlider = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Distance traveled: "));
        ImageIcon imageToyGlider = ToyGliderImageSelectionMenu.getImageIcon();
        Vehicle a = new ToyGlider(distanceTraveledSpyGlider,imageToyGlider);
        return a;
    }

    public static Vehicle scanAmphibiousGui(){
        String model = JOptionPane.showInputDialog(null, "Please Enter Model: ");
        int distanceTraveled = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Distance traveled: "));
        int numOfPassengers = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Number of passengers: "));
        int maxSpeed = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Max speed: "));
        double avgFuelConsumption = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Average Fuel Consumption: "));
        double avgEngineLifeSpan = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Average Engine Life Span: "));
        int numOfWheels = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Num of wheels: "));
        String withWindDirection = JOptionPane.showInputDialog(null, "Sailing in wind direction? (yes or no): ");
        boolean sailWindDirection = false;
        if (withWindDirection.equals("yes")) {
            sailWindDirection = true;
        } // else it stays false (no)
        String flag = JOptionPane.showInputDialog(null, "Please Enter Country Flag: ");
        ImageIcon imageAmphibious = AmphibiousImageSelectionMenu.getImageIcon();
        Vehicle a = new AmphibiousVehicle(model, distanceTraveled, numOfPassengers, maxSpeed, avgFuelConsumption,avgEngineLifeSpan,numOfWheels,sailWindDirection,flag,imageAmphibious);
        return a;
    }

    public static Vehicle scanBicycleGui(){
        String model = JOptionPane.showInputDialog(null, "Please Enter Model: ");
        int distanceTraveled = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Distance traveled: "));
        int numOfPassengers = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Number of passengers: "));
        int maxSpeed = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Max speed: "));
        String roadType = JOptionPane.showInputDialog(null, "Please Enter Road Type (dirt/pavement): ");
        boolean flagBool=false;
        if (roadType.equals("pavement")) { // with
            flagBool=true;
        }
        else
            flagBool=false;

        ImageIcon imageBicycle = BicycleImageSelectionMenu.getImageIcon();
        Vehicle a = new Bicycle(model,distanceTraveled,numOfPassengers,maxSpeed,flagBool,imageBicycle);
        return a;
    }

    public static Vehicle scanCruiseShipGui(){
        String model = JOptionPane.showInputDialog(null, "Please Enter Model: ");
        int distanceTraveled = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Distance traveled: "));
        int numOfPassengers = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Number of passengers: "));
        int maxSpeed = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Max speed: "));
        String countryFlag = JOptionPane.showInputDialog(null, "Please Enter Country Flag: ");
        double avgFuelConsumption = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Average Fuel Consumption: "));
        double avgEngineLifeSpan = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Average Engine Life Span: "));
        ImageIcon imageCruiseShip = CruiseShipImageSelectionMenu.getImageIcon();
        Vehicle a = new CruiseShip(model,distanceTraveled,numOfPassengers,maxSpeed,countryFlag,avgFuelConsumption,avgEngineLifeSpan,imageCruiseShip);
        return a;

    }

    //    public HybridAircraft(String model, int distanceTraveled , int numOfPassengers , int maxSpeed,double avgFuelConsumption, double avgEngineLifeSpan, int numOfWheels, boolean sailWindDirection, String countryFlag,String powerSource,char energyScore, ImageIcon image
    public static Vehicle scanHybridAircraftGui(){
        String model = JOptionPane.showInputDialog(null, "Please Enter Model: ");
        int distanceTraveled = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Distance traveled: "));
        int numOfPassengers = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Number of passengers: "));
        int maxSpeed = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Max speed: "));
        double avgFuelConsumption = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Average Fuel Consumption: "));
        double avgEngineLifeSpan = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Average Engine Life Span: "));
        int numOfWheels = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Num of wheels: "));
        String withWindDirection = JOptionPane.showInputDialog(null, "Sailing in wind direction? (yes or no): ");
        boolean sailWindDirection = false;
        if (withWindDirection.equals("yes")) {
            sailWindDirection = true;
        } // else it stays false (no)
        String flag = JOptionPane.showInputDialog(null, "Please Enter Country Flag: ");
        String powerSource = JOptionPane.showInputDialog(null, "Please Enter Power Source (Battery, Solar, Fuel, Manual): ");
       // char energyScore = JOptionPane.showInputDialog(null, "Please Enter EnergyScore A/B/C ");
        char energyScore = JOptionPane.showInputDialog(null, "Please Enter EnergyScore A/B/C").charAt(0);
        ImageIcon imageHybridAircraft = HybridAircraftImageSelectionMenu.getImageIcon();
        Vehicle a = new HybridAircraft(model, distanceTraveled, numOfPassengers, maxSpeed, avgFuelConsumption,avgEngineLifeSpan,numOfWheels,sailWindDirection,flag,powerSource,energyScore,imageHybridAircraft);
        return a;

    }

    //public ElectricBicycle(String model, int distanceTraveled, int numOfPassengers, int maxSpeed, boolean roadType,double avgEngineLifeSpan, ImageIcon image)
    public static Vehicle scanElectricBicycleGui(){
        String model = JOptionPane.showInputDialog(null, "Please Enter Model: ");
        int distanceTraveled = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Distance traveled: "));
        int numOfPassengers = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Number of passengers: "));
        int maxSpeed = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Max speed: "));
        String roadType = JOptionPane.showInputDialog(null, "Please Enter Road Type (dirt/pavement): ");
        boolean flagBool=false;
        if (roadType.equals("pavement")) { // with
            flagBool=true;
        }
        else
            flagBool=false;
        double avgEngineLifeSpan = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Average Engine Life Span: "));
        ImageIcon imageElectricBicycle= ElectricBicycleImageSelectionMenu.getImageIcon();
        Vehicle a = new ElectricBicycle(model,distanceTraveled,numOfPassengers,maxSpeed,flagBool,avgEngineLifeSpan,imageElectricBicycle);
        return a;
    }

    // public static Vehicle scanAllTheRest...


    public static void buyJeepGui(Jeep jeep){

        /*Vehicle j = jeep;

        int toDelete = capacityOfAgency+1; // just to make see if theres to delete after
        for (int i=0 ; i<amountOfVehicles ; i++) {
            if (Agency[i] instanceof Jeep){
                if ((((Jeep) Agency[i]).equals(j))) { // found the vehicle the person wants
                    toDelete = i; // found the index which to delete (after bought)
                    // to prevent deletion of more equal vehicles
                    // because maybe theres several same vehicles, so i prevent with this.
                }
            }
        }
        // delete the vehicle from agency

        if (toDelete < capacityOfAgency) { // that means i need to delete
            Vehicle[] tempAgency = new Vehicle[capacityOfAgency]; // temp array
            for (int l = 0, k = 0; l < amountOfVehicles; l++) {
                // check if index is crossed, continue without copying
                // to delete only the first match, because if there are alot of matching vehicles, he only buys 1.
                if (l == toDelete) {
                    continue;
                } else
                    // else copy the element
                    tempAgency[k++] = Agency[l];
            }
            Agency = tempAgency;
            System.out.print("Vehicle bought successfully! \n");
            JOptionPane.showMessageDialog(null, "Vehicle bought successfully!");
            amountOfVehicles--;
        }
        else    {
            System.out.print("Error, Vehicle not found. Please try again. \n");
            JOptionPane.showMessageDialog(null, "Error, Vehicle not found. Please try again.");
        }*/
        /*int toDelete = -1;
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof Jeep && ((Jeep) Agency[i]).equals(jeep)) {
                toDelete = i;
                break;
            }
        }

        if (toDelete != -1) {
            // Sleep for a random time between 5 and 10 seconds
            try {
                Thread.sleep(new Random().nextInt(6000) + 5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            // Show confirmation window
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to buy this vehicle?") == JOptionPane.YES_OPTION) {
                Vehicle[] tempAgency = new Vehicle[amountOfVehicles - 1];
                for (int l = 0, k = 0; l < amountOfVehicles; l++) {
                    if (l == toDelete) {
                        continue;
                    }
                    tempAgency[k++] = Agency[l];
                }
                Agency = tempAgency;
                System.out.println("Vehicle bought successfully!");
                JOptionPane.showMessageDialog(null, "Vehicle bought successfully!");
                amountOfVehicles--;
            } else {
                System.out.println("Purchase cancelled by the user.");
                JOptionPane.showMessageDialog(null, "Purchase cancelled.");
            }
        } else {
            System.out.println("Error, vehicle not found. Please try again.");
            JOptionPane.showMessageDialog(null, "Error, vehicle not found. Please try again.");
        }*/
        /*int toDelete = -1;
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof Jeep && ((Jeep) Agency[i]).equals(jeep)) {
                toDelete = i;
                break;
            }
        }

        if (toDelete != -1) {
            // Sleep for a random time between 5 and 10 seconds
            try {
                Thread.sleep(new Random().nextInt(6000) + 5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            // Show confirmation window
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to buy this vehicle?") == JOptionPane.YES_OPTION) {
                Vehicle[] tempAgency = new Vehicle[amountOfVehicles - 1];
                for (int l = 0, k = 0; l < amountOfVehicles; l++) {
                    if (l == toDelete) {
                        continue;
                    }
                    tempAgency[k++] = Agency[l];
                }
                Agency = tempAgency;
                System.out.println("Vehicle bought successfully!");
                JOptionPane.showMessageDialog(null, "Vehicle bought successfully!");
                amountOfVehicles--;

                // Show "Updating database... Please wait" message
                JOptionPane.showMessageDialog(null, "Updating database... Please wait");

                // Sleep for a random time between 3 and 8 seconds
                try {
                    Thread.sleep(new Random().nextInt(6000) + 3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                System.out.println("Database updated successfully!");
                JOptionPane.showMessageDialog(null, "Database updated successfully!");
            } else {
                System.out.println("Purchase cancelled by the user.");
                JOptionPane.showMessageDialog(null, "Purchase cancelled.");
            }
        } else {
            System.out.println("Error, vehicle not found. Please try again.");
            JOptionPane.showMessageDialog(null, "Error, vehicle not found. Please try again.");
        }*/
            int toDelete = -1;
            for (int i = 0; i < amountOfVehicles; i++) {
                if (Agency[i] instanceof Jeep && ((Jeep) Agency[i]).equals(jeep)) {
                    toDelete = i;
                    break;
                }
            }

            if (toDelete != -1) {
                // Sleep for a random time between 5 and 10 seconds
                try {
                    Thread.sleep(new Random().nextInt(6000) + 5000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                // Show confirmation window
                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to buy this vehicle?") == JOptionPane.YES_OPTION) {
                    // Shift the elements in the array to remove the bought vehicle
                    for (int i = toDelete; i < amountOfVehicles - 1; i++) {
                        Agency[i] = Agency[i + 1];
                    }
                    Agency[amountOfVehicles - 1] = null; // Set the last element to null

                    System.out.println("Vehicle bought successfully!");
                    JOptionPane.showMessageDialog(null, "Vehicle bought successfully!");
                    amountOfVehicles--;

                    // Show "Updating database... Please wait" message
                    JOptionPane.showMessageDialog(null, "Updating database... Please wait");

                    // Sleep for a random time between 3 and 8 seconds
                    try {
                        Thread.sleep(new Random().nextInt(6000) + 3000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }

                    System.out.println("Database updated successfully!");
                    JOptionPane.showMessageDialog(null, "Database updated successfully!");
                } else {
                    System.out.println("Purchase canceled by the user.");
                    JOptionPane.showMessageDialog(null, "Purchase cancelled.");
                }
            } else {
                System.out.println("Error, vehicle not found. Please try again.");
                JOptionPane.showMessageDialog(null, "Error, vehicle not found. Please try again.");
            }



        /*System.out.println("The New Agency List:");
        for (int z=0 ; z<amountOfVehicles ; z++){
            System.out.println(Agency[z]);
        }*/
    }

    public static void buyFrigateGui(Frigate frigate){
        Vehicle f = frigate;

        int toDelete = -1;
        for (int i=0 ; i<amountOfVehicles ; i++) {
            if (Agency[i] instanceof Frigate){
                if ((((Frigate) Agency[i]).equals(f))) { // found the vehicle the person wants
                    toDelete = i; // found the index which to delete (after bought)
                    // to prevent deletion of more equal vehicles
                    // because maybe theres several same vehicles, so i prevent with this.
                }
            }
        }
        // delete the vehicle from agency

        if (toDelete != -1) {
            // Sleep for a random time between 5 and 10 seconds
            try {
                Thread.sleep(new Random().nextInt(6000) + 5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            // Show confirmation window
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to buy this vehicle?") == JOptionPane.YES_OPTION) {
                // Shift the elements in the array to remove the bought vehicle
                for (int i = toDelete; i < amountOfVehicles - 1; i++) {
                    Agency[i] = Agency[i + 1];
                }
                Agency[amountOfVehicles - 1] = null; // Set the last element to null

                System.out.println("Vehicle bought successfully!");
                JOptionPane.showMessageDialog(null, "Vehicle bought successfully!");
                amountOfVehicles--;

                // Show "Updating database... Please wait" message
                JOptionPane.showMessageDialog(null, "Updating database... Please wait");

                // Sleep for a random time between 3 and 8 seconds
                try {
                    Thread.sleep(new Random().nextInt(6000) + 3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                System.out.println("Database updated successfully!");
                JOptionPane.showMessageDialog(null, "Database updated successfully!");
            } else {
                System.out.println("Purchase canceled by the user.");
                JOptionPane.showMessageDialog(null, "Purchase cancelled.");
            }
        } else {
            System.out.println("Error, vehicle not found. Please try again.");
            JOptionPane.showMessageDialog(null, "Error, vehicle not found. Please try again.");
        }
    }

    public static void buySpyGliderGui(SpyGlider spyGlider){
        Vehicle sg = spyGlider;

        int toDelete = -1;
        for (int i=0 ; i<amountOfVehicles ; i++) {
            if (Agency[i] instanceof SpyGlider){
                if ((((SpyGlider) Agency[i]).equals(sg))) { // found the vehicle the person wants
                    toDelete = i; // found the index which to delete (after bought)
                    // to prevent deletion of more equal vehicles
                    // because maybe theres several same vehicles, so i prevent with this.
                }
            }
        }
        // delete the vehicle from agency

        if (toDelete != -1) {
            // Sleep for a random time between 5 and 10 seconds
            try {
                Thread.sleep(new Random().nextInt(6000) + 5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            // Show confirmation window
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to buy this vehicle?") == JOptionPane.YES_OPTION) {
                // Shift the elements in the array to remove the bought vehicle
                for (int i = toDelete; i < amountOfVehicles - 1; i++) {
                    Agency[i] = Agency[i + 1];
                }
                Agency[amountOfVehicles - 1] = null; // Set the last element to null

                System.out.println("Vehicle bought successfully!");
                JOptionPane.showMessageDialog(null, "Vehicle bought successfully!");
                amountOfVehicles--;

                // Show "Updating database... Please wait" message
                JOptionPane.showMessageDialog(null, "Updating database... Please wait");

                // Sleep for a random time between 3 and 8 seconds
                try {
                    Thread.sleep(new Random().nextInt(6000) + 3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                System.out.println("Database updated successfully!");
                JOptionPane.showMessageDialog(null, "Database updated successfully!");
            } else {
                System.out.println("Purchase canceled by the user.");
                JOptionPane.showMessageDialog(null, "Purchase cancelled.");
            }
        } else {
            System.out.println("Error, vehicle not found. Please try again.");
            JOptionPane.showMessageDialog(null, "Error, vehicle not found. Please try again.");
        }
    }

    public static void buyToyGliderGui(ToyGlider toyGlider){
        Vehicle tg = toyGlider;

        //int toDelete4 = capacityOfAgency+1; // just to make see if theres to delete after
        int toDelete = -1;
        for (int i=0 ; i<amountOfVehicles ; i++) {
            if (Agency[i] instanceof ToyGlider){
                if ((((ToyGlider) Agency[i]).equals(tg))) { // found the vehicle the person wants
                    toDelete = i; // found the index which to delete (after bought)
                    // to prevent deletion of more equal vehicles
                    // because maybe theres several same vehicles, so i prevent with this.
                }
            }
        }
        // delete the vehicle from agency

        if (toDelete != -1) {
            // Sleep for a random time between 5 and 10 seconds
            try {
                Thread.sleep(new Random().nextInt(6000) + 5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            // Show confirmation window
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to buy this vehicle?") == JOptionPane.YES_OPTION) {
                // Shift the elements in the array to remove the bought vehicle
                for (int i = toDelete; i < amountOfVehicles - 1; i++) {
                    Agency[i] = Agency[i + 1];
                }
                Agency[amountOfVehicles - 1] = null; // Set the last element to null

                System.out.println("Vehicle bought successfully!");
                JOptionPane.showMessageDialog(null, "Vehicle bought successfully!");
                amountOfVehicles--;

                // Show "Updating database... Please wait" message
                JOptionPane.showMessageDialog(null, "Updating database... Please wait");

                // Sleep for a random time between 3 and 8 seconds
                try {
                    Thread.sleep(new Random().nextInt(6000) + 3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                System.out.println("Database updated successfully!");
                JOptionPane.showMessageDialog(null, "Database updated successfully!");
            } else {
                System.out.println("Purchase canceled by the user.");
                JOptionPane.showMessageDialog(null, "Purchase cancelled.");
            }
        } else {
            System.out.println("Error, vehicle not found. Please try again.");
            JOptionPane.showMessageDialog(null, "Error, vehicle not found. Please try again.");
        }
    }

    public static void buyAmphibiousGui(AmphibiousVehicle amphibious){
        Vehicle a = amphibious;

       // int toDelete = capacityOfAgency+1; // just to make see if theres to delete after
        int toDelete = -1;
        for (int i=0 ; i<amountOfVehicles ; i++) {
            if (Agency[i] instanceof AmphibiousVehicle){
                if ((((AmphibiousVehicle) Agency[i]).equals(a))) { // found the vehicle the person wants
                    toDelete = i; // found the index which to delete (after bought)
                    // to prevent deletion of more equal vehicles
                    // because maybe theres several same vehicles, so i prevent with this.
                }
            }
        }
        // delete the vehicle from agency

        if (toDelete != -1) {
            // Sleep for a random time between 5 and 10 seconds
            try {
                Thread.sleep(new Random().nextInt(6000) + 5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            // Show confirmation window
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to buy this vehicle?") == JOptionPane.YES_OPTION) {
                // Shift the elements in the array to remove the bought vehicle
                for (int i = toDelete; i < amountOfVehicles - 1; i++) {
                    Agency[i] = Agency[i + 1];
                }
                Agency[amountOfVehicles - 1] = null; // Set the last element to null

                System.out.println("Vehicle bought successfully!");
                JOptionPane.showMessageDialog(null, "Vehicle bought successfully!");
                amountOfVehicles--;

                // Show "Updating database... Please wait" message
                JOptionPane.showMessageDialog(null, "Updating database... Please wait");

                // Sleep for a random time between 3 and 8 seconds
                try {
                    Thread.sleep(new Random().nextInt(6000) + 3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                System.out.println("Database updated successfully!");
                JOptionPane.showMessageDialog(null, "Database updated successfully!");
            } else {
                System.out.println("Purchase canceled by the user.");
                JOptionPane.showMessageDialog(null, "Purchase cancelled.");
            }
        } else {
            System.out.println("Error, vehicle not found. Please try again.");
            JOptionPane.showMessageDialog(null, "Error, vehicle not found. Please try again.");
        }
    }

    public static void buyBicycleGui(Bicycle bicycle) {
        Vehicle a = bicycle;

        //int toDelete = capacityOfAgency+1; // just to make see if theres to delete after
        int toDelete = -1;
        for (int i=0 ; i<amountOfVehicles ; i++) {
            if (Agency[i] instanceof Bicycle){
                if ((((Bicycle) Agency[i]).equals(a))) { // found the vehicle the person wants
                    toDelete = i; // found the index which to delete (after bought)
                    // to prevent deletion of more equal vehicles
                    // because maybe theres several same vehicles, so i prevent with this.
                }
            }
        }
        // delete the vehicle from agency
        if (toDelete != -1) {
            // Sleep for a random time between 5 and 10 seconds
            try {
                Thread.sleep(new Random().nextInt(6000) + 5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            // Show confirmation window
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to buy this vehicle?") == JOptionPane.YES_OPTION) {
                // Shift the elements in the array to remove the bought vehicle
                for (int i = toDelete; i < amountOfVehicles - 1; i++) {
                    Agency[i] = Agency[i + 1];
                }
                Agency[amountOfVehicles - 1] = null; // Set the last element to null

                System.out.println("Vehicle bought successfully!");
                JOptionPane.showMessageDialog(null, "Vehicle bought successfully!");
                amountOfVehicles--;

                // Show "Updating database... Please wait" message
                JOptionPane.showMessageDialog(null, "Updating database... Please wait");

                // Sleep for a random time between 3 and 8 seconds
                try {
                    Thread.sleep(new Random().nextInt(6000) + 3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                System.out.println("Database updated successfully!");
                JOptionPane.showMessageDialog(null, "Database updated successfully!");
            } else {
                System.out.println("Purchase canceled by the user.");
                JOptionPane.showMessageDialog(null, "Purchase cancelled.");
            }
        } else {
            System.out.println("Error, vehicle not found. Please try again.");
            JOptionPane.showMessageDialog(null, "Error, vehicle not found. Please try again.");
        }
    }

    public static void buyCruiseShipGui(CruiseShip cruiseShip){
        Vehicle a = cruiseShip;

        //int toDelete = capacityOfAgency+1; // just to make see if theres to delete after
        int toDelete = -1;
        for (int i=0 ; i<amountOfVehicles ; i++) {
            if (Agency[i] instanceof CruiseShip){
                if ((((CruiseShip) Agency[i]).equals(a))) { // found the vehicle the person wants
                    toDelete = i; // found the index which to delete (after bought)
                    // to prevent deletion of more equal vehicles
                    // because maybe theres several same vehicles, so i prevent with this.
                }
            }
        }
        // delete the vehicle from agency

        if (toDelete != -1) {
            // Sleep for a random time between 5 and 10 seconds
            try {
                Thread.sleep(new Random().nextInt(6000) + 5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            // Show confirmation window
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to buy this vehicle?") == JOptionPane.YES_OPTION) {
                // Shift the elements in the array to remove the bought vehicle
                for (int i = toDelete; i < amountOfVehicles - 1; i++) {
                    Agency[i] = Agency[i + 1];
                }
                Agency[amountOfVehicles - 1] = null; // Set the last element to null

                System.out.println("Vehicle bought successfully!");
                JOptionPane.showMessageDialog(null, "Vehicle bought successfully!");
                amountOfVehicles--;

                // Show "Updating database... Please wait" message
                JOptionPane.showMessageDialog(null, "Updating database... Please wait");

                // Sleep for a random time between 3 and 8 seconds
                try {
                    Thread.sleep(new Random().nextInt(6000) + 3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                System.out.println("Database updated successfully!");
                JOptionPane.showMessageDialog(null, "Database updated successfully!");
            } else {
                System.out.println("Purchase canceled by the user.");
                JOptionPane.showMessageDialog(null, "Purchase cancelled.");
            }
        } else {
            System.out.println("Error, vehicle not found. Please try again.");
            JOptionPane.showMessageDialog(null, "Error, vehicle not found. Please try again.");
        }
    }

    public static void buyElectricBicycleGui(ElectricBicycle electricBicycle){
        Vehicle a = electricBicycle;

        //int toDelete = capacityOfAgency+1; // just to make see if theres to delete after
        int toDelete = -1;
        for (int i=0 ; i<amountOfVehicles ; i++) {
            if (Agency[i] instanceof ElectricBicycle){
                if ((((ElectricBicycle) Agency[i]).equals(a))) { // found the vehicle the person wants
                    toDelete = i; // found the index which to delete (after bought)
                    // to prevent deletion of more equal vehicles
                    // because maybe theres several same vehicles, so i prevent with this.
                }
            }
        }
        // delete the vehicle from agency

        if (toDelete != -1) {
            // Sleep for a random time between 5 and 10 seconds
            try {
                Thread.sleep(new Random().nextInt(6000) + 5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            // Show confirmation window
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to buy this vehicle?") == JOptionPane.YES_OPTION) {
                // Shift the elements in the array to remove the bought vehicle
                for (int i = toDelete; i < amountOfVehicles - 1; i++) {
                    Agency[i] = Agency[i + 1];
                }
                Agency[amountOfVehicles - 1] = null; // Set the last element to null

                System.out.println("Vehicle bought successfully!");
                JOptionPane.showMessageDialog(null, "Vehicle bought successfully!");
                amountOfVehicles--;

                // Show "Updating database... Please wait" message
                JOptionPane.showMessageDialog(null, "Updating database... Please wait");

                // Sleep for a random time between 3 and 8 seconds
                try {
                    Thread.sleep(new Random().nextInt(6000) + 3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                System.out.println("Database updated successfully!");
                JOptionPane.showMessageDialog(null, "Database updated successfully!");
            } else {
                System.out.println("Purchase canceled by the user.");
                JOptionPane.showMessageDialog(null, "Purchase cancelled.");
            }
        } else {
            System.out.println("Error, vehicle not found. Please try again.");
            JOptionPane.showMessageDialog(null, "Error, vehicle not found. Please try again.");
        }
    }

    public static void buyHybridAircraftGui(HybridAircraft hybridAircraft){
        Vehicle a = hybridAircraft;

        //int toDelete = capacityOfAgency+1; // just to make see if theres to delete after
        int toDelete = -1;
        for (int i=0 ; i<amountOfVehicles ; i++) {
            if (Agency[i] instanceof HybridAircraft){
                if ((((HybridAircraft) Agency[i]).equals(a))) { // found the vehicle the person wants
                    toDelete = i; // found the index which to delete (after bought)
                    // to prevent deletion of more equal vehicles
                    // because maybe theres several same vehicles, so i prevent with this.
                }
            }
        }
        // delete the vehicle from agency

        if (toDelete != -1) {
            // Sleep for a random time between 5 and 10 seconds
            try {
                Thread.sleep(new Random().nextInt(6000) + 5000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            // Show confirmation window
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to buy this vehicle?") == JOptionPane.YES_OPTION) {
                // Shift the elements in the array to remove the bought vehicle
                for (int i = toDelete; i < amountOfVehicles - 1; i++) {
                    Agency[i] = Agency[i + 1];
                }
                Agency[amountOfVehicles - 1] = null; // Set the last element to null

                System.out.println("Vehicle bought successfully!");
                JOptionPane.showMessageDialog(null, "Vehicle bought successfully!");
                amountOfVehicles--;

                // Show "Updating database... Please wait" message
                JOptionPane.showMessageDialog(null, "Updating database... Please wait");

                // Sleep for a random time between 3 and 8 seconds
                try {
                    Thread.sleep(new Random().nextInt(6000) + 3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                System.out.println("Database updated successfully!");
                JOptionPane.showMessageDialog(null, "Database updated successfully!");
            } else {
                System.out.println("Purchase canceled by the user.");
                JOptionPane.showMessageDialog(null, "Purchase cancelled.");
            }
        } else {
            System.out.println("Error, vehicle not found. Please try again.");
            JOptionPane.showMessageDialog(null, "Error, vehicle not found. Please try again.");
        }
    }

    public static void testDriveJeepGui(){

        Vehicle j = scanJeepGui();

        int indexToUpdateDistance = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof Jeep) {
                if ((((Jeep) Agency[i]).equals(j))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistance = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistance < capacityOfAgency) { // that means and index is found, so vehicle exists
            //now we need to update the vehicle's test drive distance
            int toUpdateDistanceJeep = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((Jeep) Agency[indexToUpdateDistance]).move(toUpdateDistanceJeep);
            JOptionPane.showMessageDialog(null, "Updated distance to this Vehile by " + toUpdateDistanceJeep +" Km.");
        }
        else    {
            System.out.print("Error, Vehicle not found. Please try again. \n");
            JOptionPane.showMessageDialog(null, "Error, Vehicle not found. Please try again.");
        }

        System.out.println("The New Agency List:");
        for (int z = 0; z < amountOfVehicles; z++) {
            System.out.println(Agency[z]);
        }

    }

    public static void testDriveJeepGui(Jeep jeep){
        System.out.println("testDriveJeepGui");
        Vehicle j = jeep;

        int indexToUpdateDistance = capacityOfAgency + 1; // just to make see if there are to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof Jeep) {
                if ((((Jeep) Agency[i]).equals(j))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistance = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistance < capacityOfAgency) { // that means and index is found, so the vehicle exists
            // Now we need to update the vehicle's test drive distance
            int toUpdateDistanceJeep = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((Jeep) Agency[indexToUpdateDistance]).move(toUpdateDistanceJeep);

            // Add a delay based on the entered distance
            try {
                Thread.sleep(toUpdateDistanceJeep * 100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "Updated distance to this vehicle by " + toUpdateDistanceJeep + " Km.");

            // Show "Updating database... Please wait" message
            JOptionPane.showMessageDialog(null, "Updating database... Please wait");

            // Sleep for a random time between 3 and 8 seconds
            try {
                Thread.sleep((new Random().nextInt(6000) + 3000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println("Database updated successfully!");
            JOptionPane.showMessageDialog(null, "Database updated successfully!");
        } else {
            System.out.print("Error, Vehicle not found. Please try again. \n");
            JOptionPane.showMessageDialog(null, "Error, Vehicle not found. Please try again.");
        }

        /*System.out.println("testDriveJeepGui");
        Vehicle j = jeep;

        int indexToUpdateDistance = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof Jeep) {
                if ((((Jeep) Agency[i]).equals(j))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistance = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistance < capacityOfAgency) { // that means and index is found, so vehicle exists
            //now we need to update the vehicle's test drive distance
            int toUpdateDistanceJeep = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((Jeep) Agency[indexToUpdateDistance]).move(toUpdateDistanceJeep);
            JOptionPane.showMessageDialog(null, "Updated distance to this Vehile by " + toUpdateDistanceJeep +" Km.");
        }
        else    {
            System.out.print("Error, Vehicle not found. Please try again. \n");
            JOptionPane.showMessageDialog(null, "Error, Vehicle not found. Please try again.");
        }*/

        /*System.out.println("The New Agency List:");
        for (int z = 0; z < amountOfVehicles; z++) {
            System.out.println(Agency[z]);
        }*/

    }

    //testDriveJeepGui(jeep);

    public static void testDriveFrigateGui(Frigate frigate){
        System.out.println("testDriveFrigateGui");
        Vehicle f = frigate;
        int indexToUpdateDistanceFrigate = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof Frigate) {
                if ((((Frigate) Agency[i]).equals(f))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistanceFrigate = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistanceFrigate < capacityOfAgency) { // that means and index is found, so the vehicle exists
            // Now we need to update the vehicle's test drive distance
            int toUpdateDistanceFrigate = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((Frigate) Agency[indexToUpdateDistanceFrigate]).move(toUpdateDistanceFrigate);

            // Add a delay based on the entered distance
            try {
                Thread.sleep(toUpdateDistanceFrigate * 100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "Updated distance to this vehicle by " + toUpdateDistanceFrigate + " Km.");

            // Show "Updating database... Please wait" message
            JOptionPane.showMessageDialog(null, "Updating database... Please wait");

            // Sleep for a random time between 3 and 8 seconds
            try {
                Thread.sleep((new Random().nextInt(6000) + 3000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println("Database updated successfully!");
            JOptionPane.showMessageDialog(null, "Database updated successfully!");
        } else {
            System.out.print("Error, Vehicle not found. Please try again. \n");
            JOptionPane.showMessageDialog(null, "Error, Vehicle not found. Please try again.");
        }

    }

    public static void testDriveSpyGliderGui(SpyGlider spyGlider){
        Vehicle sg = spyGlider;

        int indexToUpdateDistanceSpyGlider = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof SpyGlider) {
                if ((((SpyGlider) Agency[i]).equals(sg))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistanceSpyGlider = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistanceSpyGlider < capacityOfAgency) { // that means and index is found, so the vehicle exists
            // Now we need to update the vehicle's test drive distance
            int toUpdateDistanceSpyGlider = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((SpyGlider) Agency[indexToUpdateDistanceSpyGlider]).move(toUpdateDistanceSpyGlider);

            // Add a delay based on the entered distance
            try {
                Thread.sleep(toUpdateDistanceSpyGlider * 100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "Updated distance to this vehicle by " + toUpdateDistanceSpyGlider + " Km.");

            // Show "Updating database... Please wait" message
            JOptionPane.showMessageDialog(null, "Updating database... Please wait");

            // Sleep for a random time between 3 and 8 seconds
            try {
                Thread.sleep((new Random().nextInt(6000) + 3000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println("Database updated successfully!");
            JOptionPane.showMessageDialog(null, "Database updated successfully!");
        } else {
            System.out.print("Error, Vehicle not found. Please try again. \n");
            JOptionPane.showMessageDialog(null, "Error, Vehicle not found. Please try again.");
        }
    }

    public static void testDriveToyGliderGui(ToyGlider toyGlider){
        Vehicle tg = toyGlider;

        int indexToUpdateDistanceToyGlider = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof ToyGlider) {
                if ((((ToyGlider) Agency[i]).equals(tg))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistanceToyGlider = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistanceToyGlider < capacityOfAgency) { // that means and index is found, so the vehicle exists
            // Now we need to update the vehicle's test drive distance
            int toUpdateDistanceToyGlider = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((ToyGlider) Agency[indexToUpdateDistanceToyGlider]).move(toUpdateDistanceToyGlider);

            // Add a delay based on the entered distance
            try {
                Thread.sleep(toUpdateDistanceToyGlider * 100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "Updated distance to this vehicle by " + toUpdateDistanceToyGlider + " Km.");

            // Show "Updating database... Please wait" message
            JOptionPane.showMessageDialog(null, "Updating database... Please wait");

            // Sleep for a random time between 3 and 8 seconds
            try {
                Thread.sleep((new Random().nextInt(6000) + 3000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println("Database updated successfully!");
            JOptionPane.showMessageDialog(null, "Database updated successfully!");
        } else {
            System.out.print("Error, Vehicle not found. Please try again. \n");
            JOptionPane.showMessageDialog(null, "Error, Vehicle not found. Please try again.");
        }
    }

    public static void testDriveAmphibiousGui(AmphibiousVehicle amphibious){
        Vehicle j = amphibious;

        int indexToUpdateDistance = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof AmphibiousVehicle) {
                if ((((AmphibiousVehicle) Agency[i]).equals(j))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistance = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistance < capacityOfAgency) { // that means and index is found, so the vehicle exists
            // Now we need to update the vehicle's test drive distance
            int toUpdateDistance = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((AmphibiousVehicle) Agency[indexToUpdateDistance]).move(toUpdateDistance);

            // Add a delay based on the entered distance
            try {
                Thread.sleep(toUpdateDistance * 100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "Updated distance to this vehicle by " + toUpdateDistance+ " Km.");

            // Show "Updating database... Please wait" message
            JOptionPane.showMessageDialog(null, "Updating database... Please wait");

            // Sleep for a random time between 3 and 8 seconds
            try {
                Thread.sleep((new Random().nextInt(6000) + 3000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println("Database updated successfully!");
            JOptionPane.showMessageDialog(null, "Database updated successfully!");
        } else {
            System.out.print("Error, Vehicle not found. Please try again. \n");
            JOptionPane.showMessageDialog(null, "Error, Vehicle not found. Please try again.");
        }
    }

    public static void testDriveBicycleGui(Bicycle bicycle){
        Vehicle j = bicycle;

        int indexToUpdateDistance = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof Bicycle) {
                if ((((Bicycle) Agency[i]).equals(j))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistance = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistance < capacityOfAgency) { // that means and index is found, so the vehicle exists
            // Now we need to update the vehicle's test drive distance
            int toUpdateDistance = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((Bicycle) Agency[indexToUpdateDistance]).move(toUpdateDistance);

            // Add a delay based on the entered distance
            try {
                Thread.sleep(toUpdateDistance * 100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "Updated distance to this vehicle by " + toUpdateDistance+ " Km.");

            // Show "Updating database... Please wait" message
            JOptionPane.showMessageDialog(null, "Updating database... Please wait");

            // Sleep for a random time between 3 and 8 seconds
            try {
                Thread.sleep((new Random().nextInt(6000) + 3000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println("Database updated successfully!");
            JOptionPane.showMessageDialog(null, "Database updated successfully!");
        } else {
            System.out.print("Error, Vehicle not found. Please try again. \n");
            JOptionPane.showMessageDialog(null, "Error, Vehicle not found. Please try again.");
        }


    }

    public static void testDriveCruiseShipGui(CruiseShip cruiseShip){
        Vehicle j = cruiseShip;

        int indexToUpdateDistance = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof CruiseShip) {
                if ((((CruiseShip) Agency[i]).equals(j))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistance = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistance < capacityOfAgency) { // that means and index is found, so the vehicle exists
            // Now we need to update the vehicle's test drive distance
            int toUpdateDistance = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((CruiseShip) Agency[indexToUpdateDistance]).move(toUpdateDistance);

            // Add a delay based on the entered distance
            try {
                Thread.sleep(toUpdateDistance * 100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "Updated distance to this vehicle by " + toUpdateDistance+ " Km.");

            // Show "Updating database... Please wait" message
            JOptionPane.showMessageDialog(null, "Updating database... Please wait");

            // Sleep for a random time between 3 and 8 seconds
            try {
                Thread.sleep((new Random().nextInt(6000) + 3000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println("Database updated successfully!");
            JOptionPane.showMessageDialog(null, "Database updated successfully!");
        } else {
            System.out.print("Error, Vehicle not found. Please try again. \n");
            JOptionPane.showMessageDialog(null, "Error, Vehicle not found. Please try again.");
        }
    }

    public static void testDriveElectricBicycleGui(ElectricBicycle electricBicycle){
        Vehicle j = electricBicycle;

        int indexToUpdateDistance = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof ElectricBicycle) {
                if ((((ElectricBicycle) Agency[i]).equals(j))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistance = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistance < capacityOfAgency) { // that means and index is found, so the vehicle exists
            // Now we need to update the vehicle's test drive distance
            int toUpdateDistance = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((ElectricBicycle) Agency[indexToUpdateDistance]).move(toUpdateDistance);

            // Add a delay based on the entered distance
            try {
                Thread.sleep(toUpdateDistance * 100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "Updated distance to this vehicle by " + toUpdateDistance+ " Km.");

            // Show "Updating database... Please wait" message
            JOptionPane.showMessageDialog(null, "Updating database... Please wait");

            // Sleep for a random time between 3 and 8 seconds
            try {
                Thread.sleep((new Random().nextInt(6000) + 3000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println("Database updated successfully!");
            JOptionPane.showMessageDialog(null, "Database updated successfully!");
        } else {
            System.out.print("Error, Vehicle not found. Please try again. \n");
            JOptionPane.showMessageDialog(null, "Error, Vehicle not found. Please try again.");
        }

    }

    public static void  testDriveHybridAircraftGui(HybridAircraft hybridAircraft){
        Vehicle j = hybridAircraft;

        int indexToUpdateDistance = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof HybridAircraft) {
                if ((((HybridAircraft) Agency[i]).equals(j))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistance = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistance < capacityOfAgency) { // that means and index is found, so the vehicle exists
            // Now we need to update the vehicle's test drive distance
            int toUpdateDistance = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((HybridAircraft) Agency[indexToUpdateDistance]).move(toUpdateDistance);

            // Add a delay based on the entered distance
            try {
                Thread.sleep(toUpdateDistance * 100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "Updated distance to this vehicle by " + toUpdateDistance+ " Km.");

            // Show "Updating database... Please wait" message
            JOptionPane.showMessageDialog(null, "Updating database... Please wait");

            // Sleep for a random time between 3 and 8 seconds
            try {
                Thread.sleep((new Random().nextInt(6000) + 3000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println("Database updated successfully!");
            JOptionPane.showMessageDialog(null, "Database updated successfully!");
        } else {
            System.out.print("Error, Vehicle not found. Please try again. \n");
            JOptionPane.showMessageDialog(null, "Error, Vehicle not found. Please try again.");
        }
    }




    public static void resetDistanceTraveledAll(){
        for (int i = 0; i < amountOfVehicles; i++) {
            Agency[i].setDistanceTraveled(0);
        }
        JOptionPane.showMessageDialog(null, "Distance traveled for ALL the Vehicles has been Reset");
    }
    public static void changeFlagOfAllMarineVehiclesGui(){

        String chosenFlag = JOptionPane.showInputDialog(null, "Which Flag you want All Marine Vehicles to have?: ");
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof MarineVehicle) {
                ((MarineVehicle) Agency[i]).setCountryFlag(chosenFlag);
            }
        }
        JOptionPane.showMessageDialog(null, "Flag for All the Marine Vehicles have been Changed to " + chosenFlag +".");
    }

    /*public static void addVehicleToAgency() {
        JFrame frame = new JFrame("Vehicle Agency - Add Vehicles Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(2, 5));

        // Jeep button+image
        ImageIcon imageIconJeep = new ImageIcon("src/Images/jeep.png");
        JButton jeepButton = createButtonWithImage("Jeep", imageIconJeep, "Jeep");
        frame.add(jeepButton);

        // Frigate button+image
        ImageIcon imageIconFrigate = new ImageIcon("src/Images/frigate.png");
        JButton frigateButton = createButtonWithImage("Frigate", imageIconFrigate, "Frigate");
        frame.add(frigateButton);

        // SpyGlider button+image
        ImageIcon imageIconSpyGlider = new ImageIcon("src/Images/spyGlider.png");
        JButton spyGliderButton = createButtonWithImage("SpyGlider", imageIconSpyGlider, "SpyGlider");
        frame.add(spyGliderButton);

        // ToyGlider button+image
        ImageIcon imageIconToyGlider = new ImageIcon("src/Images/toyGlider.png");
        JButton toyGliderButton = createButtonWithImage("ToyGlider", imageIconToyGlider, "ToyGlider");
        frame.add(toyGliderButton);

        // Amphibious button+image
        ImageIcon imageIconAmphibious = new ImageIcon("src/Images/amphibious.png");
        JButton amphibiousButton = createButtonWithImage("Amphibious", imageIconAmphibious, "Amphibious");
        frame.add(amphibiousButton);

        // Bicycle button+image
        ImageIcon imageIconBicycle = new ImageIcon("src/Images/bicycle.png");
        JButton bicycleButton = createButtonWithImage("Bicycle", imageIconBicycle, "Bicycle");
        frame.add(bicycleButton);

        frame.setVisible(true);
    }

    private static JButton createButtonWithImage(String text, ImageIcon imageIcon, String actionCommand) {
        JButton button = new JButton(text, imageIcon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.addActionListener(this);
        button.setActionCommand(actionCommand);
        return button;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }*/
    static void addVehicleToAgency() {
        JFrame frame = new JFrame();
        frame.setTitle("Vehicle Agency - Add Vehicles Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(2, 5));

        // Jeep button+image
        ImageIcon imageIconJeep = new ImageIcon("src/Images/jeep.png");
        JButton jeepButton = createButtonWithImage("Jeep", imageIconJeep, "Jeep");
        frame.add(jeepButton);

        // Frigate button+image
        ImageIcon imageIconFrigate = new ImageIcon("src/Images/frigate.png");
        JButton frigateButton = createButtonWithImage("Frigate", imageIconFrigate, "Frigate");
        frame.add(frigateButton);

        // SpyGlider button+image
        ImageIcon imageIconSpyGlider = new ImageIcon("src/Images/spyGlider.png");
        JButton spyGliderButton = createButtonWithImage("SpyGlider", imageIconSpyGlider, "SpyGlider");
        frame.add(spyGliderButton);

        // ToyGlider button+image
        ImageIcon imageIconToyGlider = new ImageIcon("src/Images/toyGlider.png");
        JButton toyGliderButton = createButtonWithImage("ToyGlider", imageIconToyGlider, "ToyGlider");
        frame.add(toyGliderButton);

        // Amphibious button+image
        ImageIcon imageIconAmphibious = new ImageIcon("src/Images/amphibious.png");
        JButton amphibiousButton = createButtonWithImage("Amphibious", imageIconAmphibious, "Amphibious");
        frame.add(amphibiousButton);

        // Bicycle button+image
        ImageIcon imageIconBicycle = new ImageIcon("src/Images/bicycle.png");
        JButton bicycleButton = createButtonWithImage("Bicycle", imageIconBicycle, "Bicycle");
        frame.add(bicycleButton);

        // CruiseShip button+image
        ImageIcon imageIconCruiseShip = new ImageIcon("src/Images/cruiseShip.png");
        JButton cruiseShipButton = createButtonWithImage("CruiseShip", imageIconCruiseShip, "CruiseShip");
        frame.add(cruiseShipButton);

        // HybridAircraft button+image
        ImageIcon imageIconHybridAircraft = new ImageIcon("src/Images/hybridAircraft.png");
        JButton hybridAircraftButton = createButtonWithImage("HybridAircraft", imageIconHybridAircraft, "HybridAircraft");
        frame.add(hybridAircraftButton);

        // ElectricBicycle button+image
        ImageIcon imageIconElectricBicycle = new ImageIcon("src/Images/electricBicycle.png");
        JButton electricBicycleButton = createButtonWithImage("ElectricBicycle", imageIconElectricBicycle, "ElectricBicycle");
        frame.add(electricBicycleButton);

        // Finish button
        JButton finishButton = new JButton("Finish");
        frame.add(finishButton);

        // Set the frame visible
        frame.setVisible(true);
    }


    private static JButton createButtonWithImage(String buttonText, ImageIcon imageIcon, String actionCommand) {
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(scaledImage);

        JButton button = new JButton(buttonText, imageIcon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.addActionListener(new GraphicMenus());
        button.setActionCommand(actionCommand);

        return button;
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "Jeep":
                if (amountOfVehicles < capacityOfAgency) {
                    Agency[amountOfVehicles] = GraphicMenus.scanJeepGui();
                    amountOfVehicles++;
                    System.out.println("Jeep added successfully!");
                    JOptionPane.showMessageDialog(null, "Jeep added successfully!");
                } else {
                    System.out.println("Error, Agency is full. Cannot add more vehicles.");
                    JOptionPane.showMessageDialog(null, "Error, Agency is full. Cannot add more vehicles.");
                }
                break;

            case "Frigate":
                if (amountOfVehicles < capacityOfAgency) {
                    Agency[amountOfVehicles] = scanFrigateGui();
                    amountOfVehicles++;
                    System.out.println("Frigate added successfully!");
                    JOptionPane.showMessageDialog(null, "Frigate added successfully!");
                } else {
                    System.out.println("Error, Agency is full. Cannot add more vehicles.");
                    JOptionPane.showMessageDialog(null, "Error, Agency is full. Cannot add more vehicles.");
                }
                break;
            case "Finish":
                // Close the current window
                Window window = SwingUtilities.windowForComponent((Component) e.getSource());
                window.dispose();

                // Open the SecondMenu window
                SecondMenu.main(null);
                break;
            // Handle other vehicle types similarly
        }
    }
}