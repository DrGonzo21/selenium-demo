package Arrays;

public class reverseEachWord {
    public static void main(String[] args) {
        //Run Unit Tests to check your method correctness
        System.out.println(reverseEachWord("Hi how are you"));
        System.out.println(reverseEachWord("Java is fun"));
        System.out.println(reverseEachWord("Javaisfun"));
        System.out.println(reverseEachWord("Sometimes it's better to leave something alone, to pause, and that's very true of programming"));

    }
    public static String reverseEachWord(String str){
        String[] arr = str.split(" ");
        String str2 = "";

        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            arr[i] = sb.reverse().toString();
        }
        return String.join(" ", arr);
    }
}

