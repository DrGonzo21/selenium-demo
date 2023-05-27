package Arrays;

public class ArrayLinearSearch {
    public static void main(String[] args) {
        int [] arr = {2, 34, 5, 1, 4, 2, 234, 21, 34, 2, 3, 423, 2};
        System.out.println(linearSearch(arr, 423));
    }
    public static int linearSearch(int [] arr, int key){
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] == key){
                return i;

            }

        }
        return -1;
        // This method isn't very effective for large arrays

    }
}
