import java.util.Scanner;

public class Challenge1 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = in.nextLine();

		System.out.println("What is your surname?");
		String surname = in.nextLine();

		System.out.println("Hello: " + name +" " + surname);

		System.out.println("Enter your date of birth(DD/MM/YYYY):");
		String date_of_birth = in.nextLine();
		String year = date_of_birth.split("\\/")[2];
		int years_old = 2023 - Integer.parseInt(year); 

		System.out.println("You are " + years_old + " "+ "old");

		System.out.println("How far is your favourite store from your home in Kms");
		double distance_from_store_km = Double.parseDouble(in.nextLine());
		double distance_in_mm = distance_from_store_km * 1000000;
		System.out.println("You stay " + distance_in_mm + " mm"+ " " + "from your favourite store");

		System.out.println("Hello: " + name + " " + surname + " " +  "You are " + years_old + " " + "old and you stay " + distance_in_mm + " mm from your favourite store");
	
	}
} 



