package challenges;

import java.util.Scanner;

public class ForLoops2 {
    public static void main (String [] args) {
        int startNumber;
        int lastNumber;
        int i;

        Scanner input = new Scanner(System.in);
        startNumber = input.nextInt();
        lastNumber = input.nextInt();

        for (i = startNumber; i <= lastNumber; i++) {
            System.out.print(i + " ");
        }
    }
} //