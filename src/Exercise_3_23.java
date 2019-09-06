import java.util.Scanner;

public class Exercise_3_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two coordinates
        System.out.println("Enter a point with two coordinates:");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Check if the point is within the rectangle and display the result
        if (x >= -10/2 && x <= 10/2 && y >= -5.0/2 && y <= 5.0/2 )
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        else
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
    }
}