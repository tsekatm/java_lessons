public class Test2 {
	public static void main(String[] args) {
		
		String dayString1, dayString2, dayString3;

		int day = 3;

		if (day == 1) {

			dayString1 = " Saturday";
			dayString2 = "sunday";
			System.out.println(dayString2);
			
		}

		if (day == 2)
			dayString2 = "sunday";
		if (day == 3) {
			dayString3 = "Monday";
			System.out.println(dayString3);
			
		}
		if (day == 4) {

			dayString1 = "Tuesday";
			dayString2 = "Wednesday";
			
		}
		if (day == 5)
			dayString2 = "Wednesday";
		if (day < 1 || day > 5)
			dayString3 = "Invalid day";
	}
}