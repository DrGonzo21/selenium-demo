package Designs;

public class AmericanFlag {
    public static void main(String[] args) {

        // The stars - 5x10


        int i;
        int j;



        for(i =0; i<13 ; i++){

            for(j = 0; j<50; j++){

                System.out.print(i<5 && j<10 ? "*" : "=");

            }
            System.out.println();

        }
    }
}
