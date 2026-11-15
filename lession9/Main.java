package lession9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 9: Arrays & ArrayList");

        String[] students = {"Rathana", "Sokha", "Mali", "Dara"};
        System.out.println("First student: " + students[0]);
        System.out.println("Array size: " + students.length);

        for (String student : students) {
            System.out.println("Student: " + student);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Alex");

        System.out.println("ArrayList size: " + names.size());
        System.out.println("Second name: " + names.get(1));

        names.remove("Mary");
        System.out.println("After removing Mary: " + names);

        names.add(1, "Sophia");
        System.out.println("After inserting Sophia at index 1: " + names);

        names.set(0, "David");
        System.out.println("After replacing index 0 with David: " + names);
    }
}
