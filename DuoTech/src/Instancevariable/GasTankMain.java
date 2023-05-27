package Instancevariable;

public class GasTankMain {
    public static void main(String[] args) {

        GasTank gas = new GasTank();
        gas.addGas(10.0);
        gas.useGas(5.0);

        boolean empty = gas.isEmpty();
        System.out.println("Tank is empty: " + empty);

        double gasLevel = gas.getGasLevel();
        System.out.println("Gas level: " + gasLevel);
    }
}
