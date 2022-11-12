public class Account {
    private AccountHolder holder;
    private double balance = 0.0;

    public Account(double amt, AccountHolder holder) {

    }

    public void deposit(double amt) {

    }

    public void withdraw(double amt) {

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
