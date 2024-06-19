import java.util.Scanner;

public class SurnameAgeChecker {
    public static void main(String[] args) {
        // Declaration: Scanner is the type, scanner is the variable name
        Scanner scanner = new Scanner(System.in); // Initialization: new Scanner(System.in) creates a new Scanner object
        
        // Ask the user for their surname
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine(); // Using the scanner object to read a line of input
        
        // Ask the user for their age
        System.out.print("Enter your current age: ");
        int age = scanner.nextInt(); // Using the scanner object to read an integer input
        
        // Calculate the number of characters in the surname
        int surnameLength = surname.length();
        
        // Check if the age is even or odd
        String ageType = (age % 2 == 0) ? "even" : "odd";
        
        // Print the results
        System.out.println("The number of characters in your surname is " + surnameLength + ".");
        System.out.println("Your current age is an " + ageType + " number.");
        
        // Close the scanner
        scanner.close(); // Closing the scanner to free up resources
    }
}
