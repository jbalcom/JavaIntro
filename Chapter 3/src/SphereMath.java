import java.util.*;

public class SphereMath {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sphereRadius;

        double volume, surfaceArea;

        System.out.println("Enter in the sphere's radius: ");
        sphereRadius = scan.nextInt();

        System.out.println("The sphere's volume is: " + ((4.0 / 3) * Math.PI * Math.pow(sphereRadius, 3)));
        System.out.println("The sphere's surface area is: " + (4 * Math.PI * Math.pow(sphereRadius,2)));
    }
}