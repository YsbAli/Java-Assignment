//Write a Java program to show multilevel inheritance for a banking database.

import java.util.Scanner;

// Parent class - Bank
class Bank {
    protected String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void displayBankInfo() {
        System.out.println("Bank Name: " + bankName);
    }
}

// Intermediate class - Account
class Account extends Bank {
    protected String accountNumber;
    protected double balance;

    public Account(String bankName, String accountNumber, double balance) {
        super(bankName);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        displayBankInfo();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance + " Rs");
    }
}

// Child class - SavingsAccount
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String bankName, String accountNumber, double balance, double interestRate) {
        super(bankName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsAccountInfo() {
        displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + " %");
    }
}

// Main class to test the banking database

public class BankingDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter bank name: ");
        String bankName = scanner.nextLine();

        System.out.print("Enter savings account number: ");
        String savingsAccountNumber = scanner.nextLine();

        System.out.print("Enter savings account balance: ");
        double savingsAccountBalance = scanner.nextDouble();

        System.out.print("Enter savings account interest rate: ");
        double savingsAccountInterestRate = scanner.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(bankName, savingsAccountNumber, savingsAccountBalance, savingsAccountInterestRate);
        savingsAccount.displaySavingsAccountInfo();
        scanner.close();
    }
}
