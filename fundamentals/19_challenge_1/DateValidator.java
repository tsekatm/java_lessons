public class DateValidator {

    public static boolean isValid(String date_of_birth){

        boolean dateValid = isDateValid(date_of_birth);

        if (dateValid) {
            int age = AgeCalculator.calculate(date_of_birth);
            return true;
        } else {
            System.out.println("Date is not valid, exiting");
            return false;
        }
    }

    private static boolean isDateValid(String date) {
        String[] parts = date.split("/");
        if (parts.length != 3) {
            return false; // Date format is incorrect
        }

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Simple validation for demonstration purposes
        if (year < 1900 || year > 2100 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false; // Invalid date components
        }

        return true; // Date is valid
    }
}

