package Switch;

public class switchstatement {
    //Create a method that prints whether the given character is a vowel or consonant.

    public static void main(String[] args) {
        //TESTS
        vowelOrConsonant('e'); // Vowel
        vowelOrConsonant('T'); // Consonant
        vowelOrConsonant('U');// Vowel
        vowelOrConsonant('a');// Vowel
        vowelOrConsonant('O');// Vowel
        vowelOrConsonant('X');// Consonant
        vowelOrConsonant('z');// Consonant

    }
    public static void vowelOrConsonant(char ch){
        //implement here

        switch (ch){

            case 'e':
                System.out.println("Vowel");
                break;
            case 'T':
                System.out.println("Consonant");
                break;
            case 'U':
                System.out.println("Vowel");
                break;
            case 'a':
                System.out.println("Vowel");
                break;
            case 'O':
                System.out.println("Vowel");
                break;
            case 'X':
                System.out.println("Consonant");
                break;
            case 'z':
                System.out.println("Consonant");
                break;
            default:
                System.out.println("Invalid");


        }
    }
}
