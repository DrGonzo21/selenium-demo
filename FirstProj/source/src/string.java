public class string {
    public static void main(String[] args) {

        //TESTS
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
        System.out.println(middleTwo("hi"));
        System.out.println(middleTwo("ethereum") );
        System.out.println(middleTwo("window") );

    }

    //Write your method here

    public static String middleTwo(String str){



        int mid = str.length()/2;



        return str.substring(mid-1,mid+1);
    }


}
