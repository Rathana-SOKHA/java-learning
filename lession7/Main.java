package lession7;

public class Main {
    public static void main(String[] args) {
        int[] scores = {78, 85, 92, 64, 89};

        System.out.println("Student Score Report");
        System.out.println("Average score: " + calculateAverage(scores));

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (i + 1) + " -> " + scores[i] + " = " + getGrade(scores[i]));
        }

        System.out.println("Highest score: " + getHighestScore(scores));
        System.out.println("Lowest score: " + getLowestScore(scores));
    }

    static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0.0;
        }

        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return (double) total / numbers.length;
    }

    static char getGrade(int score) {
        if (score < 0) {
            return 'F';
        } else if (score >= 90) {
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

    static int getHighestScore(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int highest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }
        return highest;
    }

    static int getLowestScore(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int lowest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
        return lowest;
    }
}
