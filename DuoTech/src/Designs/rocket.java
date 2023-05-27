package Designs;

public class rocket {
    public static void main(String[] args) {
        final int copies = 2;
        printCap(copies);
        printBox(copies);
        printUS(copies);
        printBox(copies);
        printCap(copies);
    }
    public static void printCap(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("   /\\   ");
            System.out.print("");
        }
        System.out.println();
        for (int i = 0; i < times; i++) {
            System.out.print("  /  \\  ");
            System.out.print("");
        }
        System.out.println();
    }
    private static void printBox(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("+------+");
            System.out.print("");
        }
        System.out.println();
        for (int i = 0; i < times; i++) {
            System.out.print("|      |");
            System.out.print("");
        }
        System.out.println();
        for (int i = 0; i < times; i++) {
            System.out.print("|      |");
            System.out.print("");
        }
        System.out.println();
        for (int i = 0; i < times; i++) {
            System.out.print("+------+");
            System.out.print("");
        }
        System.out.println();

    }
    private static void printUS(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("|United|");
            System.out.print("");
        }
        System.out.println();
        for (int i = 0; i < times; i++) {
            System.out.print("|States|");
            System.out.print("");
        }
        System.out.println();

    }
}


