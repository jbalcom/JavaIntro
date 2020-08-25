import java.util.Scanner;

public class SquarePerim {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int side;
        System.out.println("Enter the length of a side on a square:");
        side = scan.nextInt();

        int sideTotal = side * 4;

        System.out.println("The perimeter of the square is " + sideTotal + ".");
    }
}
