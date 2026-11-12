package lession8;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 8: Object-Oriented Programming (OOP)");

        Student student1 = new Student();
        student1.name = "Rathana";
        student1.age = 21;

        Student student2 = new Student();
        student2.name = "Sokha";
        student2.age = 18;

        System.out.println("Student 1: " + student1.name + ", Age: " + student1.age);
        System.out.println("Student 2: " + student2.name + ", Age: " + student2.age);

        student1.introduce();
        student2.introduce();
    }
}

class Student {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}
