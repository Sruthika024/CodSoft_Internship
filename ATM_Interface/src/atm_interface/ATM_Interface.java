/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_interface;

/**
 *
 * @author pc
 */
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("Welcome to ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void processTransactions() {
        Scanner sc = new Scanner(System.in);
        int choice;
        double amount;

        while (true) {
            displayMenu();
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is: Rs. " + account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the deposit amount:");
                    amount = sc.nextDouble();
                    if (amount > 0) {
                        account.deposit(amount);
                        System.out.println("Deposit Successful.");
                    } else {
                        System.out.println("Invalid deposit amount");
                    }
                    break;
                case 3:
                    System.out.println("Enter the withdrawal amount: Rs.");
                    amount = sc.nextDouble();
                    if (amount > 0 && account.withdraw(amount)) {
                        System.out.println("Withdrawal Successful.");
                    } else {
                        System.out.println("Insufficient balance to withdraw");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }
}

public class ATM_Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount userAccount = new BankAccount(10000);
        ATM atm = new ATM(userAccount);
        atm.processTransactions();
    }
    
}
