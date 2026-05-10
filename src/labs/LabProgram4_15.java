package labs;

import java.util.Scanner;

public class LabProgram4_15 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int num;
        int max;
        int sum;
        int count;
        double average;

        num = scnr.nextInt();

        max = num;
        sum = 0;
        count = 0;

        while (num >= 0) {

            if (num > max) {
                max = num;
            }

            sum = sum + num;

            count = count + 1;

            num = scnr.nextInt();
        }

        average = (double) sum / count;

        System.out.print(max + " ");

        System.out.printf("%.2f\n", average);
    }
}
