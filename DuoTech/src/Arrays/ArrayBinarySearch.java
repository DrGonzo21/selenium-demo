package Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr, 8));
    }
    public static int binarySearch(int[] arr, int key){

   // obtain 2 indexs

    int begin = 0;
    int end = arr.length-1;

    while(end > begin){
    int mid = (begin + end) / 2;

    if(arr[mid] < key){
      begin = mid + 1;

    } else if (arr[mid] > key) {
            end = mid - 1;

    } else {
            return mid;

        }

    }
        return 0;
    }
}


