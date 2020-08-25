import java.util.Scanner;

public class ExhaustPipes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalMeters;
        int centiConvert;
        System.out.println("Enter the total number of pipes in meters needed:");
        totalMeters = scan.nextDouble();

        centiConvert = (int) (totalMeters * 100);
/*

 */
        int tenMeter = centiConvert / 1000;
        centiConvert = centiConvert % 1000;
        int fiveMeter = centiConvert / 500;
        centiConvert = centiConvert % 500;
        int oneMeter = centiConvert / 100;
        centiConvert = centiConvert % 100;
        int tfCenti = centiConvert / 25;
        centiConvert = centiConvert % 25;
        int tenCenti = centiConvert / 10;
        centiConvert = centiConvert % 10;
        int fiveCenti = centiConvert / 5;
        centiConvert = centiConvert % 5;


        int totalLength = tenMeter + fiveMeter + oneMeter + tfCenti + tenCenti + fiveCenti + centiConvert;
        System.out.println("The astronauts will need the following pipes:");
        System.out.println(tenMeter + " Ten meter lengths");
        System.out.println(fiveMeter + " Five meter lengths");
        System.out.println(oneMeter + " One meter lengths");
        System.out.println(tfCenti + " Twenty-five centimeter lengths");
        System.out.println(tenCenti + " Ten centimeter lengths");
        System.out.println(fiveCenti + " Five centimeter lengths");
        System.out.println(centiConvert + " One centimeter lengths");
        System.out.println("The total length of pipes needed is: " + totalLength + " lengths");
    }
}
