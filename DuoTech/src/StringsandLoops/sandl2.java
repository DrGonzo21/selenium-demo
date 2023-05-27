package StringsandLoops;

public class sandl2 {
    public static void main(String[] args) {
        System.out.println(countString("crazy crayfish crushing craniums", "cra")); //->3
        System.out.println(countString("sometimes solutions dont come on time", "me")); //->4
        System.out.println(countString("yoyoyoyoyoyoyoyoyoyoyoyoyoyoyoy", "yo")); //->15
    }
    public static int countString(String str, String toFind){

        int counter = 0;
        int start = str.indexOf(toFind);
        while(start > -1){
            counter++;
            start = str.indexOf(toFind, start + 1);
        }

        return counter;
    }
}
