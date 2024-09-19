package gr.aueb.cf.ch12.bankapp;

import gr.aueb.cf.ch12.bankapp.model.JointAccount;
import gr.aueb.cf.ch12.bankapp.model.OverdraftAccount;

public class Main {
    public static void main(String[] args) {

        OverdraftAccount paris = new OverdraftAccount(1, "GR123", "Paris", "K.", "W234", 10000);

        JointAccount parJohn = new JointAccount();
        parJohn.setId(1);
        parJohn.setIban("GR455");
        parJohn.setFirstname1("Paris");
        parJohn.setLastname1("K.");
        parJohn.setFirstname2("John");
        parJohn.setLastname2("M.");
        parJohn.setSsn("P012");
        parJohn.setBalance(20000);

        try{
            paris.withdraw(15000, "W234");
            System.out.println("Successful withdraw, new balance: " + paris.getBalance());

            parJohn.deposit(200.0);
            System.out.println("Successful deposit. Account details: " + parJohn.toString());

            parJohn.deposit(300.0);
            System.out.println("Successful deposit. Account details: " + parJohn.toString());

            parJohn.withdraw(2000, "P012");
            System.out.println("Successful withdraw, new balance: " + parJohn.getBalance());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
