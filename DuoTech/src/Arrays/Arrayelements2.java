package Arrays;

public class Arrayelements2 {
    public static void main(String[] args) {
        System.out.println(averageLength(new String[] {"Jerrod", "Yesenia", "Novie", "Helena", "Benicio", "Anastacia"})); // 6.666666666666667
}
public static double averageLength(String [] arr){
        int sum = 0;
        for (String s : arr){
           sum += s.length();

        }
        return (double) sum / arr.length;
}

}
