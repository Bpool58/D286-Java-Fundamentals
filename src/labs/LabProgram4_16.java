package labs;

import java.util.Scanner;

public class LabProgram4_16 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);

        char userChar;
        String userString;
        int count;

        userChar = scnr.next().charAt(0);
        userString = scnr.nextLine();

        count = 0;

        for (int i = 0; i < userString.length(); ++i) {

            if (userString.charAt(i) == userChar) {
                count++;
            }
        }


        if (count == 1) {
            System.out.println(count + " " + userChar);
        }
        else {
            System.out.println(count + " " + userChar + "'s");
        }
    }
}
