import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double ppg = 0;
        boolean gallonsdone = false;
        boolean mpgdone = false;
        boolean ppgdone = false;
        String trash = "";
        double fuelCost = 0;
        double fullTank = 0;

        do {
            System.out.print("How many gallons does your tank hold: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                System.out.println("The number of gallons your tank holds is " + gallons);
                gallonsdone = true;
            }
                else {
                        trash = in.nextLine();
                        System.out.println("You entered " + trash + " this is not a valid input.");
                     }
        }while (!gallonsdone);

        do {
            System.out.print("What is the miles per gallon of your car: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                System.out.println("The miles per gallon of your car is " + mpg);
                   mpgdone = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " this is not a valid input.");
            }
        }while (!mpgdone);

        do {
            System.out.print("What is the price per gallon: ");
            if (in.hasNextDouble()) {
                ppg = in.nextDouble();
                in.nextLine();
                System.out.println("The miles per gallon of your car is " + ppg);
                ppgdone = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " this is not a valid input.");
            }
        }while (!ppgdone);

        fuelCost = (100 / mpg) * ppg;
        System.out.println("The cost to drive your car 100 miles is: $" + fuelCost);

        fullTank = gallons * mpg;
        System.out.println("And your car can go " + fullTank + " miles on one full tank");





    }
}
