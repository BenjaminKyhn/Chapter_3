import java.util.Scanner;

public class Exercise_3_10 {
    public static void main (String[] ags){
        int number1 = (int)(Math.random() * 999 + 1);
        int number2 = (int)(Math.random() * 999 + 1);

        System.out.print
                ("What is " + number1 + " * " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (number1 * number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " * " + number2 + " should be " + (number1 * number2));
        }
    }
}
