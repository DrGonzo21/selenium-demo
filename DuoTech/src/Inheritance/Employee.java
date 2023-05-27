package Inheritance;

public class Employee {
    private String name;
    private double salary;
    private int yearsOfService;

    public Employee(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
    }

    public String toString() {
        return "Name: " + name + ", Salary: " + salary + ", Years of service: " + yearsOfService;
    }

    public double getPaid() {
        return salary;
    }
}

