import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        int year;
        final int earlyYr = 1582;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter in the year you want to check if it is a Leap Year or not: ");
        year = scan.nextInt();

        System.out.println("You entered: " + year);

        if (year < earlyYr)
            System.out.println("Year is earlier than when the Gregorian calendar was adopted.");
        else
            if (year % 4 == 0 )
                if (year % 100 == 0)
                    if (year % 400 == 0)
                        System.out.println("Year is a Leap Year.");
                    else
                        System.out.println("Year is not a Leap Year.");
                else
                    System.out.println("Year is a Leap Year.");
            else
                System.out.println("Year is not a Leap Year.");
    }
}
