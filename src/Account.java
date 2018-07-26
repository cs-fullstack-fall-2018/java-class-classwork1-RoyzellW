public class Account {
    private String accountName;
    private double accountBalance;

    public Account(String accountName, double accountBalance) {
        this.accountName= accountName;
        this.accountBalance = accountBalance;
    }

    public void withdrawal(int amount){
        this.accountBalance -= amount;
    }

    public void deposit(int amount){
        this.accountBalance += amount;
    }

    public double balance(){
        return this.accountBalance;
    }

    @Override
    public String toString() {
        String toPrint = "Account Name: " + this.accountName + ", account balance: " + this.accountBalance;
        return toPrint;
    }
}
