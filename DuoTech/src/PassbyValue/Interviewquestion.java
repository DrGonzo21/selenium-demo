package PassbyValue;

public class Interviewquestion {
    // Can you overload the main method
    // Main method can be overloaded but the overloading method is not going to be a runnable method
    // like the main method
    public static void main(String[] args) {
        // This method is the main method that will never change and has to be: public static void main (String[] args)
        System.out.println("Main");

        main(4); //-> this call the overloaded main method

    }
    public static void main(int args){
        System.out.println("Overloaded Main");


    }
}
