import java.util.Scanner;

public class Exercise_3_16 {
    public static void main (String [] args){
        int x = 50 - (int) (Math.random() * 101);
        int y = 150 - (int) (Math.random() * 301);

        System.out.print("The coordinate is (" + x + "," + y + ")");
    }
}
