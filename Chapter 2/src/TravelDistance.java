import java.util.Scanner;

public class TravelDistance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int speed, travelDistance;

        System.out.println("Enter the speed in MPH:");
        speed = scan.nextInt();

        System.out.println("Enter the distance traveled:");
        travelDistance = scan.nextInt();

        float time = (float) (travelDistance/speed);

        System.out.println("The time it takes to go " + travelDistance + " miles at " + speed + " mph is " + time + " hours.");
    }
}
