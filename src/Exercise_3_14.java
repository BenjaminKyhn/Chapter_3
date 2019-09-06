import java.util.Scanner;

public class Exercise_3_14 {
    public static void main (String[] ags) {
        System.out.print("Enter a guess for a coin flip (0 - heads, 1 - tails): ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int heads = 0;
        int tails = 1;
        int outcome = (int)(Math.random() * 2);

        if (number == outcome && outcome == heads)
            System.out.println("Correct the outcome is heads");
        else if (number == outcome && outcome == tails)
            System.out.println("Correct the outcome is tails");
        else if (number != outcome && outcome == heads)
            System.out.println("Incorrect the outcome is heads");
        else if (number != outcome && outcome == tails)
            System.out.println("Incorrect the outcome is tails");
    }
}
