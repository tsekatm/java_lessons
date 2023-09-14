import java.util.Scanner;

public class DistanceConversionService {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How far is your favourite store from your home (in kilometers):");
        double distance_from_store_km = Double.parseDouble(in.nextLine());

        double distance_in_mm = distance_from_store_km * 1000000; // Convert km to mm

        System.out.println("The distance is approximately " + distance_in_mm + " millimeters.");
    }
}
