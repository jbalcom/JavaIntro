import java.util.Scanner;

public class KiloConvert {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the number of miles to be converted to kilometers:");
            float miles = scan.nextInt();

            float kiloConvert = (float) (miles * 1.60935);

            System.out.println(miles + " miles converted to kilometers is: " + kiloConvert);
        }
}
