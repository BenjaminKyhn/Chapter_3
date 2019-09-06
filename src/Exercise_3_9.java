import java.util.Scanner;

public class Exercise_3_9 {
    public static void main (String[] args) {

       System.out.println("Enter the first 9 digits of an ISBN as integer: ");
       Scanner input = new Scanner(System.in);
       int d1 = input.nextInt();
       int d2 = input.nextInt();
       int d3 = input.nextInt();
       int d4 = input.nextInt();
       int d5 = input.nextInt();
       int d6 = input.nextInt();
       int d7 = input.nextInt();
       int d8 = input.nextInt();
       int d9 = input.nextInt();
       int d10 = ((d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)%11);

       System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
        if (d10 == 10)
            System.out.println("X");
        else
            System.out.println(d10);
    }
}