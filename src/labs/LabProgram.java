package labs;

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();
        num4 = scnr.nextInt();

        int product = num1 * num2 * num3 * num4;
        int average = (num1 + num2 + num3 + num4) / 4;

        double productD = 1.0 * num1 * num2 * num3 * num4;
        double averageD = (double) (num1 + num2 + num3 + num4) / 4;

        System.out.println(product + " " + average);
        System.out.printf("%.3f %.3f\n", productD, averageD); //.
    }
}
