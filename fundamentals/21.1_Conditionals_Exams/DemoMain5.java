public class DemoMain5 {

	public static void main(String[] args) {
		
		double discount;
		char code = 'C';

		switch (code) 
		{
		case 'A':
			discount = 0.0;
			System.out.println(discount);

		case 'B':
			discount = 0.1;
			System.out.println(discount);

		case 'C':
			discount = 0.2;
			System.out.println(discount);

		default:
			
			discount = 0.3;
			System.out.println(discount);
			
		}
	}
}