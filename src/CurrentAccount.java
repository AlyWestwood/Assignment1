public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(){
        this.overdraftLimit = 50;
    }

    public double getOverdraftLimit(){
        return this.overdraftLimit;
    }

    public void setOverdraftLimit(double setLimit){
        this.overdraftLimit = setLimit;
        confirmation();
    }

    public String toString(){
        return super.toString() + "\n\tOverdraft Limit: $" + this.overdraftLimit + "\n\t(Maximum available balance: $" +
                (this.overdraftLimit + getBalance()) + ")\nCreated: " + getCreationDate();
    }

    public void withdrawMoney(double amount){
        setMinimumBalance(-this.overdraftLimit);
        super.withdrawMoney(amount);
    }

    private void confirmation(){
        System.out.println("Change confirmed:\nOverdraft limit: $" + this.overdraftLimit);
    }
}
