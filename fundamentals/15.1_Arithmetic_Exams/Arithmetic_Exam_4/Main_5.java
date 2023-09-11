public class Main {

	public static void main(String[] args) {
		
		static int x = 2;
		int y = --x;
	}
}// it is not compiling because a static variable is declared inside 
// the main method instead of at the class level