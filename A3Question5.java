
abstract class Employee {
    protected String name;
    protected int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double basicSalary;
    private double bonus;

    public FullTimeEmployee(String name, int id, double basicSalary, double bonus) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }
}


class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class A3Question5 {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 1, 5000.0, 1000.0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Doe", 2, 40, 25.0);

        
        System.out.println("Full-time Employee Salary: " + fullTimeEmployee.calculateSalary());
        System.out.println("Part-time Employee Salary: " + partTimeEmployee.calculateSalary());
}
}


    

