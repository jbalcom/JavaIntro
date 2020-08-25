import java.util.*;

public class NameValue {
    public static void main(String[] args) {
        String name;
        char n;
        int value = 0;
        int index = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        name = scan.nextLine();

        while (index < name.length()) {
            n = name.toUpperCase().charAt(index);
            int i = (int)(n);
            value += (i - 64);
            index++;
        }
        System.out.println("The total value of your name is " + value + ".");
    }
}
