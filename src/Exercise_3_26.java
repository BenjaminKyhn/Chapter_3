import java.util.Scanner;

public class Exercise_3_26 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int integer = input.nextInt();

        if (integer % 4 == 0 && integer % 5 == 0)
            System.out.println("Is " + integer + " divisible by 4 and 5? true");
        else
            System.out.println("Is " + integer + " divisible by 4 and 5? false");
        if (integer % 4 == 0 || integer % 5 == 0)
            System.out.println("Is " + integer + " divisible by 4 or 5? true");
        else
            System.out.println("Is " + integer + " divisible by 4 or 5? false");
        if (integer % 4 == 0 ^ integer % 5 == 0)
            System.out.println("Is " + integer + " divisible by 4 or 5 but not both? true");
        else
            System.out.println("Is " + integer + " divisible by 4 or 5 but not both? false");
    }
}
