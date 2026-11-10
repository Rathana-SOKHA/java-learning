package lession3;
import java.util.Scanner;

public class LoginValidation {
    public void loginForm() {
        Scanner scanner = new Scanner(System.in);

        // Expect login information
        String correctUsername = "admin";
        String correctPassword = "admin123";

        // Recieve login information
        System.out.println("Enter Username:");
        String username = scanner.nextLine();

        System.out.println("Enter Password:");
        String password = scanner.nextLine();

        // validate login
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login Successfully");
            System.out.println("Welcome the the system");
        } else {
            System.out.println("Invalid username or password");
        }

        scanner.close();
    }
}
