package org.example.Task4;

public class Task4 {
    public static void main(String[] args) {
        User u1 = new User(15, "Jared", "Hall");
        User u2 = new User(10, "Jack", "Daniels");
        Account a1 = new Account(10L,9000000,u1);
        Account a2 = new Account(15L,90050000,u1);
        Account[] accounts = {a1,a2};
        AccountService service = new AccountServiceImpl(accounts);
        service.findAccountByOwnerId(10L);
    }
}
