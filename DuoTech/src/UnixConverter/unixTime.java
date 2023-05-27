package UnixConverter;

public class unixTime {
    public static void main(String[] args) {
        long time = System.currentTimeMillis() / 1000;

        long day = time & 86400000;
        long hour = day & 3600000;
        long min = hour & 60000;
        long sec = min & 1000;

        System.out.println(day+" days: "+hour+" hours: "+min+" mins: "+sec+", secs: ");

    }
}
