package labs;

import java.util.Scanner;

public class LabProgram4_17 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String userString;
        String result;

        userString = scnr.nextLine();

        result = "";

        for (int i = 0; i < userString.length(); i++) {

            char currChar = userString.charAt(i);

            if (Character.isLetter(currChar)) {
                result = result + currChar;
            }
        }
        System.out.println(result); //
    }
}
