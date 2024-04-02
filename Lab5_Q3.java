/* 3.Write a Java program to create an abstract class BankAccount with abstract methods 
 *deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend
 *the BankAccount class and implement the respective methods to handle deposits and withdrawals
 *for each account type.
 */

package com.javacore.demo;

abstract class BankAccount2 {
    protected double balance;

    public BankAccount2(double initialBalance) {
        this.balance = initialBalance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount2 extends BankAccount2 {
    private double interestRate;

    public SavingsAccount2(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

class CurrentAccount extends BankAccount2 {
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Exceeded overdraft limit!");
        }
    }
}

public class Lab5_Q3 {
    public static void main(String[] args) {
        SavingsAccount2 savingsAccount2 = new SavingsAccount2(1000, 0.05);
        savingsAccount2.deposit(800);
        savingsAccount2.withdraw(200);
        System.out.println("Savings Account Balance: Rs." + savingsAccount2.getBalance());

        CurrentAccount currentAccount = new CurrentAccount(2000, 500);
        currentAccount.deposit(6000);
        currentAccount.withdraw(4000);
        System.out.println("Current Account Balance: Rs." + currentAccount.getBalance());
    }
}
