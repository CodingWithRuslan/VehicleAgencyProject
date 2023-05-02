package System;
import Vehicle.Vehicle;
import Vehicle.MarineVehicle;
import Vehicle.Jeep;
import Vehicle.Frigate;
import Vehicle.SpyGlider;
import Vehicle.ToyGlider;
import Vehicle.AmphibiousVehicle;
import Vehicle.Bicycle;
import Vehicle.CruiseShip;

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

    public Vehicle scanJeep(){
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

        //Vehicle[] Agency = new Vehicle[3]; return a;
        Vehicle a = new Jeep(modelJeep, avgFuelConsumptionJeep, maxSpeedJeep, avgEngineLifeSpanJeep);
        return a;
    }
    public Vehicle scanFrigate(){
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

        Vehicle a = new Frigate(modelFrigate, numOfPassengersFrigate, maxSpeedFrigate, sailWindDirectionFrigate, distanceTraveledFrigate);
        return a;
    }
    public Vehicle scanSpyGlider(){
        System.out.print("Please Enter Power Source (Battery, Solar, Fuel, Manual): \n");
        String powerSourceSpyGlider = myScanLine();

        System.out.print("Please Enter Distance traveled: \n");
        int distanceTraveledSpyGlider = myScanInt();

        //Vehicle sg = new SpyGlider(powerSourceSpyGlider, distanceTraveledSpyGlider);
        //System.out.println(sg.toString());

        Vehicle a = new SpyGlider(powerSourceSpyGlider, distanceTraveledSpyGlider);
        return a;
    }
    public Vehicle scanToyGlider(){
        System.out.print("Please Enter Distance traveled: \n");
        int distanceTraveledToyGlider = myScanInt();

        //Vehicle tg = new ToyGlider(distanceTraveledToyGlider);
        //System.out.println(tg.toString());

        Vehicle a = new ToyGlider(distanceTraveledToyGlider);
        return a;
    }
    public Vehicle scanAmphibiousVehicle(){
        //AmphibiousVehicle(String model, int distanceTraveled , int numOfPassengers , int maxSpeed, double avgFuelConsumption, double avgEngineLifeSpan, int numOfWheels, boolean sailWindDirection, String countryFlag)
        System.out.print("Please Enter Model: \n");
        String model = myScanLine();

        System.out.print("Please Enter Distance traveled: \n");
        int distanceTraveled = myScanInt();

        System.out.print("Please Enter Number of passengers: \n");
        int numOfPassengers = myScanInt();

        System.out.print("Please Enter Max speed: \n");
        int maxSpeed = myScanInt();

        System.out.print("Please Enter Average Fuel Consumption: \n");
        double avgFuelConsumption = myScanDouble();

        System.out.print("Please Average Engine Life Span: \n");
        double avgEngineLifeSpan = myScanDouble();

        System.out.print("Please Enter Num of wheels: \n");
        int numOfWheels= myScanInt();

        System.out.print("Sailing in wind direction? (yes or no): \n");
        String withWindDirection = myScanLine(); // yes/no
        boolean sailWindDirection = false;
        if (withWindDirection.equals("yes")) {
            sailWindDirection = true;
        } // else it stays false (no)

        System.out.print("Please Enter Country Flag: \n");
        String flag = myScanLine();

        Vehicle a = new AmphibiousVehicle(model, distanceTraveled, numOfWheels, maxSpeed, avgFuelConsumption,avgEngineLifeSpan,numOfWheels,sailWindDirection,flag);
        return a;
    }
    public Vehicle scanBicycle(){
        //Bicycle(String model, int distanceTraveled, int numOfPassengers, int maxSpeed, boolean roadType)
        System.out.print("Please Enter Model: \n");
        String model = myScanLine();

        System.out.print("Please Enter Distance traveled: \n");
        int distanceTraveled = myScanInt();

        System.out.print("Please Enter Number of passengers: \n");
        int numOfPassengers = myScanInt();

        System.out.print("Please Enter Max speed: \n");
        int maxSpeed = myScanInt();

        System.out.print("Please Enter Road Type (dirt/pavement): \n");
        String roadType = myScanLine();

        boolean flagBool=false;
        if (roadType.equals("pavement")) { // with
            flagBool=true;
        }
        else
            flagBool=false;

        Vehicle a = new Bicycle(model,distanceTraveled,numOfPassengers,maxSpeed,flagBool);
        return a;
    }
    public Vehicle scanCruiseShip(){
        //CruiseShip(String model, int distanceTraveled, int numOfPassengers, int maxSpeed, String countryFlag, double avgFuelConsumption, double avgEngineLifeSpan)
        System.out.print("Please Enter Model: \n");
        String model = myScanLine();

        System.out.print("Please Enter Distance traveled: \n");
        int distanceTraveled = myScanInt();

        System.out.print("Please Enter Number of passengers: \n");
        int numOfPassengers = myScanInt();

        System.out.print("Please Enter Max speed: \n");
        int maxSpeed = myScanInt();

        System.out.print("Please Enter Country Flag: \n");
        String countryFlag = myScanLine();

        System.out.print("Please Enter Average Fuel Consumption: \n");
        double avgFuelConsumption = myScanDouble();

        System.out.print("Please Average Engine Life Span: \n");
        double avgEngineLifeSpan = myScanDouble();

        Vehicle a = new CruiseShip(model,distanceTraveled,numOfPassengers,maxSpeed,countryFlag,avgFuelConsumption,avgEngineLifeSpan);
        return a;
    }

    public  void addJeep() {
        Agency[amountOfVehicles] = scanJeep();
        amountOfVehicles++;
    }
    public void addFrigate(){
        Agency[amountOfVehicles] = scanFrigate();
        amountOfVehicles++;
    }
    public void addSpyGlider(){
        Agency[amountOfVehicles] = scanSpyGlider();
        amountOfVehicles++;
    }
    public void addToyGlider() {
        Agency[amountOfVehicles] = scanToyGlider();
        amountOfVehicles++;
    }
    public void addAmphibiousVehicle(){
        Agency[amountOfVehicles] = scanAmphibiousVehicle();
        amountOfVehicles++;
    }
    public void addBicycle(){
        Agency[amountOfVehicles] = scanCruiseShip();
        amountOfVehicles++;
    }
    public void addCruiseShip(){
        Agency[amountOfVehicles] = scanCruiseShip();
        amountOfVehicles++;
    }

    public void buyVehicleFromAgency(){

        //Print all the List Available Vehicles in stock.
        System.out.println("List of Available Vehicles in stock:\n");
        for (int i=0 ; i<amountOfVehicles ; i++){
            System.out.println(Agency[i]);
        }
        System.out.println("\nWhich Vehicle do you want to buy?:");
        System.out.print(
                "1 : Jeep" + "\n" +
                        "2 : Frigate" + "\n" +
                        "3 : SpyGlider" + "\n" +
                        "4 : ToyGlider" + "\n" +
                        "5 : Amphibious" + "\n" +
                        "6 : Bicycle" + "\n" +
                        "7 : CruiseShip" + "\n" +
                        "8 : QuitBuy" + "\n" +
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
            case 5: //Amphibious
                buyAmphibious();
                break;
            case 6: //Bicycle
                buyBicycle();
                break;
            case 7: //CruiseShip
                buyCruiseShip();
                break;
            case 8: //QuitBuy

                break;
        }
    }
    public void buyJeep(){

        Vehicle j = scanJeep();

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

        Vehicle f = scanFrigate();

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

        Vehicle sg = scanSpyGlider();

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

        Vehicle tg = scanToyGlider();

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
    public void buyAmphibious(){

        Vehicle a = scanAmphibiousVehicle();

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
            amountOfVehicles--;
        }
        else
            System.out.print("Error, Vehicle not found. Please try again. \n");

        System.out.println("The New Agency List:");
        for (int z=0 ; z<amountOfVehicles ; z++){
            System.out.println(Agency[z]);
        }
    }
    public void buyBicycle(){

        Vehicle a = scanBicycle();

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
            amountOfVehicles--;
        }
        else
            System.out.print("Error, Vehicle not found. Please try again. \n");

        System.out.println("The New Agency List:");
        for (int z=0 ; z<amountOfVehicles ; z++){
            System.out.println(Agency[z]);
        }
    }
    public void buyCruiseShip(){

        Vehicle a = scanCruiseShip();

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
            amountOfVehicles--;
        }
        else
            System.out.print("Error, Vehicle not found. Please try again. \n");

        System.out.println("The New Agency List:");
        for (int z=0 ; z<amountOfVehicles ; z++){
            System.out.println(Agency[z]);
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
                "5 : Amphibious" + "\n" +
                "6 : Bicycle" + "\n" +
                "7 : CruiseShip" + "\n" +
                "8 : QuitBuy" +
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
            case 5: //Amphibious
                testDriveAmphibious();
                break;
            case 6: //Bicycle
                testDriveBicycle();
                break;
            case 7: //CruiseShip
                testDriveCruiseShip();
                break;
            case 8: //QuitBuy

                break;
        }
    }
    public void testDriveJeep(){

        Vehicle j = scanJeep();

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

        Vehicle f = scanFrigate();

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
        Vehicle sg = scanSpyGlider();

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

        Vehicle tg = scanToyGlider();

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
    public void testDriveAmphibious(){

        Vehicle j = scanAmphibiousVehicle();

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
            System.out.print("Please Enter the distance of the test drive: \n");
            int toUpdateDistanceJeep = myScanInt();
            ((AmphibiousVehicle) Agency[indexToUpdateDistance]).move(toUpdateDistanceJeep);
        }
        else
            System.out.print("Error, Vehicle not found. Please try again. \n");

        System.out.println("The New Agency List:");
        for (int z = 0; z < amountOfVehicles; z++) {
            System.out.println(Agency[z]);
        }

    }
    public void testDriveBicycle(){

        Vehicle j = scanBicycle();

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
            System.out.print("Please Enter the distance of the test drive: \n");
            int toUpdateDistanceJeep = myScanInt();
            ((Bicycle) Agency[indexToUpdateDistance]).move(toUpdateDistanceJeep);
        }
        else
            System.out.print("Error, Vehicle not found. Please try again. \n");

        System.out.println("The New Agency List:");
        for (int z = 0; z < amountOfVehicles; z++) {
            System.out.println(Agency[z]);
        }

    }
    public void testDriveCruiseShip(){

        Vehicle j = scanCruiseShip();

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
            System.out.print("Please Enter the distance of the test drive: \n");
            int toUpdateDistanceJeep = myScanInt();
            ((CruiseShip) Agency[indexToUpdateDistance]).move(toUpdateDistanceJeep);
        }
        else
            System.out.print("Error, Vehicle not found. Please try again. \n");

        System.out.println("The New Agency List:");
        for (int z = 0; z < amountOfVehicles; z++) {
            System.out.println(Agency[z]);
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