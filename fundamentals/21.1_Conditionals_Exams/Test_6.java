public class Test_6 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 'B';

		if(!(a < b))

			a = 20;
			System.out.println(a);
		if(!(a > b))
			System.out.println((int)b);

		else if (a < b || a >= b)

			System.out.println((int)b);

		else

			System.out.println(a);
	}
}