import java.util.Scanner;

public class Challenge1_4 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("How far is your favourite store from your home in Kms");
		double distance_from_store_km = Double.parseDouble(in.nextLine());
		double distance_in_mm = distance_from_store_km * 1000000;
		System.out.println("You stay " + distance_in_mm + " mm"+ " " + "from your favourite store");
	
	}
} 