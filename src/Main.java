import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Organ> organs = new ArrayList<>(); //creating organ objects and storing them using superclass references.

        organs.add(new Heart("Heart", "Circulatory System", "Chest", "Healthy", 72));

        organs.add(new Lung("Lung", "Respiratory System", "Chest", "Healthy", 95));

        organs.add(new Kidney("Kidney", "Excretory System", "Lower Back", "Healthy", true));

        organs.add(new Brain("Brain", "Nervous System", "Head", "Healthy", 86000000000L));

        int choice;

        do { //main program loop
            System.out.println("======HUMAN ORGAN SYSTEM======");
            System.out.println("1. Display All Organs");
            System.out.println("2. Perform Organ Functions");
            System.out.println("3. Detailed Information");
            System.out.println("4. Search Organ");
            System.out.println("5. Update Health Status");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("----ORGAN LIST----");

                    for (Organ organ : organs) { //runtime polymorphism
                        organ.displayInfo();
                        System.out.println("----------------------------");
                    }
                    break;

                case 2:
                    System.out.println("----ORGAN FUNCTIONS----");

                    for (Organ organ : organs) {
                        System.out.println(
                                organ.getOrganName());
                        organ.performFunction();
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("----DETAILED INFO----");

                    for (Organ organ : organs) {
                        organ.displayInfo(true);
                        System.out.println("--------------------------------");
                    }
                    break;

                case 4:
                    System.out.println("Enter organ name to search: ");

                    String searchName = input.nextLine();

                    boolean found = false;

                    for (Organ organ : organs) {
                        if (organ.getOrganName().equalsIgnoreCase(searchName)) {
                            organ.displayInfo(true);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Organ not found");
                    }
                    break;


                case 5:

                    System.out.println("Enter organ name:");
                    String organName = input.nextLine();

                    boolean organFound = false;

                    for (Organ organ : organs) {

                        if (organ.getOrganName().equalsIgnoreCase(organName)) {

                            System.out.println("Enter new health status:");
                            String status = input.nextLine();

                            organ.setHealthStatus(status);

                            System.out.println("Health status updated.");

                            organFound = true;
                            break;
                        }
                    }

                    if (!organFound) {
                        System.out.println("Organ not found.");
                    }

                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }


        } while (choice != 6);
        input.close();

    }
}