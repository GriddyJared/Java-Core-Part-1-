package org.example.Task4;

public class AccountServiceImpl implements AccountService{

    Account[] accounts;
    public AccountServiceImpl(Account[] account){
        this.accounts = account;
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        for (Account account: this.accounts){
            if (account.getId() == id){
                System.out.println("Works");
                return account;
            }
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        int count=0;
        for(Account account: this.accounts){
            if(account.getBalance()> value){
                count++;
            }
        }
        return count;
    }
}
