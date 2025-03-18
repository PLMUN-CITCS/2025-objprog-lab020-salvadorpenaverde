import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            if (choice == 3) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }
            handleMenuChoice(choice);
        }
    }

    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    public static void handleMenuChoice(int choice) {
        Scanner scanner = new Scanner(System.in);
        if (choice == 1) {
            greetUser();
        } else if (choice == 2) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            checkEvenOrOdd(number);
        } else {
            System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }

    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}