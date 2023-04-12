package System;
import Vehicle.Vehicle;
import Vehicle.MarineVehicle;
import Vehicle.Jeep;
import Vehicle.Frigate;
import Vehicle.SpyGlider;
import Vehicle.ToyGlider;

import java.util.Scanner;

import static System.Main.*;

public class Menus {

    public Menus() {}


    public void printAllVehicles(){
        // Print all the List Available Vehicles in stock.
        System.out.println("List of Available Vehicles in stock:\n");
        for (int i = 0; i < amountOfVehicles; i++) {
            System.out.println(Agency[i]);
        }
    }

    public String myScanLine() {
        Scanner sc = new Scanner(System.in);
        String intInputValue = sc.nextLine();
        return intInputValue;
    }

    public int myScanInt(){
        Scanner sc = new Scanner(System.in);
        int intInputValue = 0;
        while (true) {
            String input = sc.next();
            try {
                intInputValue = Integer.parseInt(input);
                break;
            } catch (NumberFormatException ne) {
                System.out.println("Input must be Integer");
            }
        }
        return intInputValue;
    }

    public double myScanDouble(){
        Scanner sc = new Scanner(System.in);
        double intInputValue = 0;
        while (true) {
            String input = sc.next();
            try {
                intInputValue = Double.parseDouble(input);
                break;
            } catch (NumberFormatException ne) {
                System.out.println("Input must be Integer or Double");
            }
        }
        return intInputValue;
    }

    public  void addJeep() {

        //Jeep(String model, double avgFuelConsumption, int maxSpeed, double avgEngineLifeSpan)
        System.out.print("Please Enter Model: \n");
        String modelJeep = myScanLine();

        System.out.print("Please Enter Average Fuel Consumption: \n");
        double avgFuelConsumptionJeep = myScanDouble();

        System.out.print("Please Enter Max speed: \n");
        int maxSpeedJeep = myScanInt();

        System.out.print("Please Average Engine Life Span: \n");
        double avgEngineLifeSpanJeep = myScanDouble();

        //Vehicle j = new Jeep(modelJeep, avgFuelConsumptionJeep, maxSpeedJeep, avgEngineLifeSpanJeep);
        //System.out.println(j.toString());

        //Vehicle[] Agency = new Vehicle[3];
        Agency[amountOfVehicles] = new Jeep(modelJeep, avgFuelConsumptionJeep, maxSpeedJeep, avgEngineLifeSpanJeep);
        amountOfVehicles++;
    }

    public void addFrigate(){

        System.out.print("Please Enter Model: \n");
        String modelFrigate = myScanLine();

        System.out.print("Please Enter Number of passengers: \n");
        int numOfPassengersFrigate = myScanInt();

        System.out.print("Please Enter Max speed: \n");
        int maxSpeedFrigate = myScanInt();

        System.out.print("Sailing in wind direction? (yes or no): \n");
        String withWindDirectionFrigate = myScanLine(); // yes/no
        boolean sailWindDirectionFrigate = false;
        if (withWindDirectionFrigate.equals("yes")) {
            sailWindDirectionFrigate = true;
        } // else it stays false (no)

        System.out.print("Please Enter Distance traveled: \n");
        int distanceTraveledFrigate = myScanInt();

        //Vehicle f = new Frigate(modelFrigate, numOfPassengersFrigate, maxSpeedFrigate, sailWindDirectionFrigate, distanceTraveledFrigate);
        //System.out.println(f.toString());
        Agency[amountOfVehicles] = new Frigate(modelFrigate, numOfPassengersFrigate, maxSpeedFrigate, sailWindDirectionFrigate, distanceTraveledFrigate);
        amountOfVehicles++;
    }

    public void addSpyGlider(){
        System.out.print("Please Enter Power Source (Battery, Solar, Fuel): \n");
        String powerSourceSpyGlider = myScanLine();

        System.out.print("Please Enter Distance traveled: \n");
        int distanceTraveledSpyGlider = myScanInt();

        //Vehicle sg = new SpyGlider(powerSourceSpyGlider, distanceTraveledSpyGlider);
        //System.out.println(sg.toString());
        Agency[amountOfVehicles] = new SpyGlider(powerSourceSpyGlider, distanceTraveledSpyGlider);
        amountOfVehicles++;
    }

    public void addToyGlider() {
        System.out.print("Please Enter Distance traveled: \n");
        int distanceTraveledToyGlider = myScanInt();

        //Vehicle tg = new ToyGlider(distanceTraveledToyGlider);
        //System.out.println(tg.toString());

        Agency[amountOfVehicles] = new ToyGlider(distanceTraveledToyGlider);
        amountOfVehicles++;
    }

    public void buyJeep(){
        //Jeep(String model, double avgFuelConsumption, int maxSpeed, double avgEngineLifeSpan)
        System.out.print("Please Enter Model: \n");
        String modelJeep = myScanLine();

        System.out.print("Please Enter Average Fuel Consumption: \n");
        double avgFuelConsumptionJeep = myScanDouble();

        System.out.print("Please Enter Max speed: \n");
        int maxSpeedJeep = myScanInt();

        System.out.print("Please Average Engine Life Span: \n");
        double avgEngineLifeSpanJeep = myScanDouble();
        // j = persons choice to buy
        Vehicle j = new Jeep(modelJeep, avgFuelConsumptionJeep, maxSpeedJeep, avgEngineLifeSpanJeep);

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
            amountOfVehicles--;
        }
        else
            System.out.print("Error, Vehicle not found. Please try again. \n");

        System.out.println("The New Agency List:");
        for (int z=0 ; z<amountOfVehicles ; z++){
            System.out.println(Agency[z]);
        }
    }

    public void buyFrigate(){
        System.out.print("Please Enter Model: \n");
        String modelFrigate = myScanLine();

        System.out.print("Please Enter Number of passengers: \n");
        int numOfPassengersFrigate = myScanInt();

        System.out.print("Please Enter Max speed: \n");
        int maxSpeedFrigate = myScanInt();

        System.out.print("Sailing in wind direction? (yes or no): \n");
        String withWindDirectionFrigate = myScanLine(); // yes/no
        boolean sailWindDirectionFrigate = false;
        if (withWindDirectionFrigate.equals("yes")) {
            sailWindDirectionFrigate = true;
        } // else it stays false (no)

        System.out.print("Please Enter Distance traveled: \n");
        int distanceTraveledFrigate = myScanInt();

        Vehicle f = new Frigate(modelFrigate, numOfPassengersFrigate, maxSpeedFrigate, sailWindDirectionFrigate, distanceTraveledFrigate);

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
            amountOfVehicles--;
        }
        else
            System.out.print("Error, Vehicle not found. Please try again. \n");

        System.out.println("The New Agency List:");
        for (int z=0 ; z<amountOfVehicles ; z++){
            System.out.println(Agency[z]);
        }
    }

    public void buySpyGlider(){
        System.out.print("Please Enter Power Source (Battery, Solar, Fuel): \n");
        String powerSourceSpyGlider = myScanLine();

        System.out.print("Please Enter Distance traveled: \n");
        int distanceTraveledSpyGlider = myScanInt();

        Vehicle sg = new SpyGlider(powerSourceSpyGlider, distanceTraveledSpyGlider);

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
            amountOfVehicles--;
        }
        else
            System.out.print("Error, Vehicle not found. Please try again. \n");

        System.out.println("The New Agency List:");
        for (int z=0 ; z<amountOfVehicles ; z++){
            System.out.println(Agency[z]);
        }
    }

    public void buyToyGlider(){

        System.out.print("Please Enter Distance traveled: \n");
        int distanceTraveledToyGlider = myScanInt();

        Vehicle tg = new ToyGlider(distanceTraveledToyGlider);

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
            amountOfVehicles--;
        }
        else
            System.out.print("Error, Vehicle not found. Please try again. \n");

        System.out.println("The New Agency List:");
        for (int z=0 ; z<amountOfVehicles ; z++){
            System.out.println(Agency[z]);
        }
    }

    public void testDriveJeep(){
        //Jeep(String model, double avgFuelConsumption, int maxSpeed, double avgEngineLifeSpan)
        System.out.print("Please Enter Model: \n");
        String modelJeep = myScanLine();

        System.out.print("Please Enter Average Fuel Consumption: \n");
        double avgFuelConsumptionJeep = myScanDouble();

        System.out.print("Please Enter Max speed: \n");
        int maxSpeedJeep = myScanInt();

        System.out.print("Please Average Engine Life Span: \n");
        double avgEngineLifeSpanJeep = myScanDouble();
        // j = persons choice to buy
        Vehicle j = new Jeep(modelJeep, avgFuelConsumptionJeep, maxSpeedJeep, avgEngineLifeSpanJeep);

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
            System.out.print("Please Enter the distance of the test drive: \n");
            int toUpdateDistanceJeep = myScanInt();
            ((Jeep) Agency[indexToUpdateDistance]).move(toUpdateDistanceJeep);
        }
        else
            System.out.print("Error, Vehicle not found. Please try again. \n");

        System.out.println("The New Agency List:");
        for (int z = 0; z < amountOfVehicles; z++) {
            System.out.println(Agency[z]);
        }

    }

    public void testDriveFrigate(){
        System.out.print("Please Enter Model: \n");
        String modelFrigate = myScanLine();

        System.out.print("Please Enter Number of passengers: \n");
        int numOfPassengersFrigate = myScanInt();

        System.out.print("Please Enter Max speed: \n");
        int maxSpeedFrigate = myScanInt();

        System.out.print("Sailing in wind direction? (yes or no): \n");
        String withWindDirectionFrigate = myScanLine(); // yes/no
        boolean sailWindDirectionFrigate = false;
        if (withWindDirectionFrigate.equals("yes")) {
            sailWindDirectionFrigate = true;
        } // else it stays false (no)

        System.out.print("Please Enter Distance traveled: \n");
        int distanceTraveledFrigate = myScanInt();

        Vehicle f = new Frigate(modelFrigate, numOfPassengersFrigate, maxSpeedFrigate, sailWindDirectionFrigate, distanceTraveledFrigate);

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
            System.out.print("Please Enter the distance of the test drive: \n");
            int toUpdateDistanceFrigate = myScanInt();
            ((Frigate) Agency[indexToUpdateDistanceFrigate]).move(toUpdateDistanceFrigate);
        }
        else
            System.out.print("Error, Vehicle not found. Please try again. \n");

        System.out.println("The New Agency List:");
        for (int z = 0; z < amountOfVehicles; z++) {
            System.out.println(Agency[z]);
        }

    }

    public void testDriveSpyGlider(){
        System.out.print("Please Enter Power Source (Battery, Solar, Fuel): \n");
        String powerSourceSpyGlider = myScanLine();

        System.out.print("Please Enter Distance traveled: \n");
        int distanceTraveledSpyGlider = myScanInt();

        Vehicle sg = new SpyGlider(powerSourceSpyGlider, distanceTraveledSpyGlider);

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
            System.out.print("Please Enter the distance of the test drive: \n");
            int toUpdateDistanceSpyGlider = myScanInt();
            ((SpyGlider) Agency[indexToUpdateDistanceSpyGlider]).move(toUpdateDistanceSpyGlider);
        }
        else
            System.out.print("Error, Vehicle not found. Please try again. \n");

        System.out.println("The New Agency List:");
        for (int z = 0; z < amountOfVehicles; z++) {
            System.out.println(Agency[z]);
        }

    }

    public void testDriveToyGlider(){
        System.out.print("Please Enter Distance traveled: \n");
        int distanceTraveledToyGlider = myScanInt();

        Vehicle tg = new ToyGlider(distanceTraveledToyGlider);

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
            System.out.print("Please Enter the distance of the test drive: \n");
            int toUpdateDistanceToyGlider = myScanInt();
            ((ToyGlider) Agency[indexToUpdateDistanceToyGlider]).move(toUpdateDistanceToyGlider);
        }
        else
            System.out.print("Error, Vehicle not found. Please try again. \n");

        System.out.println("The New Agency List:");
        for (int z = 0; z < amountOfVehicles; z++) {
            System.out.println(Agency[z]);
        }
    }

    public void buyVehicleFromAgency(){

        //Print all the List Available Vehicles in stock.
        System.out.println("List of Available Vehicles in stock:\n");
        for (int i=0 ; i<amountOfVehicles ; i++){
            System.out.println(Agency[i]);
        }
        System.out.println("Which Vehicle do you want?:\n");
        System.out.print("Choose a Vehicle type to add to your Agency:" +
                "\n" +
                "1 : Jeep" + "\n" +
                "2 : Frigate" + "\n" +
                "3 : SpyGlider" + "\n" +
                "4 : ToyGlider" + "\n" +
                " \n");
        int choiceBuy = myScanInt();
        switch (choiceBuy) {
            case 1: //Jeep
                buyJeep();
                break;
            case 2: // Frigate
                buyFrigate();
                break;
            case 3: //SpyGlider
                buySpyGlider();
                break;
            case 4: //ToyGlider
                buyToyGlider();
                break;
        }
    }

    public void testDriveVehicle(){


        // Print all the List Available Vehicles in stock.
        printAllVehicles();


        System.out.println("Which Vehicle do you want?:\n");
        System.out.print("Choose a Vehicle type you want to test drive:" +
                "\n" +
                "1 : Jeep" + "\n" +
                "2 : Frigate" + "\n" +
                "3 : SpyGlider" + "\n" +
                "4 : ToyGlider" + "\n" +
                " \n");

        // person enters vehcile details,
        // if the vehicle exist with equal we update the move by the input for the user for the distance
        // else we print error message
        int choiceBuy = myScanInt();
        switch (choiceBuy) {
            case 1: //Jeep
                testDriveJeep();
                break;
            case 2: // Frigate
                testDriveFrigate();
                break;
            case 3: //SpyGlider
                testDriveSpyGlider();
                break;
            case 4: //ToyGlider
                testDriveToyGlider();
                break;
        }
    }

    public void resetDistanceTraveledAll(){
        for (int i = 0; i < amountOfVehicles; i++) {
            Agency[i].setDistanceTraveled(0);
        }
        System.out.print("Distance traveled for ALL the Vehicles has been Reset");
    }

    public void changeFlagOfAllMarineVehicles(){
        System.out.print("Which Flag you want All Marine Vehicles to have?\n");
        String chosenFlag = myScanLine();

        for (int i = 0; i < amountOfVehicles; i++) {
            if (Agency[i] instanceof MarineVehicle) {
                ((MarineVehicle) Agency[i]).setCountryFlag(chosenFlag);
            }
        }
        System.out.print("Flag for All the Marine Vehicles have been Changed to " + chosenFlag +".");
    }


}