import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double ppg = 0;
        boolean done = true;
        String trash = "";
        do {
            System.out.print("How many gallons does your tank hold: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                System.out.println("The number of gallons your tank holds is " + gallons);
                done = true;
            }
                else {
                        trash = in.nextLine();
                        System.out.println("You entered " + trash + " this is not a valid input.");
                     }
        }while (!done);
    }
}
