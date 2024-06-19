import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisibilityTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        List<Integer> divisibleBy = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                divisibleBy.add(i);
            }
        }

        if (!divisibleBy.isEmpty()) {
            System.out.print("The number is divisible by ");
            for (int i = 0; i < divisibleBy.size(); i++) {
                System.out.print(divisibleBy.get(i));
                if (i < divisibleBy.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(".");
        } else {
            System.out.println("The number is not divisible by any integer in the range of 1-9.");
        }
    }
}
