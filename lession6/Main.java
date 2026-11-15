package lession6;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {12, 8, 21, 5, 30};

        System.out.println("Original numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int total = 0;
        for (int number : numbers) {
            total += number;
        }

        System.out.println("Total: " + total);
        System.out.println("Average: " + (double) total / numbers.length);

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("Largest number: " + largest);
    }
}
