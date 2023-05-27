package Notes;

public class Carclass {

    // this keyword is used in ways:
    // 1. to refer to this class's instance variables and instance methods
    // 2. to call another constructor in the same class -> this(), this("Hello")


    int year;
    String make;
    String model;
    String vin;
    boolean isAwd;

//    this(year 1989, make "toyota", model "supra", vin "houwe", false);
    // this() call must be the first statement in the constructor
//    public Carclass(int year) {
//        this.year = year;
//    }
//    public Carclass() {
//      // initialize all values to some actual values
//    }
//
//    public String getMake() {
//    return make;
//    }
//    public  String getModel() {
//    return model;
//    }
//
//    public int getYear(){
//        return this.year; // this refers to the Car class's object
//    }
//    public void setYear(int year){
////       year = year; // this assigns year to itself
//        this.year = year; // this is example is used to differentiate between local method and class instance variable
//    }
//    public String getMakeandModel() {
//        return this.getMake() + " " + this.getModel();
//        // this.method is used to expilictly call method from this class
//    }


    public String toString() {
        return "Carclass{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", isAwd=" + isAwd +
                '}';
    }

//    public Carclass(int year, String make, String model, String vin, boolean isAwd) {
//        this(year);
//        this.make = "Toyota";
//        this.model = "Supra";
//        this.vin = "HSIUHSOU*&*(";
//        this.isAwd = false;
//
//

        }
//    }
//
//    }



