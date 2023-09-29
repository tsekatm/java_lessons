import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculator {

    public static int calculate(String date_of_birth) {

        String[] parts = date_of_birth.split("/");
        int year_of_birth = Integer.parseInt(parts[2]);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - year_of_birth;
        return age;
        
    }



    
}


