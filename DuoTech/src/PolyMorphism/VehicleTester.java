package PolyMorphism;

public class VehicleTester {
    public static void main(String[] args) {


        Vehicle[] vehicles = new Vehicle[3];
        System.out.println();

        Car tesla = new Car(" Tesla", " Model S ", 2023 , 155 , 4);
        Truck ford = new Truck(" Ford", " F-150 ", 1988 , 120 , 200);
        Motorcycle Ducati = new Motorcycle(" Ducati ", " 1099 ", 2021, 100, false);

        vehicles[0] = tesla;
        vehicles[1] = ford;
        vehicles[2] = Ducati;

        for (Vehicle vehicle : vehicles) {
            vehicle.drive();

            System.out.println();
        }
    }
}
