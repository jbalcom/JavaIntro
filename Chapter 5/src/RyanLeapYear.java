import java.util.InputMismatchException;
import java.util.Scanner;

public class RyanLeapYear {
    public static void main(String[] args) {
        int year = 0;
        boolean status = true;
        final int EARLYYR = 1582;
        Scanner scan = new Scanner(System.in);

        while (year != -1) {
            status = true;
            System.out.println("Enter in the year you want to check if it is a Leap Year (enter -1 to terminate): ");
            while (status){
                try {
                    status = false;
                    year = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Stop being dumb, enter a number.");
                    status = true;
                    scan.next();
                }
            }
            if (year >= EARLYYR){
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
            else if (year < EARLYYR){
                System.out.println("Year must be greater than or equal to " + EARLYYR + ".");
            }
        }
    }
}