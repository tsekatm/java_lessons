public class Arithmetic01{

	public static void main(String[] args) {
		
		double a1 = 4/2;
		System.out.println("a1 = "+a1);
		double a2 = a1/3;
		System.out.println("a2 = "+a2);

		double a3 = 2/3.0;
		System.out.println("a3 = "+a3);
		double a4 = a3/4;
		System.out.println("a4 = "+a4);

		double a = 4/2/3.0;
		System.out.println("a = "+a);
		double b = a * 4;
		System.out.println("b = "+b);
		double c = 7 % b;
		System.out.println("c = "+c);



		double i = 7 % (4/2/3.0) * 4;

		System.out.println("i = " +i);
	}
}