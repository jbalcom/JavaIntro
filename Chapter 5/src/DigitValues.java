import java.util.Scanner;

public class DigitValues {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int oddValue = 0;
        int evenValue = 0;
        int zeroValue = 0;
        int value = 0;

        System.out.println("Enter any number: ");
        int nbr = scan.nextInt();

/*      To enter in the loop, we make sure that the user enters in a number. */
        while (nbr > 0) {
/*      Compute the remainder of the number which pulls out the last digit first. */
            value = nbr % 10;
/*      Then check to see if the remainder is 0.  If so the zero counter is incremented. */
            if (value == 0){
                zeroValue++;}
/*      If that # is not zero, check to see if it is an odd #.  If it is odd, the odd counter is incremented. */
            else if ((value % 2) > 0){
                oddValue++;}
            else{
/*      If it isn"t odd, then it is even and the even counter will be incremented. */
                evenValue++;}
/*      Once the above is done, the rest of the number is pulled out and back to the top we go for the next digit in the number. */
            nbr = nbr / 10;
        }

        System.out.println("There are " + zeroValue + " zeros in the number you entered.");
        System.out.println("There are " + oddValue + " odd digits in the number you entered.");
        System.out.println("There are " + evenValue + " even digits in the number you entered.");
    }
}
