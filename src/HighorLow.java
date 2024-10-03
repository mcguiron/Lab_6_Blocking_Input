import java.util.Scanner;
import java.util.Random;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Random generator = new Random();
        int val = generator.nextInt(10) + 1;  // val is 1 to 10
        int guess = 0;
        boolean input = false;
        String trash = "";

        do {
            System.out.print("Guess a number [1-10]: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine(); // Clear the buffer

                if (guess >= 1 && guess <= 10) {
                    System.out.println("You guessed " + guess);
                    System.out.println("The number was " + val);

                    if (guess < val) {
                        System.out.println("Your guess was too low!");
                    } else if (guess > val) {
                        System.out.println("Your guess was too high!");
                    } else {
                        System.out.println("You got it!!!!");
                        input = true; // Exit the loop if the guess is correct
                    }
                } else {
                    System.out.println("Your guess is out of range. Please guess a number between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ", this is not a valid input.");
            }
        } while (!input);

        in.close();
    }
}
