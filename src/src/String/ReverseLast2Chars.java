package String;

public class ReverseLast2Chars {
    public static void main(String[] args) {


        StringBuilder stringBuildervarible = new StringBuilder();


        String last2 = str.substring(str.length() - 2);

        stringBuildervarible.append(last2);

        stringBuildervarible.reverse();

        String word = str.substring(0, str.length() - 2);

        System.out.println(word + stringBuildervarible);

        return "";
    }
}
// If only one char use this instead:

 //if(str.length() <= 0|| str.equals("")){

 //        return str;
//         }