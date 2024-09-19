package gr.aueb.cf.ch19.model;

import java.util.Objects;

public class Account extends AbstractEntity {
    private User user;
    private String iban;
    private double balance;
    private String ssn;

    public Account() {
    }

    public Account(User user, String iban, double balance) {
        this.user = user;
        this.iban = iban;
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
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
        Account account = (Account) o;
        return Double.compare(getBalance(), account.getBalance()) == 0 && Objects.equals(getUser(), account.getUser()) && Objects.equals(getIban(), account.getIban());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser(), getIban(), getBalance());
    }

}
