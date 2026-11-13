package lession7;

public class Main {
    public static void main(String[] args) {
        int[] scores = {78, 85, 92, 64, 89};

        System.out.println("Student Score Report");
        System.out.println("Average score: " + calculateAverage(scores));

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (i + 1) + " -> " + scores[i] + " = " + getGrade(scores[i]));
        }
    }

    static double calculateAverage(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return (double) total / numbers.length;
    }

    static char getGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
