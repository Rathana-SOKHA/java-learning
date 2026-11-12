package lession7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Lesson 7 - Methods");

        sayHello();

        int result = addNumbers(15, 25);
        System.out.println("Sum: " + result);

        double total = calculatePriceWithTax(500, 10);
        System.out.println("Total with tax: " + total);

        int age = 21;
        String message = checkAge(age);
        System.out.println(message);
    }

    static void sayHello() {
        System.out.println("Hello, Java learner!");
    }

    static int addNumbers(int a, int b) {
        return a + b;
    }

    static double calculatePriceWithTax(double price, double taxPercent) {
        double tax = price * taxPercent / 100;
        return price + tax;
    }

    static String checkAge(int age) {
        if (age >= 18) {
            return "You are an adult.";
        } else {
            return "You are a minor.";
        }
    }
}
