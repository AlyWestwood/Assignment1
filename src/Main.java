public class Main {

    public static void main(String[] args){

        Account one = new Account();
        DoubleAccount two = new DoubleAccount();
        SavingsAccount three = new SavingsAccount();
        CurrentAccount four = new CurrentAccount();

        /*System.out.println("-" + one.getNumber() + two.getNumber() + three.getNumber() + four.getNumber() + "-");
        System.out.println(one.toString() + "\n" + two.toString() +"\n" + three.toString() + "\n" + four.toString());
*/
        //Account
        System.out.println("\nAccount Test:\n-------------------");
        one.depositMoney(100);
        try{
            one.withdrawMoney(55);
            one.withdrawMoney(50);
        } catch(AccountWithException e){
            System.out.println("Funds insufficient");}
        System.out.println(one.toString());

        /*Double Account
        System.out.println("\nDouble Account Test:\n-------------------");
        two.depositMoney(100);
        two.withdrawMoney(55);
        two.withdrawMoney(50);
        two.depositToDouble(50);
        two.withdrawFromDouble(35);
        two.withdrawFromDouble(20);
        System.out.println(two.toString());

        //Savings Account
        System.out.println("\nSavings Account Test:\n-------------------");
        three.depositMoney(100);
        three.withdrawMoney(55);
        three.withdrawMoney(50);
        three.addInterestToAccount();
        three.setInterestRate(0.1);
        three.addInterestToAccount();
        System.out.println(three.getInterestRate());
        System.out.println(three.toString());

        //Current Account
        System.out.println("\nCurrent Account Test:\n-------------------");
        four.depositMoney(100);
        four.withdrawMoney(55);
        four.withdrawMoney(50);
        four.depositMoney(40);
        System.out.println("Overdraft limit: $" + four.getOverdraftLimit());
        four.setOverdraftLimit(5.0);
        four.withdrawMoney(45);
        System.out.println(four.toString());*/
    }
}