import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class IntegerTextFile {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> testInt = new ArrayList<>();
        String text, testString;
        int index;
        int holdNbr;

        Scanner fileScan, txtScan;
        fileScan = new Scanner(new File("IntegerSearch.txt"));

        while (fileScan.hasNext()){
            text = fileScan.nextLine();
            System.out.println("The line in the text file reads: " + text);

            txtScan = new Scanner(text);
            txtScan.useDelimiter("/");

            index = 0;
            while (txtScan.hasNext()) {
                try {
                    testString = txtScan.next();
                    holdNbr = Integer.parseInt(testString);
                    testInt.add(index,holdNbr);
                    index++;
                }
                catch(NumberFormatException nfe) {
                    System.out.println("Warning: NumberFormatException");
                }
            }
        }
        System.out.println();
        System.out.println("The amount of valid integers in the text file are: " + testInt.size() + ".");
        System.out.println("Those valid integers are: " + testInt);
    }
}

