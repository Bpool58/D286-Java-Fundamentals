package challenges;
import java.util.Scanner;

public class FindMatchValue {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);

        final int NUM_VALS = 4;
        int[] userValues = new int[NUM_VALS];
        int i;
        int matchValue;
        int numMatches;

        // Read match value
        matchValue = scnr.nextInt();

        // Read array values
        for (i = 0; i < userValues.length; ++i) {
            userValues[i] = scnr.nextInt();
        }

        // Start counter at 0
        numMatches = 0;

        // Loop through array and count matches
        for (i = 0; i < userValues.length; ++i) {

            // Check if current element equals matchValue
            if (userValues[i] == matchValue) {
                numMatches++;
            }

        }

        System.out.println("matchValue: " + matchValue + ", numMatches: " + numMatches);
    }
}