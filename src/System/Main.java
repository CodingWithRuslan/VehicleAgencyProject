package System;
import Vehicle.Vehicle;
import Vehicle.MarineVehicle;
import Vehicle.Jeep;
import Vehicle.Frigate;
import Vehicle.SpyGlider;
import Vehicle.ToyGlider;

import java.util.Scanner;

public class Main {
    static int amountOfVehicles = 0;
    static int capacityOfAgency = 100;

    static Vehicle[] Agency = new Vehicle[capacityOfAgency]; // Agency (Jeeps, Frigates, SpyGliders, ToyGliders)
    public static void main(String[] args) {

        Menus a = new Menus();


        //super(model, 5, maxSpeed, 4, false);  // false = dirt
        //Vehicle a = new Jeep("BMW", 800, 2, 320, 4, false, "MINI", 25, 2);
        //System.out.println(a.toString());


        //public Frigate(String model, int numOfPassengers, int maxSpeed, boolean sailWindDirection)
        //Vehicle b = new Frigate("QWed123",400, 100, true );
        //System.out.println(b.toString());

        // Agency (Jeeps, Frigates, SpyGliders, ToyGliders)
        // Jeeps = [0,1,2,3,4] and etc




        boolean exit = true;
        while (exit) {

            System.out.print("Choose a Vehicle type to add to your Agency:" +
                    "\n" +
                    "1 : Jeep" + "\n" +
                    "2 : Frigate" + "\n" +
                    "3 : SpyGlider" + "\n" +
                    "4 : ToyGlider" + "\n" +
                    "5 : Finish Adding vehicles" + "\n" +
                    " \n");
            int choice = a.myScanInt();

            switch (choice) {
                case 1: //Jeep
                    a.addJeep();
                    break;

                case 2: //Frigate
                    a.addFrigate();
                    break;

                case 3: //SpyGlider
                    a.addSpyGlider();
                    break;

                case 4: //ToyGlider
                    a.addToyGlider();
                    break;

                case 5: //Quit menu
                    exit = false;
                    break;

                default:
                    System.out.println("Wrong choice, available options are from 1-4");
            }
            System.out.println("Your Agency has been built!\n");
        }

        //While true look for the Menu after entering the details of the Vehicle

        // example: person looking for a 'jeep' with under 10 fuelConsumption
        // Pesuedo code
        // for (i=0 i<amountOfVehicles;i++){
        // if jeep
        // if fuelConsumption < 10
        //  Print all options so that the person can choose which to buy
        // and after the person chooses it, we delete it from the list.
        //}

        /*for (int i=0 ; i<Agency.length ; i++){
            if (Agency[i] instanceof Jeep){
                System.out.println("This is a Jeep: "+(Jeep)Agency[i]);
            }
        }*/




        //Menu #2
        System.out.println("Welcome to the Vehicle Agency DealerShip\n");
        boolean exit2 = true;
        while (exit2) {

            System.out.print("Hello user, Choose Option:" +
                    "\n" +
                    "1 : Buy A Vehicle" + "\n" +
                    "2 : Take Vehicle for a test drive" + "\n" +
                    "3 : Reset distance traveled for ALL the Vehicles" + "\n" +
                    "4 : Change flag of the Marine Vehicles of the user" + "\n" +
                    "5 : Quit System" + "\n" +
                    " \n");
            int choice2 = a.myScanInt();

            switch (choice2) {
                case 1: //Buy Vehicle from Agency
                    a.buyVehicleFromAgency();
                    break;

                case 2: // Take Vehicle for a test drive /////////////////////////////////////////////////////////
                    a.testDriveVehicle();
                    break;

                case 3: // Reset distance traveled for ALL the Vehicles
                    a.resetDistanceTraveledAll();
                    break;

                case 4: // Change flag of the Marine Vehicles of the user
                    a.changeFlagOfAllMarineVehicles();
                    break;

                case 5: // Quit System
                    exit2 = false;

                    break;

                default:
                    System.out.println("Wrong choice, available options are from 1-4");
            }
        }



        System.out.println("\nThank you for choosing our Vehicle Agency, Good bye.\n");
    }

}