package eu.sig.training.ch04;

public class Accounts {
    @SuppressWarnings("unused")
    public static Account findAcctByNumber(String number) {
        return new CheckingAccount();
    }

}