package LABS;

public class LAB105 {
    String name;
    String breed;
    double weight;

    public LAB105(){

    }
    public LAB105(String name, double weight){
        this.name = name;
        this.weight = weight;
        this.breed = "Mutt";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

