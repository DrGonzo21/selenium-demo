package Arrays;

public class ArraysTimesTen {
    public static void main(String[] args){
        //Tests
        timesTen(new int[] {1,2,3}); //-> [10,20,30]
        timesTen(new int[] {0,10,100,1000}); //-> [0,100,1000,10000]
        timesTen(new int[] {1,2,3}); //-> [10,20,30]
        timesTen(new int[] {7}); //-> [70]
        timesTen(new int[] {1,1}); //-> [10,10]
    }


    public static void timesTen(int [] arr) {
        int x = 0;
        String result = "";
        for(int i = 0; i < arr.length; i++){
            x = arr[i];
            result += Integer.toString(x * 10) + " ";
        }
        System.out.println("\nResult: "+result);

    }
}

