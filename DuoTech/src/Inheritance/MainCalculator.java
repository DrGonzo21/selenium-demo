package Inheritance;

public class MainCalculator {
    public static void main(String[] args) {

        CalculatorWithMemory calculator = new CalculatorWithMemory();

        calculator.add(5.0);
        calculator.multiply(3.0);
        calculator.save();
        calculator.subtract(2.0);
        System.out.println("Accumulator: " + calculator.getAccumulator()); //Accumulator: 13.0
        System.out.println("Memory: " + calculator.getMemory()); // Memory: 15.0

        calculator.recall();
        System.out.println("Accumulator: " + calculator.getAccumulator()); // Accumulator: 15.0

        calculator.clearMemory();
        System.out.println("Memory: " + calculator.getMemory()); // Memory: 0.0


    }
}
