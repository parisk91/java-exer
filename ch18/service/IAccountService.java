package gr.aueb.cf.ch18.service;

import gr.aueb.cf.ch18.dto.AccountDepositDTO;
import gr.aueb.cf.ch18.dto.AccountWithdrawDTO;
import gr.aueb.cf.ch18.model.Account;
import gr.aueb.cf.ch18.service.exception.AccountNotFoundException;
import gr.aueb.cf.ch18.service.exception.InsufficientBalanceException;
import gr.aueb.cf.ch18.service.exception.InvalidSsnException;

public interface IAccountService {

    Account depositAccount (AccountDepositDTO accountDTO)
        throws InvalidSsnException;

    Account withdrawAccount (AccountWithdrawDTO accountWithdrawDTO)
        throws InsufficientBalanceException, InvalidSsnException;

    Account getAccountBalance(Long id) throws AccountNotFoundException;
}
