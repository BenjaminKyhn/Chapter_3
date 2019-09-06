import java.util.Scanner;

public class Exercise_3_11 {
    public static void main (String[] ags) {
        System.out.print("Enter the number for the month: ");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear == true)
        switch (month){
            case 1: System.out.println("January of " + year + " has 31 days"); break;
            case 2: System.out.println("February of " + year + " has 29 days"); break;
            case 3: System.out.println("March of " + year + " has 31 days"); break;
            case 4: System.out.println("April of " + year + " has 30 days"); break;
            case 5: System.out.println("May of " + year + " has 31 days"); break;
            case 6: System.out.println("June of " + year + " has 30 days"); break;
            case 7: System.out.println("July of " + year + " has 31 days"); break;
            case 8: System.out.println("August of " + year + " has 31 days"); break;
            case 9: System.out.println("September of " + year + " has 30 days"); break;
            case 10: System.out.println("October of " + year + " has 31 days"); break;
            case 11: System.out.println("November of " + year + " has 30 days"); break;
            case 12: System.out.println("December of " + year + " has 31 days"); break;
        }
        else if (isLeapYear == false)
            switch (month){
                case 1: System.out.println("January of " + year + " has 31 days"); break;
                case 2: System.out.println("February of " + year + " has 28 days"); break;
                case 3: System.out.println("March of " + year + " has 31 days"); break;
                case 4: System.out.println("April of " + year + " has 30 days"); break;
                case 5: System.out.println("May of " + year + " has 31 days"); break;
                case 6: System.out.println("June of " + year + " has 30 days"); break;
                case 7: System.out.println("July of " + year + " has 31 days"); break;
                case 8: System.out.println("August of " + year + " has 31 days"); break;
                case 9: System.out.println("September of " + year + " has 30 days"); break;
                case 10: System.out.println("October of " + year + " has 31 days"); break;
                case 11: System.out.println("November of " + year + " has 30 days"); break;
                case 12: System.out.println("December of " + year + " has 31 days"); break;
        }
    }
}
