package LABS;

public class LAB116C {
    public static void main(String[] args) {

        System.out.println(toCamelCase("the quick BROWN fox")); //"theQuickBrownFox"
        System.out.println(toCamelCase("hello world")); //"helloWorld"
        System.out.println(toCamelCase("HELLO WORLD")); //"helloWorld"
        System.out.println(toCamelCase("heLLo biG WOrLD")); //"helloBigWorld"



    }
    public static String toCamelCase(String s){

        String[] words = s.split("\\W+");
        StringBuilder sb = new StringBuilder(words[0].toLowerCase());
        for(int i = 1; i < words.length; i++){
            sb.append(words[i].substring(0, 1).toUpperCase());
            sb.append(words[i].substring(1).toLowerCase());
        }
        return sb.toString();
    }
}
