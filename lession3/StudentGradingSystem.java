
package lession3;

import java.util.Scanner;

public class StudentGradingSystem {

    public void studentGrading() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Score: ");
        double score = scanner.nextDouble();

        if (score < 0 || score > 100) {
            System.out.println("Invalid Score");
        }

        else if (score >= 90) {
            System.out.println("Grade: A");
        }

        else if (score >= 80) {
            System.out.println("Grade: B");
        }

        else if (score >= 70) {
            System.out.println("Grade: C");
        }

        else if (score >= 60) {
            System.out.println("Grade: D");
        }

        else if (score >= 50) {
            System.out.println("Grade: E");
        }

        else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}
