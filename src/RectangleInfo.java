import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        boolean widthdone = false;
        boolean heightdone = false;
        String trash = "";
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;


        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                System.out.println("The width is: " + width);
                widthdone = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " this is not a valid input.");
            }

            }while (!widthdone);

        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                System.out.println("The width is: " + height);
                heightdone = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " this is not a valid input.");
            }

        }while (!heightdone);


        area = height * width;
        perimeter = (height + width) * 2;

        System.out.println("The area of the rectangle is "+ area +" , and the perimeter is " + perimeter);


        diagonal = Math.sqrt((height * height) + (width * width));


        System.out.println("The diagonal of the rectangle is: " + diagonal);

    }
}
