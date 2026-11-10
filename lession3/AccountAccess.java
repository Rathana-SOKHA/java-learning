
package lession3;

import java.util.Scanner;

public class AccountAccess {

    public void accountAccess() {

        Scanner scanner = new Scanner(System.in);

        // Expected account information
        String correctUsername = "freelancer";
        String correctPassword = "123456";

        // Get user information
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter Active Account: ");
        boolean isActive = scanner.nextBoolean();

        System.out.print("Enter Account Verify: ");
        boolean isVerify = scanner.nextBoolean();

        // Validate account
        if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
            System.out.println("Invalid username or password");
        }

        else if (!isActive) {
            System.out.println("Your account is inactive");
        }

        else if (!isVerify) {
            System.out.println("Please verify your account");
        }

        else {
            System.out.println("Login successful!");
            System.out.println("You can access your dashboard.");
        }

        scanner.close();
    }
}
