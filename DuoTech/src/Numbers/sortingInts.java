package Numbers;

public class sortingInts {
    public static void main(String[] args) {
        sort3Ints(3,2,1); //->  1,2,3
        sort3Ints(3,3,1); //->  1,3,3
        sort3Ints(-2,-10,-1); //->  -10,-2,-1
        sort3Ints(99,78,22); //->  22,78,99
        sort3Ints(0,-2,1); //->  -2,0,1
        sort3Ints(7,0,0); //->  0,0,7

    }
    public static void sort3Ints (int a, int b, int c){
        int  min, max, med;
        if( a > b ){
            if( a > c ){
                max = a;
                if( b > c ){
                    med = b;
                    min = c;
                }else{
                    med = c;
                    min = b;
                }
            }else{
                med = a;
                if( b > c ){
                    max = b;
                    min = c;
                }else{
                    max = c;
                    min = b;
                }
            }
        }else{
            if( b > c ){
                max = b;
                if( a > c ){
                    med = a;
                    min = c;
                }else{
                    med = c;
                    min = a;
                }
            }else{
                med = b;
                max = c;
                min = a;
            }
        }
        System.out.println("The sorted numbers are: " + min +","+ med +","+ max);
    }
}
