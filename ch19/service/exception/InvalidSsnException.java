package gr.aueb.cf.ch19.service.exception;

import gr.aueb.cf.ch19.model.Account;

public class InvalidSsnException extends Exception{
    private final static long serialVersionUID = 1L;

    public InvalidSsnException(Account account) {
        super("Wrong ssn");
    }
}

