package LABS;

public class Lab108Tester {
    public static void main(String[] args) {
        LAB108 tank = new LAB108(20);
        tank.addGas(10);
        tank.useGas(5.0);
        System.out.println("Is the tank empty? " + tank.isEmpty());
        System.out.println("Is the tank full? " + tank.isFull());
        System.out.println("Current gas level: " + tank.getGasLevel());

        double differernce = tank.fillUp();
        System.out.println("Filled up the tank with "  + differernce + " gallons");
        System.out.println("Current gas level: " + tank.getGasLevel());
    }
}
