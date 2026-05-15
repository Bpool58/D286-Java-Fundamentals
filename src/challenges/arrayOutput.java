package challenges;

public class arrayOutput {
    public static void main (String [] args) {
        final int NUM_ELEMENTS = 4;
        int [] userVals = new int[NUM_ELEMENTS];
        int i;
        int maxVal;

        userVals[0] = 2;
        userVals[1] = 5;
        userVals[2] = 8;
        userVals[3] = 4;

        maxVal = userVals[0]; //
        for (i = 0; i < userVals.length; ++i) {
            if (userVals[i] >= maxVal) {
                maxVal = userVals[i];
                System.out.println(maxVal);
            }
        }
    }
}