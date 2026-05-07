// Problem breakdown:
// 1. Print "Ready!"
// 2. Count DOWN from userNum to 1
// 3. Print each number on its own line
// 4. Print "Start!"



package challenges;

import java.util.Scanner;

public class ForLoops1 {
    public static void main (String [] args) {
        int userNum;
        int i;

        Scanner input = new Scanner(System.in);
        userNum = input.nextInt();

        System.out.println("Ready!");

        for (i = userNum; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Start!");

    }
}