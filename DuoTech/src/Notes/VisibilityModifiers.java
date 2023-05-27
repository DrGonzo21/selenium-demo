package Notes;

import java.util.Arrays;

public class VisibilityModifiers {
    // Java has 4 visibility/access modifiers:

    // private -> default -> protected -> public

    // We can apply visibility modifiers to the class, fields, methods, constructors

    public String name; // public -> visible by every other class
    int[] nominalValues; // -> default visibility (no modifier) -> visible in this package only (package private)

    protected String abbrev; // protected is more accessible than default
    private  char symbol; // private is only visible within that class, not accessible outside of the class
    boolean hasDigitalVersion;
    void spend(){ // -> default
        // static  or non static has no relation to the visibilty
    }
    protected void getInfo(){ //-> protected

    }
    private void doSomething(){ // private methods are usually used for internal opertaion
        // that outside class can't have access to

    }

// private constructor is used to create object from this class, make the no arg constructor private

    // how can you prevent class intantiation/ object creation? make the main constructor private
    // e.g Math class , Arrays class,

    public static void main(String[] args) {

//        public int i = 9; // local variables cannot have any visibilty

        Currency currency1 = new Currency("Dollar", new int []{1,5,10,20,50},"usd", '$',true);
        System.out.println(currency1.name);
        System.out.println(Arrays.toString(currency1.nominalValues));


    }
}
