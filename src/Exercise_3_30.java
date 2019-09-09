import java.util.Scanner;

public class Exercise_3_30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();


        long totalSeconds = totalMilliseconds / 1000;


        long currentSecond = totalSeconds % 60;


        long totalMinutes = totalSeconds / 60;


        long currentMinute = totalMinutes % 60;


        long totalHours = totalMinutes / 60;


        long currentHour = totalHours % 24;

        if (currentHour + offset <= 12)
        System.out.println("The current time is " + (currentHour + offset) + ":" + currentMinute + ":" + currentSecond + " AM");

        else
            System.out.println("The current time is " + (currentHour + offset - 12) + ":" + currentMinute + ":" + currentSecond + " PM");
    }
}
