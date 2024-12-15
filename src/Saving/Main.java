package Saving;

public class Main {
    public static void main(String[] args){
        Saving mySaving = new Saving(1000.00);

        // Show balance
        mySaving.showBalance();

        // Deposit
        mySaving.deposit(500.00);

        // Withdraw
        mySaving.withdraw(300.00);

        // Applying fees
        mySaving.fees(1000.00);

        // Applying discount
        mySaving.discount();

        // Show final balance
        mySaving.showBalance();
    }
}
