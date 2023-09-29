import java.util.Scanner;

public class Prompter {
    public static String prompt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
}
