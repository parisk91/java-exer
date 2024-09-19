package gr.aueb.cf.ch18.dto;

public class AccountWithdrawDTO extends BaseDTO{
    private String firstname;
    private String lastname;
    private String ssn;
    private double amount;

    public AccountWithdrawDTO() {}

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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
