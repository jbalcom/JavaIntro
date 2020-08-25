import java.util.*;

public class PointDistance {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int xPoint1 = 0;
        int yPoint1 = 0;
        int xPoint2 = 0;
        int yPoint2 = 0;

        System.out.println("Enter in the first X coordinate: ");
        xPoint1 = scan.nextInt();

        System.out.println("Enter in the first Y coordinate: ");
        yPoint1 = scan.nextInt();

        System.out.println("Enter in the second X coordinate: ");
        xPoint2 = scan.nextInt();

        System.out.println("Enter in the second Y coordinate: ");
        yPoint2 = scan.nextInt();

        int distanceX = xPoint2 - xPoint1;
        int distanceY = yPoint2 - yPoint1;
        int distance = (int) (Math.pow(distanceX,2) - (Math.pow(distanceY,2)));
        double distanceTotal = Math.sqrt(distance);

        System.out.println("The distance between the two points is: " + distanceTotal);
    }
}