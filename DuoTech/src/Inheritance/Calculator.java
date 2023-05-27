package Inheritance;

public class Calculator {
    protected double accumulator;

    public Calculator() {
        this.accumulator = accumulator;
    }
    public void add(double value) {
        accumulator += value;
    }
    public void subtract(double value) {
        accumulator -= value;
    }
    public void multiply(double value) {
        accumulator *= value;
    }
    public void divide(double value) {
        accumulator /= value;
    }
    public double getAccumulator(){
        return accumulator;
    }
}
