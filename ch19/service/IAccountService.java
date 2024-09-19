package gr.aueb.cf.ch19.service;

import gr.aueb.cf.ch19.dto.AccountDepositDTO;
import gr.aueb.cf.ch19.dto.AccountWithdrawDTO;
import gr.aueb.cf.ch19.model.Account;
import gr.aueb.cf.ch19.service.exception.AccountNotFoundException;
import gr.aueb.cf.ch19.service.exception.InsufficientBalanceException;
import gr.aueb.cf.ch19.service.exception.InvalidSsnException;

public interface IAccountService {

    Account depositAccount (AccountDepositDTO accountDTO)
        throws InvalidSsnException;

    Account withdrawAccount (AccountWithdrawDTO accountWithdrawDTO)
        throws InsufficientBalanceException, InvalidSsnException;

    Account getAccountBalance(Long id) throws AccountNotFoundException;
}
