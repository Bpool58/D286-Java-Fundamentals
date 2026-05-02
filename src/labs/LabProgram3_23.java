import java.util.Scanner;



public class LabProgram3_23 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int highwayNumber;
        int primaryNumber;

        highwayNumber = scnr.nextInt();

        // Invalid range
        if (highwayNumber < 1 || highwayNumber > 999) {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }

        // Primary highway
        else if (highwayNumber <= 99) {
            if (highwayNumber % 2 == 0) {
                System.out.println("I-" + highwayNumber + " is primary, going east/west.");
            } else {
                System.out.println("I-" + highwayNumber + " is primary, going north/south.");
            }
        }

        // Auxiliary highway
        else {
            primaryNumber = highwayNumber % 100;

            // Invalid auxiliary (ends in 00)
            if (primaryNumber == 0) {
                System.out.println(highwayNumber + " is not a valid interstate highway number.");
            }
            else {
                if (primaryNumber % 2 == 0) {
                    System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going east/west.");
                } else {
                    System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going north/south.");
                }
            }
        }
    }
}

//