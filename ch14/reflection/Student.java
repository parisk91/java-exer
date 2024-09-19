package gr.aueb.cf.ch14.reflection;

public class Student {
    private int id;
    private String firstname;
    private String lasntname;

    public Student() {
    }

    public Student(int id, String firstname, String lasntname) {
        this.id = id;
        this.firstname = firstname;
        this.lasntname = lasntname;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasntname() {
        return lasntname;
    }
    public void setLasntname(String lasntname) {
        this.lasntname = lasntname;
    }
}
