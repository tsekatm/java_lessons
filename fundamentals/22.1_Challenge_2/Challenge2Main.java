import java.util.Scanner;

public class MenuDrivenCalculator {
	public static void main(String[] args) {

		Prompter prompter = new Prompter();
		Modulus modulus = new Modulus();
		Addition add = new Addition();
		Subtraction subtract = new Subtraction();
		Division divide = new Division();
		Multiplication multiply = new Multiplication();
		NumberValidator validateNumber = new NumberValidator();
		MenuValidator validateMenu = new MenuValidator();

	while (true){

		System.out.println("Menu");
		System.out.println("1. Modulus");
		System.out.println("2. Add");
		System.out.println("3. Subtraction");
		System.out.println("4. Multiplication");

		System.out.println("Enter your choice: ");

		int choice = scanner.nextInt();

		if (choice == 5) {

			System.out.println("Exiting the calculator. Goodbye");

			break;
			
		}

		System.out.println("Enter the first number: ");
		double num1 = scanner.nextDouble();

		System.out.println("Enter the second number: ")
		double num2 = scanner.nextDouble();

		switch (choice) {

		case 1:
			System.out.println("Result: " + Modulus.modulus(num1, num2));
			break;

		case 2:
			System.out.println("Result: " + Addition.add(num1, num2));
			break;

		case 3:
			System.out.println("Result: " + Subtraction.subtract(num1, num2));
			break;
		case 4:
			System.out.println("Result: " + multiplication.multiply(num1, num2));
			break;

		case 4:
			try {

				System.out.println("Result: " + Division.divide(num1, num2));
			} catch (ArithmeticException e){

				System.out.println(e.getMessage());
			}

			break;

		default:
			System.out.println("Invalid choice. Please enter a number betweeen 1 and 5");


		}


	}

	scanner.close();

		
	}
}