package lession11;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 11: Object-Oriented Programming");

        Student student1 = new Student("Rathana", 18, 93);
        Student student2 = new Student("Sokha", 20, 88);

        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());

        student1.study();
        student1.takeExam(97);
        student1.displayResult();

        student2.study();
        student2.takeExam(82);
        student2.displayResult();
    }
}

class Student {
    private String name;
    private int age;
    private int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void study() {
        System.out.println(name + " is studying Java.");
    }

    public void takeExam(int newScore) {
        score = newScore;
        System.out.println(name + " scored " + score + " in the exam.");
    }

    public String getInfo() {
        return "Student: " + name + ", Age: " + age + ", Score: " + score;
    }

    public void displayResult() {
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(name + " got grade " + grade + ".");
    }
}
