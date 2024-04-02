/* 5.Write a Java programming to create a banking system with three classes - Bank, Account,
 *SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for 
 *adding them. Accounts should be an interface with methods to deposit, withdraw, calculate
 *interest, and view balances. SavingsAccount and CurrentAccount should implement the Account
 *interface and have their own unique methods.
 */
package com.javacore.demo;

import java.util.ArrayList;
import java.util.List;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double getBalance();
}

class SavingsAccount3 implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount3(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // Unique method for SavingsAccount
    public void compoundInterest() {
        balance += calculateInterest();
    }
}

class CurrentAccount3 implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount3(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Exceeded overdraft limit!");
        }
    }

    @Override
    public double calculateInterest() {
        // CurrentAccount doesn't earn interest
        return 0;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // Unique method for CurrentAccount
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

public class Lab5_Q5 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount3 savingsAccount = new SavingsAccount3(1000, 0.05);
        CurrentAccount3 currentAccount = new CurrentAccount3(2000, 500);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Example usage
        savingsAccount.deposit(500);
        savingsAccount.compoundInterest();
        System.out.println("Savings Account Balance: Rs." + savingsAccount.getBalance());

        currentAccount.withdraw(3000);
        System.out.println("Current Account Balance: Rs." + currentAccount.getBalance());
    }
}
