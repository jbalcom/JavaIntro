import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kilo, meter, centi;

        System.out.println("Enter the number of kilometers:");
        kilo = scan.nextInt();

        System.out.println("Enter the number of meters:");
        meter = scan.nextInt();

        System.out.println("Enter the number of centimeters:");
        centi = scan.nextInt();

        int kiloConvert = kilo * 100000;
        int meterConvert = meter * 100;
        int centiTotal = kiloConvert + meterConvert + centi;

        System.out.println("The cenitmeter total is " + centiTotal);
    }
}
