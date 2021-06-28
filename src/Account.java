import java.util.Date;

public class Account {
    private static int lastAccount;
    private double balance;
    private final int accountNumber;
    private final Date creationDate;
    private double minimumBalance;

    public Account(){
        this(0);
    }

    public Account(double startingBalance){
        lastAccount++;
        this.accountNumber = lastAccount;
        this.balance = startingBalance;
        this.creationDate = new Date();
    }

    public void depositMoney(double amount){
        this.balance = this.balance + amount;
        confirmation(true);
    }

    public void withdrawMoney(double amount){
        if(this.balance - amount >= minimumBalance){
            this.balance = this.balance - amount;
            confirmation(true);
        } else {
            confirmation(false);
        }
    }

    public double getBalance(){
        return balance;
    }

    public int getNumber(){
        return accountNumber;
    }

    public String toString(){
        String account = "\nAccount number: " + this.accountNumber + "\n\tBalance: $" + this.balance;
        return account;
    }
    public Date getCreationDate(){
        return creationDate;
    }

    public void setMinimumBalance(double minBalance){
        this.minimumBalance = minBalance;
    }

    private void confirmation(boolean confirmed){
        if(confirmed){
            System.out.println("Transaction confirmed:\nBalance: $" + this.balance);
        }
        else {
            System.out.println("There was an error.");
        }
    }
// test method removed
}
