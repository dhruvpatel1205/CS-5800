import java.lang.Math;

public class AccountHolder {
    protected int ID;
    protected String address;

    public AccountHolder(int ID, String address) {
        this.ID = ID;
        this.address = address;
    }

    // Return a random Number in [1,1000000]
    public int getNextID() {
        return (int) (Math.random() * 1000000) + 1;
    }
}
