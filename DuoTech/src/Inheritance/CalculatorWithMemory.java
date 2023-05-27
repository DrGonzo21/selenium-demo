package Inheritance;

public class CalculatorWithMemory extends Calculator{
    private double memory;
    public CalculatorWithMemory(){
        super();
        memory = 0.0;
    }
    public void save(){
        memory = accumulator;
    }
    public void recall() {
        accumulator = memory;
    }
    public void clearMemory() {
        memory = 0.0;
    }
    public double getMemory(){
        return memory;

    }
}
