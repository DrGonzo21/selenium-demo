package PassbyValue;

public class classexample {
    public static void main(String[] args) {
        int length = 5;
        String[] type = new String[1];
        length = adjustPropellers(length, type);
        System.out.println(length+ ","+type[0]);
    }
    public static int adjustPropellers(int length, String[] type){
        length++;
        type[0] = "LONG";
        return length;
    }
}
