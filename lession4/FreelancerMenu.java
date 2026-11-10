package lession4;

import java.util.Scanner;

public class FreelancerMenu {
    public void freelancerMenu() {
        Scanner scanner = new Scanner(System.in);

        // Display Menu
        System.out.println("===== FREELANCER MENU =====");
        System.out.println("1. View Projects");
        System.out.println("2. View My Applications");
        System.out.println("3. View My Profile");
        System.out.println("4. Logout");

        // Get user choice
        System.out.println("Choose option: ");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Opening available projects...");
                break;
            
            case 2:
                System.out.println("Opening your applications...");
                break;

            case 3:
                System.out.println("Opening your profile...");
                break;

            case 4:
                System.out.println("Logging out...");
                break;

            default:
                System.out.println("Invalid option! Please choose between 1 and 4.");
                break;
        }

        scanner.close();
    }
}
