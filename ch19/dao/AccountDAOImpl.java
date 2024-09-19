package gr.aueb.cf.ch19.dao;

import gr.aueb.cf.ch19.model.Account;

import java.util.*;

public abstract class AccountDAOImpl implements IAccountDAO {
    //private static final List<Account> accounts = new ArrayList<>();
    Map<Long, Account> accounts = new HashMap<>() ;


    @Override
    public Account deposit(Account account) {
        return accounts.put(account.getId(), account);
    }

    @Override
    public Account withdraw(Account account) {

        return accounts.put(account.getId(), account);
                //accounts.set(accounts.indexOf(account), account);
    }

    @Override
    public Account getAccountBalance(Long id) {
        Account acc = null;
        if (accounts.containsKey(id)) {
            //acc.setId(id);
            acc = accounts.get(id);
        };

        return acc;
    }


}
