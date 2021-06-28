public class SavingsAccount extends Account{

    /*Interest: add a field for the interest with a getter and a setter. The interest can have a
        value between 0 and 1. 0.05 corresponds to 5%.*/
    private double interestRate;

    public SavingsAccount(){
        this.interestRate = 0.05;
    }

    public double getInterestRate(){
        return this.interestRate;
    }

    public void setInterestRate(double newRate){
        if (newRate <= 1 && newRate >= 0){
            this.interestRate = newRate;
            confirmation(true);
        } else {
            confirmation(false);
        }
    }

    public String toString(){
        return super.toString() + "\n\tInterest rate: " + (this.interestRate * 100) + "%\nCreated: " + getCreationDate();
    }

    public void addInterestToAccount(){
        depositMoney(getBalance() * this.interestRate);
    }

    private void confirmation(boolean confirmed){
        if (confirmed){
            System.out.println("Change confirmed:\nRate: " + (this.interestRate * 100) + "%");
        }
        else {
            System.out.println("There was an error.");
        }
    }
}
