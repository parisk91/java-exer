package gr.aueb.cf.ch19.service.exception;

public class AccountNotFoundException extends Exception{

    private final static long serialVersionUID = 1L;

    public AccountNotFoundException(Long id) {
        super("Id does not exist");
    }
}
