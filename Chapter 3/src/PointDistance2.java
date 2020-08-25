import java.util.*;

public class PointDistance2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int xPoint1 = 0;
        int yPoint1 = 0;
        int xPoint2 = 0;
        int yPoint2 = 0;
        double distanceTotal;

        System.out.println("Enter in the first X coordinate: ");
        xPoint1 = scan.nextInt();

        System.out.println("Enter in the first Y coordinate: ");
        yPoint1 = scan.nextInt();

        System.out.println("Enter in the second X coordinate: ");
        xPoint2 = scan.nextInt();

        System.out.println("Enter in the second Y coordinate: ");
        yPoint2 = scan.nextInt();

        System.out.println("The distance between the two points is: " + (Math.sqrt((int) (Math.pow(xPoint2 - xPoint1, 2)) - (Math.pow(yPoint2 - yPoint1, 2)))));
    }
}
