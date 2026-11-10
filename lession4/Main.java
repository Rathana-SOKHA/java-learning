// 1. What is a switch Statement?
// A switch statement checks a value and executes the matching case.

// Use if-else when comparing ranges or complex conditions.
// Use switch when comparing one value against several specific options.


package lession4;

public class Main {
    public static void main(String[] args) {

        // Example 

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid day.");
        }
    }
}