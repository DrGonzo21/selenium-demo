package LABS;

public class LAB114 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Talk is cheap. ");
        // Modify sb to display " Talk is cheap. Show me the code. "
        sb.append("Show me the code");
        System.out.println(sb);
        //Modify sb to display " Empty talk is cheap. Show me the code. "
        sb.replace(0,0,"Empty ");
        System.out.println(sb);
        //Modify sb to display " Empty talk is useless. Show me the code. "
        sb.replace(13,20," useless.");
        System.out.println(sb);
        //Modify sb to display " Empty talk is useless and no good. Show me the code. "
        sb.insert(21," and no good. ");
        System.out.println(sb);
        //Modify sb to display " Empty talk is no good. Show the code."
        sb.replace(13,sb.length()," no good. Show the code");
        System.out.println(sb);
        //Modify sb to display " Talk less. Code more. "
        sb.replace(0, sb.length(), "Talk less. Code more.");
        System.out.println(sb);
        //Modify sb to display ".erom edoC .ssel klaT"
        sb.reverse();
        System.out.println(sb);

    }
}
