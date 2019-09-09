import java.util.Scanner;

public class Exercise_3_31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int conversion = input.nextInt();

        if (conversion == 0) {
            System.out.println("Enter the dollar amount: ");
            double amountDollar = input.nextDouble();
            double amountRMB = amountDollar * exchangeRate;
            System.out.println("$" + amountDollar + " is " + amountRMB + " yuan");
        }
        if (conversion == 1) {
            System.out.println("Enter the RMB amount: ");
            double amountRMB = input.nextDouble();
            double amountDollar = amountRMB / exchangeRate;
            System.out.println(amountRMB + " yuan is $" + amountDollar);
        }
    }
}
