package PolyMorphism;

public class Snake extends Animal{
    boolean isPoisionous;

    public Snake(int age, double weight, boolean isPoisionous) {
        super(age, weight);
        this.isPoisionous = isPoisionous;
    }
    public void eat() {
        System.out.println("snake eats mouse");
    }
    public void makeSound(){
        System.out.println("Snake hisses");
    }
}
