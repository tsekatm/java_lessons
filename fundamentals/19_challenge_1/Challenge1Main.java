import java.util.Scanner;
import java.util.Calendar;

public class Challenge1Main {
    public static void main(String[] args) {
        String name = Prompter.prompt("Enter your name: ");
        String surname = Prompter.prompt("Enter your surname: ");
        String date_of_birth = Prompter.prompt("Enter your date of birth (DD/MM/YYYY): ");
        
        boolean dateValid = DateValidator.isValid(date_of_birth);
        int age = 0; // Initialize age
        
        if (dateValid) {
            age = AgeCalculator.calculate(date_of_birth);
        } else {
            System.out.println("Date is not valid, exiting");
            return; // Exit the program if date is not valid
        }

        String kilometers = Prompter.prompt("Distance from home to your favourite store in Km: ");

        boolean isValid = NumberValidator.isValid(kilometers);
        double km = 0.0; // Initialize km

        if (isValid) {
            km = Double.parseDouble(kilometers);
        } else {
            System.out.println("Number not valid, please input correct numbers");
            return; // Exit the program if number is not valid
        }

        double miles = km * 0.621371;
        
        System.out.println("Hi " + name + " " + surname + ". You are " + age + " years old, " +
                           "you live " + miles + " miles away from your favourite store");
    }
}


