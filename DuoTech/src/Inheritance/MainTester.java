package Inheritance;

public class MainTester {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 50000, 2);
        Manager manager1 = new Manager("Jane Smith", 75000, 5, 10);
        Programmer programmer1 = new Programmer("Bob Johnson", 60000, 3, "Java");

        System.out.println(employee1.toString());
        System.out.println("Paid: " + employee1.getPaid());

        System.out.println(manager1.toString());
        System.out.println("Paid: " + manager1.getPaid());

        System.out.println(programmer1.toString());
        System.out.println("Paid: " + programmer1.getPaid());
    }
}

