package ArrayLists;

public class OnlineStudent extends Student{
    private boolean hasEXtraMonitor;

    public OnlineStudent(String name, long id, boolean hasEXtraMonitor) {
        super(name, id);
        this.hasEXtraMonitor = hasEXtraMonitor;
    }

    public boolean isHasEXtraMonitor() {
        return hasEXtraMonitor;
    }

    public void setHasEXtraMonitor(boolean hasEXtraMonitor) {
        this.hasEXtraMonitor = hasEXtraMonitor;
    }

    @Override
    public String toString() {
        return "OnlineStudent{" +
                "hasEXtraMonitor=" + hasEXtraMonitor +
                '}';
    }
}


