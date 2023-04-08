package System;
import java.util.*;
import Vehicle.Vehicle;
import Vehicle.Jeep;
import Vehicle.Frigate;
import Vehicle.SpyGlider;
import Vehicle.ToyGlider;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //super(model, 5, maxSpeed, 4, false);  // false = dirt
        //Vehicle a = new Jeep("BMW", 800, 2, 320, 4, false, "MINI", 25, 2);
        //System.out.println(a.toString());


        //public Frigate(String model, int numOfPassengers, int maxSpeed, boolean sailWindDirection)
        //Vehicle b = new Frigate("QWed123",400, 100, true );
        //System.out.println(b.toString());


        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Please Enter The Vehicle you want to choose:" +
                "\n" +
                "1 : Jeep" + "\n" +
                "2 : Frigate" + "\n" +
                "3 : SpyGlider" + "\n" +
                "4 : ToyGlider" + "\n" +
                " \n");
        int choice = sc.nextInt(); // a = 2

        switch(choice) {
            case 1: //Jeep
                Scanner sc1= new Scanner(System.in);
                //Jeep(String model, double avgFuelConsumption, int maxSpeed, double avgEngineLifeSpan)
                System.out.print("Please Enter Model: \n");
                String modelJeep = sc1.nextLine();

                System.out.print("Please Enter Average Fuel Consumption: \n");
                double avgFuelConsumptionJeep = sc1.nextDouble();

                System.out.print("Please Enter Max speed: \n");
                int maxSpeedJeep = sc1.nextInt();

                System.out.print("Please Average Engine Life Span: \n");
                double avgEngineLifeSpanJeep = sc1.nextDouble();

                Vehicle j = new Jeep(modelJeep, avgFuelConsumptionJeep, maxSpeedJeep, avgEngineLifeSpanJeep);
                System.out.println(j.toString());

                //{ menu of jeep}

                break;

            case 2: //Frigate
                Scanner sc2= new Scanner(System.in);

                System.out.print("Please Enter Model: \n");
                String modelFrigate = sc2.nextLine();

                System.out.print("Please Enter Number of passengers: \n");
                int numOfPassengersFrigate = sc2.nextInt();

                System.out.print("Please Enter Max speed: \n");
                int maxSpeedFrigate = sc2.nextInt();

                Scanner sc2a= new Scanner(System.in);
                System.out.print("Sailing in wind direction? (yes or no): \n");
                String withWindDirectionFrigate = sc2a.nextLine(); // yes/no
                boolean sailWindDirectionFrigate=false;
                if (withWindDirectionFrigate.equals("yes")) {sailWindDirectionFrigate = true;} // else it stays false (no)

                System.out.print("Please Enter Distance traveled: \n");
                int distanceTraveledFrigate = sc2a.nextInt();

                Vehicle f = new Frigate(modelFrigate,numOfPassengersFrigate, maxSpeedFrigate, sailWindDirectionFrigate, distanceTraveledFrigate);
                System.out.println(f.toString());
                break;

            case 3: //SpyGlider
                Scanner sc3= new Scanner(System.in);

                System.out.print("Please Enter Power Source (Battery, Solar, Fuel): \n");
                String powerSourceSpyGlider = sc3.nextLine();

                System.out.print("Please Enter Distance traveled: \n");
                int distanceTraveledSpyGlider = sc3.nextInt();

                Vehicle sg = new SpyGlider(powerSourceSpyGlider, distanceTraveledSpyGlider);
                System.out.println(sg.toString());
                break;

            case 4: //ToyGlider
                Scanner sc4= new Scanner(System.in);

                System.out.print("Please Enter Distance traveled: \n");
                int distanceTraveledToyGlider = sc4.nextInt();

                Vehicle tg = new ToyGlider(distanceTraveledToyGlider);
                System.out.println(tg.toString());
                break;

            default:
                // code block
        }

        //While true look for the Menu after entering the details of the Vehicle





    }
}