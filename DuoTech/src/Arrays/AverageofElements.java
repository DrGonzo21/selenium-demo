package Arrays;

public class AverageofElements {

    public static void main(String[] args){
        //Tests
        System.out.println(averageLength(new String[] {"belt", "hat", "jelly", "bubble gum"})); // 5.5;
        System.out.println(averageLength(new String[] {"hi", "hola", "bonjour", "hallo", "konnichiwa"})); // 5.6;
        System.out.println(averageLength(new String[] {"dog", "shiba", "inu"})); // 3.6666666666666665;
        System.out.println(averageLength(new String[] {"ciao", "bye", "hasta luego", "auf wiedersehen", "aloha"})); // 7.6;
    }



    public static double averageLength(String[] arr) {
        int sum = 0;
        for (String s : arr) {
            sum += s.length();
        }
        return (double) sum / arr.length;
    }
}


