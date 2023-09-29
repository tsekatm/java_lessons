import java.util.Scanner;

public class MilesCalculator {

    public static double calculate(String kilometers){

        double kilometersValue = Double.parseDouble(kilometers);
        double miles = kilometersValue * 0.621371; // 1 kilometer = 0.621371 miles
        return miles;



    }

    
}
