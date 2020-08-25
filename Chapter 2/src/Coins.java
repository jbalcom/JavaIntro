import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quarters, dimes, nickels, pennies;
        double dollars;
        double cents;

        System.out.println("Enter number of quarters: ");
        quarters = scan.nextInt();

        System.out.println("Enter number of dimes: ");
        dimes = scan.nextInt();

        System.out.println("Enter number of nickels: ");
        nickels = scan.nextInt();

        System.out.println("Enter number of pennies: ");
        pennies = scan.nextInt();

        cents = (25*quarters) + (10*dimes) + (5*nickels) + (pennies);
        dollars = cents/100;

        System.out.println("The amount of change in the jar in dollars and cents is: " + dollars);
    }
}

