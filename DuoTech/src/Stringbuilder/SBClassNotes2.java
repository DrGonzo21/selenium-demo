package Stringbuilder;

public class SBClassNotes2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java");
        sb.append("script");
        System.out.println(sb);

        // StringBuffer is a thread-safe version of a StringBuilder
        // where the methods are synchronized

    }
}
