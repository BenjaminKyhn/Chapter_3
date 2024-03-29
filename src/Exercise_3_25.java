import java.util.Scanner;

public class Exercise_3_25 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = -1 * (x1 - x2);
        double c = y3 - y4;
        double d = -1 * (x3 - x4);
        double e = a * x1 - (x1 - x2) * y1;
        double f = c * x3 - (x3 - x4) * y3;

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        if (a * d - b * c == 0)
            System.out.println("The two lines are parallel");

        else
            System.out.println("The intersecting point is " + x + ", " + y + ")");
    }
}

