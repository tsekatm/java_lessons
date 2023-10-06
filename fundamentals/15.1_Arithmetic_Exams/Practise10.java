public class Practise10 {

	public static void main(String[] args) {


		//Breakdown

		int a = (25 * 11) / (25 * 10);
		System.out.println(a);
		int b = a * 10 - 5 + 7 % 2;
		System.out.println(b);
		int c = 10 * 5 + 100 * b ;// compares to: first printed value
		System.out.println(c);
		 


		System.out.println("c is "+ c);
		int e = 100 * (25 * 11);
		int f = 10 * 5 + e;
		int g = (25 * 10) * 10;
		int h = g - 5 + 7 % 2;// compares to zx/yz


		System.out.println("h is " +f/g); 
		
		System.out.println(10 * 5 + 100 * (25 * 11) / (25 * 10) * 10 - 5 + 7 % 2);
		int zx = (10 * 5 + 100 * (25 * 11));
		int yz = ((25 * 10) * 10 - 5 + 7 % 2);

		System.out.println("zx/yz is " + zx/yz);
	}
}