package PolyMorphism;

public class Animal {
    int age;
    double weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

public void eat() {
    System.out.println("Animal is eating");
}
public void makeSound(){
    System.out.println("Animal makes sound");
}


}
