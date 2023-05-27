package LABS;

public class LAB95 {
    //    Complete the method doubleArr method so that it doubles the values of every element in the array.
//    Nothing should be returned - the array should be modified by the method.
    public static void main(String[] args)
    {
        double[][]a = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };

        doubleArr(a);

        //prints array
        for(double[] row : a){
            for(double e : row){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }



    public static void doubleArr(double[][] arr)
    {
        for(int i = 0; i< arr.length;i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] *= 2;

            }
        }

    }

}

