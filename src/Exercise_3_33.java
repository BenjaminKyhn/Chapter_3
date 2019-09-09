import java.util.Scanner;

public class Exercise_3_33 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.println("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        double pricePerWeight1 = price1 / weight1;
        double pricePerWeight2 = price2 / weight2;

        if (pricePerWeight1 < pricePerWeight2)
            System.out.println("Package 1 has a better price.");

        if (pricePerWeight1 > pricePerWeight2)
            System.out.println("Package 2 has a better price.");
    }
}
