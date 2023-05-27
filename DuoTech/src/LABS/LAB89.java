package LABS;

public class LAB89 {
    public static void main(String[] args) {

        //TESTS
        System.out.println(isSorted(new double[] {16.1, 12.3, 22.2, 14.4})); // -> false
        System.out.println(isSorted(new double[] {1.5, 4.3, 7.0, 19.5, 25.1, 46.2}));// -> true
        System.out.println(isSorted(new double[] {2.2, 5.4, 2.2, 5.4})); // -> false
        System.out.println(isSorted(new double[] {5.2, 5.3, 5.3, 5.5, 5.55, 5.56}));// -> true

    }


    public static boolean isSorted(double[] arr){

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;

            }

        }
        return true;
    }
}


