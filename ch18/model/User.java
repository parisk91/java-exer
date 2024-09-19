package gr.aueb.cf.ch18.model;

import java.util.Objects;

public class User extends AbstractEntity {
    private String firstname;
    private String lastname;
    private String ssn;

    public User() {}

    public User(String firstname, String lastname, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getFirstname(), user.getFirstname()) && Objects.equals(getLastname(), user.getLastname()) && Objects.equals(getSsn(), user.getSsn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname(), getSsn());
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}

