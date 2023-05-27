package Notes;
import java.util.Arrays;
import static java.lang.Math.random; // static import is or static methods/variables of the class
import static java.util.Arrays.*;
public class April1st {

    static int i = 0;

    public static void main(String[] args) {

      //static int i = 6; // local variables do not have the concept of static or instance
         final int i = 6; //local variables can be applied final keyword to make them constant
        System.out.println(i);

        // classes with static methods only -> Math, Arrays


        System.out.println(12 + (int)random()* 12);
        System.out.println(Math.PI);

        sort(new int[]{2,3,1,5,4});
        binarySearch(new int []{1,2,3}, 2);
        fill(new int[] {1,2,3}, 4);
    }
}
