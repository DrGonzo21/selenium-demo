package Numbers;

public class RandomPassword2 {
    public static void main(String[] args) {

        System.out.println(generate(10));
    }
    public static String generate(int num){
        String alpha = "abcdefghijklmnopqrstuvABCDEFGHIJKLMNOPQRSTUV123456789!@#$%^&*";
        String str = "";
        for(int i = 0; i < num; i++){
            int randomIndex = ((int)(Math.random()*alpha.length()));
            str += alpha.charAt(randomIndex);

        }
        return str;
    }
}
