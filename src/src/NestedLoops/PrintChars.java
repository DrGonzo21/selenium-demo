package NestedLoops;

public class PrintChars {
    public static void main(String[] args) {
        printRectangle(5, 10,'a');
    }

    public static void printRectangle(int x, int y, char ch) {


        for (int i = 0; i < y; i++) {


            for (int j = 0; j < x; j++) {

                System.out.print(ch);

            }

            System.out.println();

        }
    }
}
