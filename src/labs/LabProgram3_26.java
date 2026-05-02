/*
Write a program that reads a person's name in one of two formats:
firstName middleName lastName or firstName lastName. The program should output the name in the
format: lastName, firstInitial.middleInitial. If a middle name is not provided,
 output lastName, firstInitial. instead. For example,
 input "Pat Silly Doe" should produce "Doe, P.S." and input "Julia Clark" should produce "Clark, J.".
*/
package labs;

import java.util.Scanner;

public class LabProgram3_26 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String first = scnr.next();
        String second = scnr.next();

        if (scnr.hasNext()) {
            // 3 names case
            String third = scnr.next();
            System.out.println(third + ", " + first.charAt(0) + "." + second.charAt(0) + ".");
        }

        else {
            // 2 names case
            System.out.println(second + ", " + first.charAt(0) + ".");
        }
    }
}