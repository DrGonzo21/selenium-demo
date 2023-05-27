package LABS;

public class LAB98 {
    //    Complete the sumColumn method so that given a 2-D int array and an integer representing the column
//    to sum, sum up the all elements in that column in the given array.
    public static void main(String[] args)
    {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        System.out.println(sumColumn(a,1)); //should print -9
        System.out.println(sumColumn(a,3)); //should print 5
    }
    public static int sumColumn(int[][] array, int column)
    {
        int sum =0;

        for(int i = 0; i< array.length;i++){

            if(column >= array[i].length){
                continue;
            }
            sum += array[i][column];
        }
        return sum;
    }
}

