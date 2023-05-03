package Graphic;

import Vehicle.Vehicle;
import Vehicle.Jeep;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import System.Menus;

import static System.Main.*;
import Vehicle.MarineVehicle;

import java.util.Arrays;
import java.util.Vector;


public class GraphicMenus {


    public static void printAllVehiclesGui(){
        // Print all the List Available Vehicles in stock.
        System.out.println("\nList of Available Vehicles in stock:");
        for (int i = 0; i < amountOfVehicles; i++) {
            System.out.println(Agency[i]);
        }
    }

    public static void printAllVehiclesGuiPop(){
        // Print all the List Available Vehicles in stock.

        String[] strArray = { };
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < amountOfVehicles; i++) {
            stringBuilder.append(Agency[i]);
            stringBuilder.append("\n");
        }
        String joinedString = stringBuilder.toString();
        JOptionPane.showMessageDialog(null, "List of Available Vehicles in stock:\n" + joinedString);
    }


    public static void printAllVehiclesGuiPopTable(){
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


        TableModel model = new DefaultTableModel(dataVector, header);
        JTable table = new JTable(model);

        JFrame frame = new JFrame("DemoFrame");
        frame.add(new JScrollPane(table));
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );



    }

    public static Vehicle scanJeepGui(){
        String modelJeep = JOptionPane.showInputDialog(null, "Please Enter Model: ");
        double avgFuelConsumptionJeep = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Average Fuel Consumption: "));
        int maxSpeedJeep = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Max speed: "));
        double avgEngineLifeSpanJeep = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Average Engine Life Span: "));

        Vehicle a = new Jeep(modelJeep, avgFuelConsumptionJeep, maxSpeedJeep, avgEngineLifeSpanJeep);
        return a;
    }

    // public static Vehicle scanFrigateGui(){ }

    // public static Vehicle scanAllTheRest...


    public static void buyJeepGui(){

        Vehicle j = scanJeepGui();

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
        }

        System.out.println("The New Agency List:");
        for (int z=0 ; z<amountOfVehicles ; z++){
            System.out.println(Agency[z]);
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
        else
            System.out.print("Error, Vehicle not found. Please try again. \n");

        System.out.println("The New Agency List:");
        for (int z = 0; z < amountOfVehicles; z++) {
            System.out.println(Agency[z]);
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




}