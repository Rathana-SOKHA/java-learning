public class EmployeeSalaryCalculator {
    String name = "Rathana";
    double salary = 500.00;
    double bonus = 100.00;
    double tax = 0.10;
    
    double final_salary = (salary + bonus) * (1-tax);

    public void displayInfo() {
        System.out.println("Employee:" + name);
        System.out.println("Salary:" + salary);
        System.out.println("Bonus:" + bonus);
        System.out.println("Tax:" + tax);
        System.out.println("Final Salary:" + final_salary);
    }

}
