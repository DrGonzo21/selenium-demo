package ArrayLists;

public abstract class Shape {

    // How do you prevent class instantiation
    // 1.make it abstract
    // 2. make the default constructor private



    private String color;

    protected Shape(String color) {
        this.color = color;
    }

    public abstract double getArea(); //making a method abstract will enforce subclass to override the method

    public abstract double getPerimeter();
    // abstract methods cannot have a body  "{}" including a empty one
    // abstract methods end with a semicolon ";"

    public String toString(){
        return "color is: " + color;
    }
    // public abstract void hello(); // Abstract method in a non-Abstract class



}
