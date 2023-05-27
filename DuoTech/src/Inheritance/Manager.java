package Inheritance;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int yearsOfService, double bonus) {
        super(name, salary, yearsOfService);
        this.bonus = bonus;
    }

    public String toString() {
        return super.toString() + ", Bonus: " + bonus;
    }

    public double getPaid() {
        return super.getPaid() + (bonus * super.getPaid() / 100);
    }
}