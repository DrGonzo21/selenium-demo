package Arrays;
import java.util.Arrays;


public class TripDim {
    public static void main(String[] args) {
        double [][][] scores = new double[2][4][2];


        for (int i = 0; i < scores.length; i++){
            for(int j = 0; j<scores[i].length; j++){
                for(int k = 0; k<scores[i][j].length; k++){
                    scores[i][j][k] = (int)(Math.random()*30); // if you increase dimensions, you also need to increase for loops

                }

            }
        }
        System.out.println(Arrays.deepToString(scores));







//        System.out.println(Arrays.deepToString(scores));

//        for (double[][] arr : scores){  //always use a for each loop to print 3 dimensional loop
//            for (double[] arr1 : arr){  // use a normal for loop to change the values
//                for (double num : arr1)
//                    System.out.print(num + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
    }
}
