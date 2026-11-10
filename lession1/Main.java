// What this Java for beginners course cover

// 1. How the Java compiler work
// 2. Data types & Variable
// 3. Arithmetic operators & Expression
// 4. Input & Output
// 5. Making decistion - if statements
// 6. Performing repeatition - loops while for
// 7. Method - Function
// 8. OOP - Object-Oriented Programming
// 9. Data structuers - Array & Array List
// 10. Text file processing



public class Main {
    public static void main(String[] args) {
        
        Student student = new Student();
        student.name = "Rathana";
        student.age = 21;

        System.out.println(student.name);
        System.out.println(student.age);

        Teacher teacher = new Teacher();
        teacher.subject = "English";
        teacher.grade =  12;

        System.out.println(teacher.subject);
        System.out.println(teacher.grade);

        personalInfoSystem person = new personalInfoSystem();
        person.displayInfo();

        EmployeeSalaryCalculator employee = new EmployeeSalaryCalculator();
        employee.displayInfo();

    }
    
}

class Student {
    String name;
    int age;
}

class Teacher {
    String subject;
    int grade;
}