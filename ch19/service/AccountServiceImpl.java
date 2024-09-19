package gr.aueb.cf.ch19.service;

import gr.aueb.cf.ch19.dao.IAccountDAO;
import gr.aueb.cf.ch19.dto.AccountDepositDTO;
import gr.aueb.cf.ch19.dto.AccountWithdrawDTO;
import gr.aueb.cf.ch19.model.Account;
import gr.aueb.cf.ch19.service.exception.AccountNotFoundException;
import gr.aueb.cf.ch19.service.exception.InsufficientBalanceException;
import gr.aueb.cf.ch19.service.exception.InvalidSsnException;

public abstract class AccountServiceImpl implements IAccountService {

    private final IAccountDAO dao;

    public AccountServiceImpl (IAccountDAO dao) throws InvalidSsnException {
        this.dao = dao;
    }

    @Override
    public Account depositAccount(AccountDepositDTO accountDTO) throws InvalidSsnException {

       Account account;
        try {
            account = new Account();
            account.setBalance(account.getBalance()+accountDTO.getAmount());

            if (!dao.ssnValid(accountDTO.getSsn())) {
                throw new InvalidSsnException(account);
            };
            return dao.deposit(account);
        } catch (InvalidSsnException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Account withdrawAccount(AccountWithdrawDTO accountWithdrawDTO) throws InsufficientBalanceException, InvalidSsnException {
        Account account;
        try {
            account = new Account();


//            if (!dao.ssnValid(accountWithdrawDTO.getSsn())) {
//                throw new InvalidSsnException(account);
//            }

            if (account.getBalance()<accountWithdrawDTO.getAmount()) {
                throw new InsufficientBalanceException(account);
            }

            account.setBalance(account.getBalance()-accountWithdrawDTO.getAmount());
            return dao.deposit(account);

        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Account getAccountBalance(Long id) throws AccountNotFoundException {
        Account account;

        try {
            account = dao.getAccountBalance(id);
            if (account == null) {
                throw new AccountNotFoundException(id);
            }
            return account;
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
