import java.util.Scanner;

public class Exercise_3_17 {
    public static void main (String [] args){
        System.out.print("scissor (0), rock (1), paper (2): ");
        Scanner input = new Scanner(System.in);
        int you = input.nextInt();
        int computer = (int)(Math.random()*3);

        if (you == 0 && computer == 0)
            System.out.print("The computer is scissor. You are scissor too. It is a draw.");
        if (you == 0 && computer == 1)
            System.out.print("The computer is rock. You are scissor. You lost.");
        if (you == 0 && computer == 2)
            System.out.print("The computer is paper. You are scissor. You won.");
        if (you == 1 && computer == 0)
            System.out.print("The computer is scissor. You are rock. You won.");
        if (you == 1 && computer == 1)
            System.out.print("The computer is rock. You are rock oo. It is a draw.");
        if (you == 1 && computer == 2)
            System.out.print("The computer is paper. You are rock. You lost.");
        if (you == 2 && computer == 0)
            System.out.print("The computer is scissor. You are paper. You lost.");
        if (you == 2 && computer == 1)
            System.out.print("The computer is rock. You are paper. You won.");
        if (you == 2 && computer == 2)
            System.out.print("The computer is paper. You are paper too. It is a draw.");
    }
}
