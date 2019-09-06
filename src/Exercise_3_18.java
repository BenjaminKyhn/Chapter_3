import java.util.Scanner;

public class Exercise_3_18 {
    public static void main (String [] args){
        System.out.print("Enter weight of the package in pounds: ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextInt();

        if (0 < weight && weight <= 2)
            System.out.print("The shipping cost is $2.5");
        else if (2 < weight && weight <= 4)
            System.out.print("The shipping cost is $4.5");
        else if (4 < weight && weight <= 10)
            System.out.print("The shipping cost is $7.5");
        else if (10 < weight && weight <= 20)
            System.out.print("The shipping cost is $10.5");
        else if (0 > weight || weight > 20)
            System.out.print("The package cannot be shipped");
    }
}
