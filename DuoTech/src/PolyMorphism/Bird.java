package PolyMorphism ;

public class Bird extends Animal {
    boolean hasWings;

    public Bird(int age, double weight, boolean hasWings) {
        super(age, weight);
        this.hasWings = hasWings;
    }
    public void eat(){
        System.out.println("Bird eats");
}
}
