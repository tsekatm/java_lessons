public class NumberValidator {

    public static boolean isValid(String numInt) {
        try {
            Double.parseDouble(numInt);
            return true;

        } catch (Exception e) {
            return false;
        }

    }
}

   

