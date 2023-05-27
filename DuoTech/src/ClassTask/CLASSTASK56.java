package ClassTask;

public class CLASSTASK56 {
    public static void main(String[] args) {
        Numbers(1,2,4,55,6,7,8,3,4,23,90);
    }

    public static void Numbers(int...args){
        int sum = 0;
        int min = args[0];
        int max = args[0];

        for(int i = 0; i < args.length;i++){
            sum = sum + args[i];
            if(args[i] < min){
                min = args[i];
            }
            if(args[i] > max){
                max = args[i];
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}

