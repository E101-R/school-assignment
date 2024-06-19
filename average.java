import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Array to hold marks of the five units
        double[] marks = new double[5];
        double total = 0.0;
        
        // Prompt the user to enter marks for each unit
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the marks for unit " + (i + 1) + ": ");
            marks[i] = input.nextDouble();
            total += marks[i];
        }
        
        // Calculate the average
        double average = total / 5;
        
        // Display the average with two decimal places
        System.out.printf("The average marks are: %.2f%n", average);
        
        // Close the input
        input.close();
    }
}
