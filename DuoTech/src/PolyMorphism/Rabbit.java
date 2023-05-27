package PolyMorphism;

public class Rabbit extends Animal{
    boolean hasHorns;

    public Rabbit(int age, double weight, boolean hasHorns) {
        super(age, weight);
        this.hasHorns = hasHorns;
    }
    public void eat(){
        System.out.println("Rabbit eats carrot");
    }
    public void makeSound(){
        System.out.println("rabbit is grunting");
    }
}
