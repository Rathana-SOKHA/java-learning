package lession5;
import java.util.Scanner;;

public class StudentScoreCalculator {
    public void studentScore() {
        Scanner scanner = new Scanner(System.in);

        double total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter score" + i + ": ");
            double score = scanner.nextDouble();
            
            total += score;
        }

        double avg = total / 5;

        System.out.println("Total Score: " + total);
        System.out.println("Average: " + avg);

        scanner.close();

    }
}
