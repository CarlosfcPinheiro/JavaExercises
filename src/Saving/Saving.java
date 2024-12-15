package Saving;

public class Saving implements Calculations {
    private double balance;

    // Constructor
    public Saving(double initialBalance){
        this.balance = initialBalance;
    }
    // Deposit method
    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
            System.out.printf("\nR$ %.2f deposited to balance!\n", amount);
        } else {
            System.out.println("The amount may have to be greater than zero!");
        }
    }
    // Withdraw method
    public void withdraw(double amount){
        if (amount > 0){
            this.balance -= amount;
            System.out.printf("\nR$ %.2f withdraw to balance!\n", amount);
        } else {
            System.out.println("The amount may have to be greater than zero!");
        }
    }
    // Show balance method
    public void showBalance(){
        System.out.printf("\nBalance: %.2f\n", this.balance);
    }

    // Interface calculations method
    @Override
    public double fees(double value){
        // 5% fees
        double income = value * 0.05;
        balance -= income;
        System.out.println("\nFees of 5% to value R$" + value + ". Income: R$ " + income);
        return income;
    }
    // Interface calculations method
    @Override
    public double discount(){
        double discount = fees(balance)*0.10;
        balance -= discount;
        System.out.println("Discount of 10% to income: R$ " + discount);
        return discount;
    }
}