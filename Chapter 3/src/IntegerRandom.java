import java.util.Random;

public class IntegerRandom {
    public static void main(String[] args) {

        Random generator = new Random();

        double sin, cos, tan;
        int value;

        value = 20 + generator.nextInt(21);

        System.out.println("The random number between 20 & 40 is " + value);
        System.out.println("The sine of " + value + " is " + (Math.sin(value)));
        System.out.println("The cosine of " + value + " is " + (Math.cos(value)));
        System.out.println("The tangent of " + value + " is " + (Math.tan(value)));
    }
}