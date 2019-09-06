import java.util.Scanner;

public class Exercise_3_27 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter coordinates to a point
        System.out.println("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double a = 100;
        double b = 200;
        double c = Math.pow(Math.pow(a,2) + Math.pow(b,2), 0.5);

        //Compute distance from point to (0,0)
        double distance = Math.pow(Math.pow(x-0,2)+Math.pow(y-0,2),0.5);

        System.out.println("The distance to (0,0) is " + distance);
        System.out.println("Half of c is " + c * 0.5);

        //Test if the point is inside the triangle
        if (distance <= c * 0.5 && x <= 200 && y <= 100)
            System.out.println("The point is inside the triangle");
        else
            System.out.println("The point is not inside the triangle");

    }
}
