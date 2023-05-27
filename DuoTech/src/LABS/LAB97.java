package LABS;

public class LAB97 {
    //    Complete the max2Delement method.
//    The method should take in a 2D array as a parameter and return the highest value in the array.
    public static void main(String[] args)
    {
        int[][] a = {
                {5,2,3,7},
                {1,5,1,1},
                {8,3,1,2}
        };
        System.out.println(max2Delement(a)); //should be 8
    }
    public static int max2Delement(int[][] nums)
    {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums[i].length;j++){

                if(nums[i][j] > max){
                    max = nums[i][j];
                }
            }
        }
        return max;

    }
}
