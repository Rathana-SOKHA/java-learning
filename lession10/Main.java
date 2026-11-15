package lession10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 10: String Handling");

        String name = "Rathana";
        System.out.println("Name: " + name);

        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First character: " + name.charAt(0));

        String anotherName = "rathana";
        System.out.println("Equals ignore case: " + name.equalsIgnoreCase(anotherName));

        System.out.println("Substring: " + name.substring(0, 4));

        String message = "Java is fun";
        System.out.println("Replaced: " + message.replace("fun", "easy"));

        String fullName = "Rathana Sokha";
        System.out.println("Contains Sokha: " + fullName.contains("Sokha"));
        System.out.println("Trimmed: [" + "  Hello Java  ".trim() + "]");

        String email = "student@gmail.com";
        System.out.println("Has @ symbol: " + email.contains("@"));
        System.out.println("Domain: " + email.substring(email.indexOf('@') + 1));
    }
}
