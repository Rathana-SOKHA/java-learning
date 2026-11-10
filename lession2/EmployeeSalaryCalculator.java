package lession2;
import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public void employeeSalary() {

        Scanner  scanner = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Employee Salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter Employee Bonus:");
        double bonus = scanner.nextDouble();

        double TotalSalary = salary + bonus;

        System.out.println("===== SALARY INFORMATION =====");
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + TotalSalary);


        scanner.close();

    }
}
