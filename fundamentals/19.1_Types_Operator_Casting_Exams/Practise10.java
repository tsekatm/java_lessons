public class Practise10 {

	public static void main(String[] args) {
		
		byte b;
		int i = 258;
		double d = 325.59;

		b = (byte) i;
		System.out.println(b);

		i = (int) d;
		System.out.println(i);

		b = (byte) d;
		System.out.println(b);
	}
}