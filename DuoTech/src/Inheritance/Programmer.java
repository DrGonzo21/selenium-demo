package Inheritance;

public class Programmer extends Employee {
    private String language;

    public Programmer(String name, double salary, int yearsOfService, String language) {
        super(name, salary, yearsOfService);
        this.language = language;
    }

    public String toString() {
        return super.toString() + ", Language: " + language;
    }

    public double getPaid() {
        double extraBonus = 0;
        if (language.equals("Java")) {
            extraBonus = 30000;
        } else if (language.equals("Python")) {
            extraBonus = 40000;
        } else if (language.equals("Scala")) {
            extraBonus = 50000;
        } else {
            extraBonus = 25000;
        }
        return super.getPaid() + extraBonus;
    }
}