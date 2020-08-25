import java.util.Random;

public class RandomRadius {
    public static void main(String[] args) {

        Random generator = new Random();

        int radius;
        int height;

        radius = 1 + generator.nextInt(20);
        height = 1 + generator.nextInt(20);

        System.out.println("The random radius number is: " + radius);
        System.out.println("The random height number is: " + height);
        System.out.println("The cylinder's volume is: " + (Math.PI * Math.pow(radius, 2) * height));
        System.out.println("The cylinder's surface area is: " + (2 * Math.PI * radius * height));
    }
}