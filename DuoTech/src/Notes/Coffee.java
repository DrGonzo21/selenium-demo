package Notes;

public class Coffee {

    static boolean ground = true;
//    static{
//        System.out.println("Good morning");
//        ground = true;
//    }
    public static void brewCoffee(){
        if(ground) {
            System.out.println("Brewing a coffee");
        }
    }
}
