import java.util.*;

public class Password {
    public static void main(String[] args) {
        Random generator = new Random();

        System.out.print(7 + generator.nextInt(2));
        System.out.print(generator.nextInt(9));
        System.out.print(generator.nextInt(9));
        System.out.print(generator.nextInt(9));
        System.out.print(generator.nextInt(9));
        System.out.print(generator.nextInt(9));
        System.out.print("-");
        System.out.print((char)(65 + generator.nextInt(25)));
        System.out.print((char)(65 + generator.nextInt(25)));
        System.out.print((char)(65 + generator.nextInt(25)));
    }
}