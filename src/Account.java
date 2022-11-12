public class Account {
    private AccountHolder holder;
    private double balance = 0.0;

    public Account(double amt, AccountHolder holder) {
        this.balance = amt;
        this.holder = holder;
    }

    // Deposit will add the balance
    public void deposit(double amt) {
        this.balance += amt;
    }

    // withdraw will subtract the balance
    public void withdraw(double amt) {
        this.balance -= amt;
    }

    public AccountHolder getHolder() {
        return this.holder;
    }

    public void setHolder(AccountHolder holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double amt) {
        this.balance = amt;
    }
}
