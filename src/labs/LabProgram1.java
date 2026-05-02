package labs;

import java.util.Scanner;

public class LabProgram1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userName;

        userName = scnr.next();

        String firstName = userName;

        System.out.println("Hello " + firstName + ", and welcome to CS Online!");
    }
}
//