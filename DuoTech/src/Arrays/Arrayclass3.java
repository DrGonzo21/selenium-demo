package Arrays;

import java.util.Arrays;

public class Arrayclass3 {
    public static void main(String[] args) {

        String[] arr = {"John", "Alice", "Bob", "Alice", "John"};

         for (int i = 0; i < arr.length; i++) {
         if (arr[i].equals("John")) {
           arr[i] = "Johnny";
           arr[i] = arr[i].toUpperCase();
        }
          System.out.println(Arrays.toString(arr));
        }
         }
}
///Find out how many times Alice is in this collection

       // int count = 0;
     //   for (int i = 0; i < arr.length; i++) {

       //     if (arr[i] == "Alice") {
            //    count++;

         //   }
         //   System.out.println(count);
       // }
  //  }
//}
