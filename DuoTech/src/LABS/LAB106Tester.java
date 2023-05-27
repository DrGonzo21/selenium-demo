package LABS;

public class LAB106Tester {

    public static void main(String[] args) {
        // Using no-arg constructor
       LAB106 car1 = new LAB106();
        System.out.println(car1.getMake()); // null
        System.out.println(car1.getModel()); // null
        System.out.println(car1.getNumberOfDoors()); // 0
        System.out.println(car1.getTopSpeed()); // 0
        System.out.println(car1.getPrice()); // 0.0

        // Using constructor with numberOfDoors argument
        LAB106 car2 = new LAB106(2);
        System.out.println(car2.getMake()); // null
        System.out.println(car2.getModel()); // null
        System.out.println(car2.getNumberOfDoors()); // 2
        System.out.println(car2.getTopSpeed()); // 0
        System.out.println(car2.getPrice()); // 0.0

        // Using constructor with make and model arguments
        LAB106 car3 = new LAB106("Toyota", "Camry");
        System.out.println(car3.getMake()); // Toyota
        System.out.println(car3.getModel()); // Camry
        System.out.println(car3.getNumberOfDoors()); // 0
        System.out.println(car3.getTopSpeed()); // 0
        System.out.println(car3.getPrice()); // 0.0

        // Using constructor with topSpeed and price arguments
        LAB106 car4 = new LAB106(120, 20000);
        System.out.println(car4.getMake()); // null
        System.out.println(car4.getModel()); // null
        System.out.println(car4.getNumberOfDoors()); // 0
        System.out.println(car4.getTopSpeed()); // 120
        System.out.println(car4.getPrice()); // 20000.0
    }
}