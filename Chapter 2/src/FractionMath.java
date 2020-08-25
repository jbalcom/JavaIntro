import java.util.Scanner;

public class FractionMath {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float topNumber, bottomNumber;

        System.out.println("Enter the fraction's numerator:");
        topNumber = scan.nextInt();
        System.out.println("Enter the fraction's denominator:");
        bottomNumber = scan.nextInt();

        float total = topNumber/bottomNumber;

        System.out.println("The total fraction in decimal form is " + total);
            }
}
