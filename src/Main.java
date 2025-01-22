import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM

        // Declare variables

        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        // welcome message

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // promp for user choice

        System.out.print("Choose an option: ");
        choice = sc.nextInt();

        // option 1 convert lbs to kgs

        if (choice == 1) {
            System.out.print("Enter weight in lbs: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            // System.out.println("New weight in kgs is " + newWeight);
            System.out.printf("New weight in kgs %.2f%n", newWeight);
        }

        // option 2 convert kgs to lbs

        else if (choice == 2) {
            System.out.print("Enter weight in kgs: ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("New weight in lbs %.2f%n", newWeight);
        }

        // else print not a valid choice

        else {
            System.out.println("Invalid option");
        }

        sc.close();

    }
}