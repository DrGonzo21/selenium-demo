package LABS;

public class LAB108 {
    double amount = 0.0;
    double capacity;

    public LAB108(double capacity){
        this.capacity = capacity;
    }
    public void addGas(double added){
        amount += added;
        if(amount > capacity){
            amount = capacity;
        }
    }
    public void useGas(double used){
        amount -= used;
        if(amount < 0){
            amount = 0;
        }
    }
    public boolean isEmpty() {
        return amount < 0.1;
    }
    public boolean isFull(){
        return amount > capacity - 0.1;
    }
    public double getGasLevel(){
        return amount;
    }
    public double fillUp(){
        double difference = capacity - amount;
        amount = capacity;
        return difference;
    }



}
