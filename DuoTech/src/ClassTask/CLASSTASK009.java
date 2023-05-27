package ClassTask;

public class CLASSTASK009 {

    public static void main(String[] args){
        // Example method calls for printFullNameReversed
        printFullNameReversed("Joe", "Biden"); // Output: Biden, Joe
        printFullNameReversed("Eric", "Prydz"); // Output: Prydz, Eric
        printFullNameReversed("Green", "Velvet"); // Output: Velvet, Green

// Example method calls for getFullNameReversed
        System.out.println(getFullNameReversed("Joe", "Biden")); //fullName1 = "Biden, Joe"
        System.out.println(getFullNameReversed("Eric", "Prydz"));//fullName2 = "Prydz, Eric"
        System.out.println(getFullNameReversed("Green", "Velvet"));//fullName3="Velvet,Green"
    }
    public static void printFullNameReversed(String firstName, String lastName) {
        System.out.println(lastName + ", " + firstName);
    }
    public static String getFullNameReversed(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }
}
