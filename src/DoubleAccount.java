public class DoubleAccount extends Account{

    private double doubleBalance;

    public DoubleAccount(){
        this.doubleBalance = 0.0;
    }

    public void withdrawFromDouble(double amount){
        if (this.doubleBalance>=amount) {
            this.doubleBalance = this.doubleBalance - amount;
            confirmation(true);
        } else confirmation(false);

    }

    public void depositToDouble(double amount){
        this.doubleBalance = this.doubleBalance + amount;
        confirmation(true);
    }

    public double getTotalBalance(){
        return this.doubleBalance + getBalance();
    }

    public String toString(){
        return super.toString() + "\n\tDouble balance: $" + this.doubleBalance +
                "\n\tTotal balance: $" + getTotalBalance() + "\nCreated: " + getCreationDate();
    }

    private void confirmation(boolean confirmed){
        if (confirmed){
            System.out.println("Transaction confirmed:\nDouble balance: " + this.doubleBalance);
        }
        else {
            System.out.println("There was an error");
        }
    }
}
