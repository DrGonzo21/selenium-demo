package Arrays;
import java.util.Arrays;

public class CombineString {
    public static void main(String[] args){
        // Tests
        String [] arr = combineNames(new String[] {"bob","joe","rob"} , new String[] {"jones","smith","paul"});
        System.out.println(Arrays.toString(arr)); // -> [bob jones, joe smith, rob paul]

        String [] arr1 = combineNames(new String[] {"Barack","Kamala"} , new String[] {"Obama","Harris"});
        System.out.println(Arrays.toString(arr1)); // -> [Barack Obama, Kamala Harris]

        String [] arr2 = combineNames(new String[] {"Hey","What's up"} , new String[] {"Yo","Man"});
        System.out.println(Arrays.toString(arr2)); // -> [Hey Yo, What's up Man]


    }



    public static String[] combineNames(String[] first, String[] second){

        int length = first.length;
        String[] combinedNames = new String[length];
        for (int i = 0; i < length; i++) {
            combinedNames[i] = first[i] + " " + second[i];
        }
        return combinedNames;
    }

}


