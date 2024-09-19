package gr.aueb.cf.ch18.service.exception;

import gr.aueb.cf.ch18.model.Account;

public class InsufficientBalanceException extends Exception {
    private final static long serialVersionUID = 1L;

    public InsufficientBalanceException(Account account) {
        super("Not enough balance in the account");
    }
}
