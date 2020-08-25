import java.util.Scanner;

public class CentimeterBreakout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int centiTotal;
        System.out.println("Enter a number in cenitmeters ");
        centiTotal = scan.nextInt();

        int kilo = centiTotal / 100000;
        int meterLeft = centiTotal % 100000;
        int meter = meterLeft / 100;
        meterLeft = meterLeft % 100;

        System.out.println("The breakout of kilometers, meters, and cenitmeters is: ");
        System.out.println("Kilometers = " + kilo + " km");
        System.out.println("Meters = " + meter + " m");
        System.out.println("Centimeters = " + meterLeft + " cm");
    }
}
