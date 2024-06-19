import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the operation (+, -, *, /)
        System.out.println("Enter the operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        // Prompt the user to enter the second number
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        // Variable to store the result of the operation
        double result = 0;

        // Perform the operation based on the user's choice
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check if the second number is not zero to avoid division by zero error
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    // Display an error message if the second number is zero
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                // Display an error message if the operation is invalid
                System.out.println("Invalid operation!");
                return;
        }

        // Display the result of the operation
        System.out.println("Result: " + result);
    }
}
