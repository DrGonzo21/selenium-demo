package ArrayLists;

public class CampusStudent extends Student{
    private int campusid;

    public int getCampusid() {
        return campusid;
    }

    public void setCampusid(int campusid) {
        this.campusid = campusid;
    }

    public CampusStudent(String name, long id, int campusid) {
        super(name, id);
        this.campusid = campusid;
    }

    @Override
    public String toString() {
        return "CampusStudent{" +
                "campusid=" + campusid +
                '}';
    }
}

