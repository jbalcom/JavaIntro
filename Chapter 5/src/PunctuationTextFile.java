import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PunctuationTextFile {
    public static void main(String[] args) throws IOException {
        ArrayList<String> testText = new ArrayList<String>();
        String text, testString;
        int punctuationCnt = 0;
        int periodCnt = 0;
        int exclamationCnt = 0;
        int questionCnt = 0;
        int index;

        Scanner fileScan, txtScan;
        fileScan = new Scanner(new File("PunctuationSearch.txt"));

        while (fileScan.hasNext()) {
            text = fileScan.nextLine();
            System.out.println("The line in the text file reads: " + text);

            index = 0;
            while (index < text.length()){
                try {
                    if (text.charAt(index) == '.') {
                        periodCnt++;
                        punctuationCnt++;
                    }else if (text.charAt(index) == '!') {
                        exclamationCnt++;
                        punctuationCnt++;
                    }else if (text.charAt(index) == '?') {
                        questionCnt++;
                        punctuationCnt++;
                    }
                    index++;
                }
                catch(Exception e) {
                    System.out.println("Warning: Exception e");
                }
            }
        }
        System.out.println();
        System.out.println("There are " + punctuationCnt + " punctuation's in the text file.");
        System.out.println("Those valid punctuations are: ");
        System.out.println("Periods:           " + periodCnt);
        System.out.println("Exclamation Marks: " + exclamationCnt);
        System.out.println("Question Marks:    " + questionCnt);
    }
}




