package PolyMorphism;
import java.util.Scanner;


public class AnimalManager {


    public static void main(String[] args) {

//        Animal animal = new Animal(23,20.4);
//
//        Bird bird = new Bird(4,23,true);

//        Animal animal = new Bird(4,23,true);
//        animal.makeSound();
//
//        animal = new Snake(3,12,true);
//        animal.makeSound();

        System.out.println("Please choose your animal: 1.Bird. 2.Snake. 3Rabbit");

        int choice = new Scanner(System.in).nextInt();

        Animal animal = null;

        switch(choice){
            case 1:
                animal = new Bird(4,32,true);
                break;
            case 2:
                animal = new Snake(2,20,true);
                break;
            case 3:
                animal = new Rabbit(3,45,true);
        }
        animal.makeSound();
        animal.eat();

    }
}
