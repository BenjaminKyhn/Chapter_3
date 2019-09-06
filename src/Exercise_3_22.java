import java.util.Scanner;

public class Exercise_3_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two coordinates
        System.out.println("Enter a point with two coordinates:");
        double x2 = input.nextDouble();
        double x1 = 0;
        double y2 = input.nextDouble();
        double y1 = 0;

        // Compute the distance to (0,0)
        double distance = Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);

        // Display the result
        System.out.println("Distance is " + distance);

        if (distance >= -10 && distance <= 10)
        System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle");

        else
        System.out.println("Point (" + x2 + ", " + y2 + ") is not in the circle");
    }
}