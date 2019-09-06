import java.util.Scanner;

public class Exercise_3_12 {
    public static void main (String[] ags) {
        System.out.print("Enter a three digit integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int num1 = number / 100;
        int num3 = (number / 100) % 10;

        if (num1 == num3)
            System.out.println(number + " is a palindrome");
        else
            System.out.println(number + " is not a palindrome");

    }
}
