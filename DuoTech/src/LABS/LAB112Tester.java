package LABS;

public class LAB112Tester {
    public static void main(String[] args) {
        LAB112 emp = new LAB112(1234, "John", "Doe", 50000.0);

        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("First name: " + emp.getFirstName());
        System.out.println("Last name: " + emp.getLastName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Annual salary: $" + emp.getAnnualSalary());

        emp.setEmployeeId(5678);
        emp.setDepartment("Marketing");

        emp.raiseSalary(10.0);

        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Annual salary: $" + emp.getAnnualSalary());
    }
}

