import java.util.Scanner;

public class Exercise_3_35 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a number
        System.out.println("Enter an integer: ");
        int integer = input.nextInt();

        if (integer % 2 == 0)
            System.out.println(integer + " is an even number.");
        else
            System.out.println(integer + " is an odd number.");
    }
}
