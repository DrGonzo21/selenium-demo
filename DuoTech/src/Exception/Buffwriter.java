package Exception;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Buffwriter {


    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\jerro\\Desktop\\Docs\\Jboody.txt";

        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));

        for (int i = 0; i < 100; i++) {            // this is how many times you wwant the passwo  rd created
            bw.write(generatePass(18));     // this is to create a password with the length
            bw.newLine();
        }

        bw.close();
    }
    public static String generatePass(int length){

        String abc = "abcdefghijklmnoprstuvwxyz12345678890";
        StringBuilder sb =  new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(abc.charAt(new Random().nextInt(abc.length())));
        }


        return sb.toString();
    }
}
