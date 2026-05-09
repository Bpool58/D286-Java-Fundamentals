package challenges;

import java.util.Scanner;
public class NestedLoop {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int i;
        int j;

        userNum = scnr.nextInt();

        for (i = 0; i <= userNum; i++) {

            // print spaces
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // print number
            System.out.println(i);
        }

    }
}