package LABS;

public class LAB112 {
    int employeeId;
    String firstName;
    String lastName;
    String department;
    double annualSalary;

    public LAB112(int employeedId, String firstName, String lastName, double annualSalary){
        this.employeeId = employeedId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void raiseSalary(double percent) {
        double raiseAmount = annualSalary * percent / 100;
        annualSalary += raiseAmount;
    }
}


