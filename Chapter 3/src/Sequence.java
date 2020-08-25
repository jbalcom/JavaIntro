import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int firstTerm, commonRatio, nValue;

        System.out.println("Enter in the first term: ");
        firstTerm = scan.nextInt();

        System.out.println("Enter in the common ratio: ");
        commonRatio = scan.nextInt();

        System.out.println("Enter in the value n: ");
        nValue = scan.nextInt();

        System.out.println("The calculated nth term is: " + (firstTerm * (Math.pow(commonRatio,(nValue - 1)))));
    }
}
