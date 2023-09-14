import java.util.Scanner;

public class UserInfoService {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = in.nextLine();

        System.out.println("What is your surname?");
        String surname = in.nextLine();

        System.out.println("Hello: " + name + " " + surname);

        System.out.println("Enter your date of birth(DD/MM/YYYY):");
        String date_of_birth = in.nextLine();
        String year = date_of_birth.split("/")[2];
        int years_old = 2023 - Integer.parseInt(year);

        System.out.println("You are " + years_old + " " + "years old");
    }
}
