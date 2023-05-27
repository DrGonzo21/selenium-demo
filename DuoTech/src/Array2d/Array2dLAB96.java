package Array2d;

public class Array2dLAB96 {
//    Complete the sumRow method.  The method should take in an 2D integer array and a row number.
//    The method should return the sum of the elements in a given row.
//    For example, if row = 0, you should return the sum of all the elements in the topmost row.
    public static void main(String[] args)
    {
        int[][] a = {
                {5,2,3,7},
                {1,5,2,2},
                {1,2,3,4}
        };
        System.out.println(sumRow(a,2)); //should print 10
        System.out.println(sumRow(a,0)); //should print 17
    }
    public static int sumRow(int[][] array, int row)
    {
        int sum = 0;

        for(int i = 0; i< array[row].length; i++){
            sum += array[row][i] ;

        }
        return sum;
    }
}


