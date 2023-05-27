package Numbers;

public class randomPassword {

        public static void main(String[] args) {
            System.out.println(generate(5));  //srtbh
            System.out.println(generate(8));
            System.out.println(generate(10));

        }

        public static String generate(int length){

            int i = 0;

            String str = "";

            while(i < length){
                char ch = (char)(int)(65+(Math.random()*26));
                char ch1 = (char)(int)(97+(Math.random()*26));
                char ch2 = (char)(int)(48+(Math.random()*10));
                str += (Math.random()>0.33 ? ch: Math.random()>0.66 ? ch1 : ch2);
                i++;
            }
            return str;
        }
    }

