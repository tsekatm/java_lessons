import java.util.Scanner;

public class UserInfoService {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = in.nextLine();

        System.out.println("What is your surname?");
        String surname = in.nextLine();

        System.out.println("Hello: " + name + " " + surname);

        System.out.println("Enter your date of birth(DD/MM/YYYY):");
        String date_of_birth = in.nextLine();
        String year = date_of_birth.split("/")[2];
        int years_old = 2023 - Integer.parseInt(year);

        System.out.println("You are " + years_old + " " + "years old");
    }
}

public class DistanceConversionService {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How far is your favourite store from your home (in kilometers):");
        double distance_from_store_km = Double.parseDouble(in.nextLine());

        double distance_in_mm = distance_from_store_km * 1000000; // Convert km to mm

        System.out.println("The distance is approximately " + distance_in_mm + " millimeters.");
    }
}

