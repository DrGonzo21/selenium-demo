package Instancevariable;
public class GasTank {


 double amount = 0.0;

public void addGas(double gas) {
        amount += gas;
        }

public void useGas(double gas) {
        amount -= gas;
        if (amount < 0) {
        amount = 0;
        }
        }

public boolean isEmpty() {
        return (amount < 0.1);
        }

public double getGasLevel() {
        return amount;
        }
        }