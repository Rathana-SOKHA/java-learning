
package lession2;
import java.util.Scanner;

public class StudentRegistrationSystem {

    public void studentForm() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Student Registration Form =====");

        System.out.println("Enter student ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        System.out.println("Enter student email:");
        String email = scanner.nextLine();

        System.out.println("Enter student score:");
        double score = scanner.nextDouble();

        System.out.println("\n===== Student Information =====");
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Email: " + email);
        System.out.println("Student Score: " + score);

        scanner.close();
    }
}
