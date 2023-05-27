package String;

public class String1 {
    public static String makeOutWord(String out, String word) {
        // implement here


        String s1a = out.substring(0, (out.length()/2));

        String s1b = out.substring((out.length()/2));



        System.out.println(s1a + word + s1b);

        /// System.out.println(makeOutWord("<<>>", "Yay"));

        //→ "<<Yay>>"


        public static String noStart(String a, String b) {



            String on = a.substring(1,a.length());
            String off = b.substring(1,b.length());

            System.out.println(on + off);


            //System.out.println(noStart("Hello", "There"));
            // → "ellohere"


            public static String middleThree(String str) {

                String middle = str.substring (str.length()/2 - 1, str.length()/2 + 2);


                System.out.println(middle);
                return "";
                //System.out.println(middleThree("Chocolate"));
                // → "col"

}
