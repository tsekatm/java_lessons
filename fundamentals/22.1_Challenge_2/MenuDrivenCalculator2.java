import java.util.Scanner;

class NumberValidator {
    static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

class MenuValidator {
    static boolean isValidMenuChoice(int choice) {
        return choice >= 1 && choice <= 5;
    }
}

public class MenuDrivenCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Modulus");
            System.out.println("2. Add");
            System.out.println("3. Subtraction");
            System.out.println("4. Multiplication");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            String choiceInput = scanner.next();

            if (!NumberValidator.isDouble(choiceInput)) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            int choice = Integer.parseInt(choiceInput);

            if (!MenuValidator.isValidMenuChoice(choice)) {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                continue;
            }

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye");
                break;
            }

            System.out.print("Enter the first number: ");
            String num1Input = scanner.next();

            if (!NumberValidator.isDouble(num1Input)) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            double num1 = Double.parseDouble(num1Input);

            System.out.print("Enter the second number: ");
            String num2Input = scanner.next();

            if (!NumberValidator.isDouble(num2Input)) {
                System.out.println("Invalid number.");
                continue;
            }

            double num2 = Double.parseDouble(num2Input);

            double result = 0;

            switch (choice) {
                case 1:
                    result = num1 % num2;
                    break;
                case 2:
                    result = num1 + num2;
                    break;
                case 3:
                    result = num1 - num2;
                    break;
                case 4:
                    result = num1 * num2;
                    break;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
