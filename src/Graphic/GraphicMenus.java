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
        Vehicle a = new Frigate(modelFrigate, numOfPassengersFrigate, maxSpeedFrigate, sailWindDirectionFrigate, distanceTraveledFrigate);
        return a;
    }

    public static Vehicle scanSpyGliderGui(){
        String powerSourceSpyGlider = JOptionPane.showInputDialog(null, "Please Enter Power Source (Battery, Solar, Fuel, Manual): ");
        int distanceTraveledSpyGlider = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Distance traveled: "));

        Vehicle a = new SpyGlider(powerSourceSpyGlider, distanceTraveledSpyGlider);
        return a;
    }

    public static Vehicle scanToyGliderGui(){
        int distanceTraveledSpyGlider = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Distance traveled: "));
        Vehicle a = new ToyGlider(distanceTraveledSpyGlider);
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
        Vehicle a = new AmphibiousVehicle(model, distanceTraveled, numOfPassengers, maxSpeed, avgFuelConsumption,avgEngineLifeSpan,numOfWheels,sailWindDirection,flag);
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

        Vehicle a = new Bicycle(model,distanceTraveled,numOfPassengers,maxSpeed,flagBool);
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
        Vehicle a = new CruiseShip(model,distanceTraveled,numOfPassengers,maxSpeed,countryFlag,avgFuelConsumption,avgEngineLifeSpan);
        return a;

    }

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

    public static void buyFrigateGui(){
        Vehicle f = scanFrigateGui();

        int toDelete2 = capacityOfAgency+1; // just to make see if theres to delete after
        for (int i=0 ; i<amountOfVehicles ; i++) {
            if (Agency[i] instanceof Frigate){
                if ((((Frigate) Agency[i]).equals(f))) { // found the vehicle the person wants
                    toDelete2 = i; // found the index which to delete (after bought)
                    // to prevent deletion of more equal vehicles
                    // because maybe theres several same vehicles, so i prevent with this.
                }
            }
        }
        // delete the vehicle from agency

        if (toDelete2 < capacityOfAgency) { // that means i need to delete
            Vehicle[] tempAgency = new Vehicle[capacityOfAgency]; // temp array
            for (int l = 0, k = 0; l < amountOfVehicles; l++) {
                // check if index is crossed, continue without copying
                // to delete only the first match, because if there are alot of matching vehicles, he only buys 1.
                if (l == toDelete2) {
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

    public static void buySpyGliderGui(){
        Vehicle sg = scanSpyGliderGui();

        int toDelete3 = capacityOfAgency+1; // just to make see if theres to delete after
        for (int i=0 ; i<amountOfVehicles ; i++) {
            if (Agency[i] instanceof SpyGlider){
                if ((((SpyGlider) Agency[i]).equals(sg))) { // found the vehicle the person wants
                    toDelete3 = i; // found the index which to delete (after bought)
                    // to prevent deletion of more equal vehicles
                    // because maybe theres several same vehicles, so i prevent with this.
                }
            }
        }
        // delete the vehicle from agency

        if (toDelete3 < capacityOfAgency) { // that means i need to delete
            Vehicle[] tempAgency = new Vehicle[capacityOfAgency]; // temp array
            for (int l = 0, k = 0; l < amountOfVehicles; l++) {
                // check if index is crossed, continue without copying
                // to delete only the first match, because if there are alot of matching vehicles, he only buys 1.
                if (l == toDelete3) {
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

    public static void buyToyGliderGui(){
        Vehicle tg = scanToyGliderGui();

        int toDelete4 = capacityOfAgency+1; // just to make see if theres to delete after
        for (int i=0 ; i<amountOfVehicles ; i++) {
            if (Agency[i] instanceof ToyGlider){
                if ((((ToyGlider) Agency[i]).equals(tg))) { // found the vehicle the person wants
                    toDelete4 = i; // found the index which to delete (after bought)
                    // to prevent deletion of more equal vehicles
                    // because maybe theres several same vehicles, so i prevent with this.
                }
            }
        }
        // delete the vehicle from agency

        if (toDelete4 < capacityOfAgency) { // that means i need to delete
            Vehicle[] tempAgency = new Vehicle[capacityOfAgency]; // temp array
            for (int l = 0, k = 0; l < amountOfVehicles; l++) {
                // check if index is crossed, continue without copying
                // to delete only the first match, because if there are alot of matching vehicles, he only buys 1.
                if (l == toDelete4) {
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

    public static void buyAmphibiousGui(){
        Vehicle a = scanAmphibiousGui();

        int toDelete = capacityOfAgency+1; // just to make see if theres to delete after
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

    public static void buyBicycleGui() {
        Vehicle a = scanBicycleGui();

        int toDelete = capacityOfAgency+1; // just to make see if theres to delete after
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

    public static void buyCruiseShipGui(){
        Vehicle a = scanCruiseShipGui();

        int toDelete = capacityOfAgency+1; // just to make see if theres to delete after
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
        else    {
            System.out.print("Error, Vehicle not found. Please try again. \n");
            JOptionPane.showMessageDialog(null, "Error, Vehicle not found. Please try again.");
        }

        System.out.println("The New Agency List:");
        for (int z = 0; z < amountOfVehicles; z++) {
            System.out.println(Agency[z]);
        }

    }

    public static void testDriveFrigateGui(){
        Vehicle f = scanFrigateGui();

        int indexToUpdateDistanceFrigate = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof Frigate) {
                if ((((Frigate) Agency[i]).equals(f))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistanceFrigate = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistanceFrigate < capacityOfAgency) { // that means and index is found, so vehicle exists
            //now we need to update the vehicle's test drive distance
            int toUpdateDistanceFrigate = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((Frigate) Agency[indexToUpdateDistanceFrigate]).move(toUpdateDistanceFrigate);
            JOptionPane.showMessageDialog(null, "Updated distance to this Vehile by " + toUpdateDistanceFrigate +" Km.");
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

    public static void testDriveSpyGliderGui(){
        Vehicle sg = scanSpyGliderGui();

        int indexToUpdateDistanceSpyGlider = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof SpyGlider) {
                if ((((SpyGlider) Agency[i]).equals(sg))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistanceSpyGlider = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistanceSpyGlider < capacityOfAgency) { // that means and index is found, so vehicle exists
            //now we need to update the vehicle's test drive distance
            int toUpdateDistanceSpyGlider = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((SpyGlider) Agency[indexToUpdateDistanceSpyGlider]).move(toUpdateDistanceSpyGlider);
            JOptionPane.showMessageDialog(null, "Updated distance to this Vehile by " + toUpdateDistanceSpyGlider +" Km.");
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

    public static void testDriveToyGliderGui(){
        Vehicle tg = scanToyGliderGui();

        int indexToUpdateDistanceToyGlider = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof ToyGlider) {
                if ((((ToyGlider) Agency[i]).equals(tg))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistanceToyGlider = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistanceToyGlider < capacityOfAgency) { // that means and index is found, so vehicle exists
            //now we need to update the vehicle's test drive distance
            int toUpdateDistanceToyGlider = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((ToyGlider) Agency[indexToUpdateDistanceToyGlider]).move(toUpdateDistanceToyGlider);
            JOptionPane.showMessageDialog(null, "Updated distance to this Vehile by " + toUpdateDistanceToyGlider + " Km.");
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

    public static void testDriveAmphibiousGui(){
        Vehicle j = scanAmphibiousGui();

        int indexToUpdateDistance = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof AmphibiousVehicle) {
                if ((((AmphibiousVehicle) Agency[i]).equals(j))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistance = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistance < capacityOfAgency) { // that means and index is found, so vehicle exists
            //now we need to update the vehicle's test drive distance
            int toUpdateDistanceAmphibious = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((AmphibiousVehicle) Agency[indexToUpdateDistance]).move(toUpdateDistanceAmphibious);
            JOptionPane.showMessageDialog(null, "Updated distance to this Vehile by " + toUpdateDistanceAmphibious + " Km.");
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

    public static void testDriveBicycleGui(){
        Vehicle j = scanBicycleGui();

        int indexToUpdateDistance = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof Bicycle) {
                if ((((Bicycle) Agency[i]).equals(j))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistance = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistance < capacityOfAgency) { // that means and index is found, so vehicle exists
            //now we need to update the vehicle's test drive distance
            int toUpdateDistanceBicycle = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((Bicycle) Agency[indexToUpdateDistance]).move(toUpdateDistanceBicycle);
            JOptionPane.showMessageDialog(null, "Updated distance to this Vehile by " + toUpdateDistanceBicycle +" Km.");
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

    public static void testDriveCruiseShipGui(){
        Vehicle j = scanCruiseShipGui();

        int indexToUpdateDistance = capacityOfAgency + 1; // just to make see if theres to delete after
        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof CruiseShip) {
                if ((((CruiseShip) Agency[i]).equals(j))) { // found the vehicle the person wants (equals2 is with ignoring distance because of the testdrives loops)
                    indexToUpdateDistance = i; // found the index which to update
                }
            }
        }

        if (indexToUpdateDistance < capacityOfAgency) { // that means and index is found, so vehicle exists
            //now we need to update the vehicle's test drive distance
            int toUpdateDistanceCruiseShip = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the distance of the test drive: "));
            ((CruiseShip) Agency[indexToUpdateDistance]).move(toUpdateDistanceCruiseShip);
            JOptionPane.showMessageDialog(null, "Updated distance to this Vehile by " + toUpdateDistanceCruiseShip +" Km.");
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