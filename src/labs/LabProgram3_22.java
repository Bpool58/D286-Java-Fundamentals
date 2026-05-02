package labs;
import java.util.Scanner;


public class LabProgram3_22 {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int a = scnr.nextInt();
    int b = scnr.nextInt();
    int c = scnr.nextInt();

   int smallest = a;

   if (b < smallest) {
       System.out.println(smallest);
   }

   if (c <smallest) {
       System.out.println(smallest);
   }

   System.out.print(smallest);


    }
}
