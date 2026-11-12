package lession9;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 9: Arrays & ArrayList");

        // Array example
        String[] students = {"Rathana", "Sokha", "Mali", "Dara"};
        System.out.println("First student: " + students[0]);
        System.out.println("Array size: " + students.length);

        for (String student : students) {
            System.out.println("Student: " + student);
        }

        // ArrayList example
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Alex");

        System.out.println("ArrayList size: " + names.size());
        System.out.println("Second name: " + names.get(1));

        names.remove("Mary");
        System.out.println("After removing Mary: " + names);
    }
}
