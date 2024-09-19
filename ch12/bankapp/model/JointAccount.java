package gr.aueb.cf.ch12.bankapp.model;

public class JointAccount {
    private int id;
    private String iban;
    private String firstname1;
    private String firstname2;
    private String lastname1;
    private String lastname2;
    private String ssn;
    private double balance;

    /**
     * Default Constructor for the class JointAccount
     */
    public JointAccount() {
    }

    public JointAccount(int id, String iban, String firstname1, String firstname2, String lastname1, String lastname2, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname1 = firstname1;
        this.firstname2 = firstname2;
        this.lastname1 = lastname1;
        this.lastname2 = lastname2;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname1() {
        return firstname1;
    }
    public void setFirstname1(String firstname1) {
        this.firstname1 = firstname1;
    }

    public String getFirstname2() {
        return firstname2;
    }
    public void setFirstname2(String firstname2) {
        this.firstname2 = firstname2;
    }

    public String getLastname1() {
        return lastname1;
    }
    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getLastname2() {
        return lastname2;
    }
    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "JointAccount{" +
                "id=" + id +
                ", iban='" + iban + '\'' +
                ", firstname1='" + firstname1 + '\'' +
                ", firstname2='" + firstname2 + '\'' +
                ", lastname1='" + lastname1 + '\'' +
                ", lastname2='" + lastname2 + '\'' +
                ", ssn='" + ssn + '\'' +
                ", balance=" + balance +
                '}';
    }

    //Public API

    /**
     * Deposits an amount of money
     *
     * @param amount    the money to be deposited
     * @throws Exception    if the amount is negative
     */
    public void deposit (double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Negative Amount");
            }
            balance += amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    /**
     * Withdraws an amount of moneys
     *
     * @param amount    the amount to be withdrawm
     * @param ssn       the ssn to be checked
     * @throws Exception    Incorrect ssn or amount greater than balance Exception
     */
    public void withdraw(double amount, String ssn) throws Exception{
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("Invalid ssn");
            }
            if (amount > balance) {
                throw new Exception("Insufficient balance");
            }
        }  catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        balance -= amount;
    }

    /**
     *
     * @param ssn   The ssn to be checked
     * @return      TRUE if the ss is correct
     */
    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }

}
