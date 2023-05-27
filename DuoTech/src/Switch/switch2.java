package Switch;

public class switch2 {
    public static void main(String[] args) {

        System.out.println(convertToRoman(5)); // V
        System.out.println(convertToRoman(10)); // X
        System.out.println(convertToRoman(7)); // VII
        System.out.println(convertToRoman(3)); // III
        System.out.println(convertToRoman(0)); // Invalid
        System.out.println(convertToRoman(-2)); // Invalid
        System.out.println(convertToRoman(123)); // Invalid

    }
    public static String convertToRoman (int number)
    {
        StringBuilder br = new StringBuilder("");
        while(number!=0)
        {
            if (number>=10)
            {
                br.append("X");
                number-=10;
            }
            while(number>=9)
            {
                br.append("IX");
                number-=9;
            }
            while(number>=5)
            {
                br.append("V");
                number-=5;
            }
            while(number>=4)
            {
                br.append("IV");
                number-=4;
            }
            while(number>=1)
            {
                br.append("I");
                number-=1;
            }
        }
        return br.toString();
    }
}


