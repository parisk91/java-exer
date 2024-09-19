package gr.aueb.cf.ch18.service.exception;

import gr.aueb.cf.ch18.model.Account;

public class InvalidSsnException extends Exception{
    private final static long serialVersionUID = 1L;

    public InvalidSsnException(Account account) {
        super("Wrong ssn");
    }
}

