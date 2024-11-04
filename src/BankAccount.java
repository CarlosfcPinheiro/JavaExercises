// Importing built-in classes
import java.util.Scanner;

public class BankAccount{
    private int number;
    private String name;
    private double value;

    // Class constructor
    BankAccount(int accountNumber, String accountHolder, double initialValue){
        this.number = accountNumber;
        this.name = accountHolder;
        this.value = initialValue;
    }

    void showData(){
        System.out.println("Account " + this.number + ", Holder: " + this.name + ", Balance: $" + this.value);
    }

    void deposit(double depositValue){
        this.value += depositValue;
    }

    void withdraw(double withdrawValue){
        this.value -= withdrawValue + 5;
    }

    // Getters and Setters
    String getName(){
        return this.name;
    }
    void setName(String newName){
        this.name = newName;
    }

    double getValue(){
        return this.value;
    }

    int getNumber(){
        return this.number;
    }

    public static void main(String[] args){
        int accountNumber;

        double value = 0;

        String accountName;
        String existInitValue;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        accountName = sc.nextLine();
        System.out.print("Is there an initial value (y/n): ");
        existInitValue = sc.nextLine().trim();

        if (existInitValue.equals("y")){
            System.out.print("Enter an initial value: ");
            value = sc.nextDouble();
        }

        // Instaciating bank account class
        BankAccount Account = new BankAccount(accountNumber, accountName, value);

        while (true){
            System.out.print("\nEnter a deposit Value: ");
            Account.deposit(sc.nextDouble());
            System.out.println("Update account data: ");
            Account.showData();

            System.out.print("\nEnter a withdraw value: ");
            Account.withdraw(sc.nextDouble());
            Account.showData();
        }

    }
}
