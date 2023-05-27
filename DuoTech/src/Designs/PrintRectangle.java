package Designs;

public class PrintRectangle {
    public static void main(String[] args) {
        printRectangle(5,10, '*');
        printRectangle(10,3, '$');
    }
    public static void printRectangle(int x, int y, char ch){

    for(int i = 0; i < y; i++){
        for (int j = 0; j < x; j++){
            System.out.print(ch);
        }
        System.out.println();
    }

    }
}
