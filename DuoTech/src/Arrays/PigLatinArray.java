package Arrays;

public class PigLatinArray {
    public static void main(String[] args) {
        System.out.println(pigLatin("I SLEPT MOST OF THE NIGHT"));
        System.out.println(pigLatin("How many languages do you speak"));
        System.out.println(pigLatin("Java is fun"));
    }
    public static String  pigLatin(String str){

        String[] arr = str.split(" "); //split sentence into a array of words

        for (int i = 0; i < arr.length ; i++) { // iterate through a array of words
            arr[i] =   arr[i].substring(1) + arr[i].charAt(0) +"ay"; // modify each word t a piglatin word

        }
        return String.join(" ", arr) ; // combine words to a single word
    }
}

