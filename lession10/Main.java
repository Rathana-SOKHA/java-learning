package lession10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 10: String Handling");

        String name = "Rathana";
        System.out.println("Name: " + name);

        // String length
        System.out.println("Length: " + name.length());

        // Uppercase / Lowercase
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        // Character access
        System.out.println("First character: " + name.charAt(0));

        // String comparison
        String anotherName = "rathana";
        System.out.println("Equals ignore case: " + name.equalsIgnoreCase(anotherName));

        // Substring
        System.out.println("Substring: " + name.substring(0, 4));

        // Replace
        String message = "Java is fun";
        System.out.println("Replaced: " + message.replace("fun", "easy"));
    }
}
