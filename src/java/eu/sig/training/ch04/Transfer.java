package eu.sig.training.ch04;

public class Transfer {
    Account counterAccount;

    @SuppressWarnings("unused")
    public Transfer(Account acct1, Account acct2, Money m) {}

    @SuppressWarnings("unused")
    public Transfer(SavingsAccount acct1, Account acct2, Money m) {}

    public Account getCounterAccount() {
        return this.counterAccount;
    }
}
