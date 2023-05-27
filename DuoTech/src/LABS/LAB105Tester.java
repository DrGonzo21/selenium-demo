package LABS;

public class LAB105Tester {

    public static void main(String[] args) {

        LAB105 dog1 = new LAB105();
        dog1.setName("Fido");
        dog1.setBreed("Labrador");
        dog1.setWeight(30.5);
        System.out.println("Dog 1:");
        System.out.println("Name: " + dog1.getName());
        System.out.println("Breed: " + dog1.getBreed());
        System.out.println("Weight: " + dog1.getWeight());


        LAB105 dog2 = new LAB105("Rex", 20.0);
        System.out.println("\nDog 2:");
        System.out.println("Name: " + dog2.getName());
        System.out.println("Breed: " + dog2.getBreed());
        System.out.println("Weight: " + dog2.getWeight());
    }
}


