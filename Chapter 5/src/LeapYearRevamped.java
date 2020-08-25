import java.util.Scanner;

public class LeapYearRevamped {
    public static void main(String[] args) {
        int year;
        final int earlyYr = 1582;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter in the year you want to check if it is a Leap Year (enter -1 to terminate): ");
        year = scan.nextInt();

        while (year != -1) {
            if (year < earlyYr) {
                System.out.println("Year must be greater than or equal to " + earlyYr + ".");
            }
            else{
                if (year % 4 == 0)
                    if (year % 100 == 0)
                        if (year % 400 == 0)
                            System.out.println(year + " is a Leap Year.");
                        else
                            System.out.println(year + " is not a Leap Year.");

                    else
                        System.out.println(year + " is a Leap Year.");
                else
                    System.out.println(year + " is not a Leap Year.");
            }
            System.out.println("Enter in the year you want to check if it is a Leap Year (enter -1 to terminate): ");
            year = scan.nextInt();
        }
    }
}