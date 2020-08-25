import java.util.Scanner;

public class Cubes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int cube1, cube2;
        System.out.print("Enter in cube 1: ");
        num1 = scan.nextInt();

        cube1 = (int) Math.pow(num2 ,3);

        System.out.print("Enter in side 2: ");
        num2 = scan.nextInt();

        cube2 = (int) Math.pow(num2 ,3);
        System.out.println("The sum of these cubes is: " + (cube1 + cube2));
    }
}
