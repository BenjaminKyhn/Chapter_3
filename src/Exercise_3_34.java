import java.util.Scanner;

public class Exercise_3_34 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter three points
        System.out.println("Enter three points for p0, p1 and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        System.out.println(position);

        // Does not work with all values fx 1 1 2 2 4 4
        if (position == 0) {
            if ((x2 <= x1 && x2 >= x0 && y2 <= y1 && y2 >= y0) || (x2 <= x0 && x2 >= x1 && y2 <= y0 && y2 >= y1))
                System.out.println("(" + x2 + ", " + y2 + ")" + " is on the line segment from" + "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
        else
            System.out.println("(" + x2 + ", " + y2 + ")" + " is not on the line segment from" + "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
    }
}
