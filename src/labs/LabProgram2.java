package labs;

import java.util.Scanner;

public class LabProgram2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int quarters = scnr.nextInt();
        int dimes = scnr.nextInt();
        int nickels = scnr.nextInt();
        int pennies = scnr.nextInt();

        double total = quarters * 0.25 + dimes * 0.10 + nickels * 0.05 + pennies * 0.01;

        System.out.printf("Amount: $%.2f\n", total);
    }
}
