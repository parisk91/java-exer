package gr.aueb.cf.ch18.service.exception;

import gr.aueb.cf.ch18.model.Account;

public class AccountNotFoundException extends Exception{

    private final static long serialVersionUID = 1L;

    public AccountNotFoundException(Long id) {
        super("Id does not exist");
    }
}
