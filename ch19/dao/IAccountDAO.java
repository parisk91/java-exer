package gr.aueb.cf.ch19.dao;

import gr.aueb.cf.ch19.model.Account;

public interface IAccountDAO {

    /**
     * Deposits an amount in the account (Array list)
     * @param account the account details
     * @return the new balance
     */
    Account deposit(Account account);

    /**
     * Withdraws an amount from an account
     * @param account the account with the account details
     * @return the instance before the withdrawal
     */
    Account withdraw(Account account);

    /**
     * Returns the balance by its id
     * @param id the given id
     */
    Account getAccountBalance(Long id);

    public boolean ssnValid(String ssn);


}
