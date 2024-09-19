package gr.aueb.cf.ch12.bankapp.model;

public class OverdraftAccount {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    /**
     * Default Constructor for the class OverdraftAccount
     */
    public OverdraftAccount() {
    }

    /**
     * Overloaded Constructor for the class OverdraftAccount
     *
     * @param id
     * @param iban
     * @param firstname
     * @param lastname
     * @param ssn
     * @param balance
     */
    public OverdraftAccount(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    //Setters and getters
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
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Public API

    /**
     * Withdraws an amount of moneys
     *
     * @param amount    the amount to be withdrawm
     * @param ssn       the ssn to be checked
     * @throws Exception    Incorrect ssn Exception
     */
    public void withdraw(double amount, String ssn) throws Exception{
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("Invalid ssn");
            }
        }  catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        if (amount > balance) {
            System.out.println("You are withdrawing an amount greater than your balance");
        }
        balance -= amount;
    }

    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}

