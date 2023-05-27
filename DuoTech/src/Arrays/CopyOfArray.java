package Arrays;
import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args){

        int [] num1 = new int[10];

        num1[0] = (int)(Math.random()*100);
        num1[1] = (int)(Math.random()*100);
        num1[2] = (int)(Math.random()*100);
        num1[3] = (int)(Math.random()*100);
        num1[4] = (int)(Math.random()*100);
        num1[5] = (int)(Math.random()*100);
        num1[6] = (int)(Math.random()*100);
        num1[7] = (int)(Math.random()*100);
        num1[8] = (int)(Math.random()*100);
        num1[9] = (int)(Math.random()*100);

        int[] num2 =  new int[num1.length];

        for(int i = 0; i < num2.length; i++){
            num2[i] = num1[i];
        }
        num1[num1.length-1] = -1;

        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
    }
}

