package Student;

public class   student {
    // a class in OOP represents a template from which objects are created


    // relationship between class and object
    // recipe vs apple pie, blueprint vs house built,

    // Properties/attributes of the class are represented by variables

    // Data fields/ instance variables

    // Instance variables are initialized to a default value even though you didn't give a value to the variable
    String firstName;  // if set to private can't access this in another class
    int age;
    char gender;
    String major;
    String address;
    boolean isOnline;
    int numberOfAbsents = 0; // instance variables can also be initialized to a specific value when declared
//    -> examples of Data Fields

    // Instance -> Object
    // Instance variables -> variables that belong to each instance/object
public student( String newFirst, String newmajor, int newage,
                char gender1, boolean isOnline1){

    firstName = newFirst;
    major = newmajor;
    age = newage;
    gender = gender1;
    isOnline = isOnline1;

}
    //behaviors of object are represented by instance methods
    // instance method represent the behavior of each object/instance
    // instance methods dont have the static keyword
public String getFullName(){
    return firstName + " " + age;

}
public void markAbsent(){
    numberOfAbsents++;
}
public int getAbsents(){
    return numberOfAbsents++;



    // Typical class usually has 3 componets:
    // Instance variables (Data fields)
    // Constructors to initialize variable
}

}
