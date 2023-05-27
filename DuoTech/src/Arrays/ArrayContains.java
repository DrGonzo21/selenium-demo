package Arrays;

public class ArrayContains {
    public static void main(String[] args) {

        //TESTS
        System.out.println(contains(new int[]{1, 6, 2, 1, 4, 1, 2, 1, 8}, new int[] {1, 2, 1})); //-> true
        System.out.println(contains(new int[]{1, 6, 2, 1, 4, 1, 2, 1, 8}, new int[] {6,2})); //-> true
        System.out.println(contains(new int[]{1, 6, 2, 1, 4, 1, 2, 1, 8}, new int[] {2,1,4,1})); //-> true
        System.out.println(contains(new int[]{1, 6, 2, 1, 4, 1, 2, 1, 8}, new int[] {1,4,2})); //-> false

        System.out.println(contains(new int[]{4, 5, 1, 6, 8}, new int[] {5, 1, 6, 8})); //-> true
        System.out.println(contains(new int[]{4, 5, 1, 6, 8}, new int[] {4, 1, 8})); //-> false
    }
    public static boolean contains(int[] arr1, int[] arr2){

        int n = arr1.length;
        int m = arr2.length;

        for( int i = 0; i <= n - m; i++ ){
            boolean found = true;

            for(int j = 0; j < m; j++){
                if (arr1[i + j] != arr2[j]) {
                    found = false;
                    break;
                }
            }
            if (found){
                return true;
            }
        }
        return false;
    }
}


