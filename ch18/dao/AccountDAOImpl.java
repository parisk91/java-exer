package gr.aueb.cf.ch18.dao;

import gr.aueb.cf.ch18.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO{
    private static final List<Account> accounts = new ArrayList<>();

    @Override
    public Account deposit(Account account) {
        return accounts.set(accounts.indexOf(account), account);
    }

    @Override
    public Account withdraw(Account account) {

        return accounts.set(accounts.indexOf(account), account);
    }

    @Override
    public Account getAccountBalance(Long id) {
        Optional<Account> account = accounts.stream()
                .filter(acc -> acc.getId().equals(id))
                .findFirst();

        return account.orElse(null);
    }

    public boolean ssnValid(String ssn) {
        return accounts.stream()
                .anyMatch(acc -> acc.getSsn().equals(ssn));
    }
}
