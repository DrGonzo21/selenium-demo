package String;

public class passwordGen {
    public static void main(String[] args) {

        char first = (char) (Math.random() * 26 + 65);
        char second = (char) (Math.random() * 26 + 97);
        char third = (char) (Math.random() * 26 + 97);
        char fourth = (char) (Math.random() * 26 + 97);
        char fifth = (char) (Math.random() * 26 + 97);
        char sixth = (char) (Math.random() * 26 + 97);
        char seventh = (char) (Math.random() * 26 + 97);
        char eighth = (char) (Math.random() * 26 + 65);

        System.out.println("" + first + second + third + fourth + fifth + sixth + seventh + eighth);

    }
}
