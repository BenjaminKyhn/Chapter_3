import java.util.Scanner;

public class Exercise_3_32 {
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

        if (position > 0)
            System.out.println("p2 is on the left side of the line");
        if (position == 0)
            System.out.println("p2 is on the the line");
        if (position < 0)
            System.out.println("p2 is on the right side of the line");
    }
}
