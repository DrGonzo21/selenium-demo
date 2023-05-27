package Notes;

public class AutoBoxing {
    public static void main(String[] args) {


     int i = 89;

//     Integer intObj = 56; // 56 is autoboxed to an integer object -> new Integer(56)
        Integer intObj = i;

        Double d = 4.5;

        // Autounboxing

        Integer myObj = Integer.valueOf("56");

        int primitive = myObj; // myObj (new Integer(56)) is autounboxed to 56
        // autounboxing means removing the wrapper

//        Double myDouble = 45; // myDouble = new Integer(45); -> code doesn't compile, can only use this with primitives

        // With direct value assignment make sure your are using the correct type. e.g int w/ int, double w/ double

    }
}
