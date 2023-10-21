public class Main15 {

	public static void main(String[] args) {

		int x = 0;

		label1:

		if (++x < 10 && (x / 0 < 10)) {

			System.out.println("Bishal");

			continue label1;
			
		} else {

			System.out.println("GEEKS");
		}
		
	}
}