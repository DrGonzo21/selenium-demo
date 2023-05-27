package Instancevariable;

public class LAB101b {
    private int sum = 0;
    private int count = 0;

    public int getSum() {
        return sum;
    }

    public void add(int num) {
        sum += num;
        count++;
    }

    public int getCount() {
        return count;
    }

    public double getAverage() {
        if (count == 0) {
            return 0;
        } else {
            return (double) sum / (double) count;
        }
    }
}
