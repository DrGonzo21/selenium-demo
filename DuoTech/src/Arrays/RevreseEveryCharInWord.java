package Arrays;

public class RevreseEveryCharInWord {
    public static void main(String[] args) {
        //Run Unit Tests to check your method correctness
        System.out.print(reverseEachWord("Hi how are you"));

    }

    public static String reverseEachWord(String str){
        String[] arr = str.split(" ");
        String str2 = "";

        for (int i = 0; i < arr.length; i++) {
            arr[i] =   arr[i].substring(1) + arr[i].charAt(0);

        }

        return String.join(" ", arr);
    }
}

