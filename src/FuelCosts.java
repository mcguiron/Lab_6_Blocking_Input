import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double ppg = 0;
        boolean gallonsdone = true;
        boolean mpgdone = true;
        boolean ppgdone = true;
        String trash = "";

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
            System.out.print("What is the mils per gallon of your car: ");
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



    }
}
