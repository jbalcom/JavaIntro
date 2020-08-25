import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tempCelsius;

        System.out.println("Enter a temperature in fahrenheits:");
        tempCelsius = scan.nextInt();

        tempCelsius = ((tempCelsius - 32) * 5) / 9;

        System.out.println("The converted temperature from fahrenheit to celsius is: " + tempCelsius + " degrees");
    }
}
