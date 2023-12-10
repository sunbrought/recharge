package org.sunbrought.DesignModel.daili.dongtaidaili;

public class BankAccount implements Account {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    //存款
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", balance is now " + balance);
    }

    //取款
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", balance is now " + balance);
        } else {
            System.out.println("Sorry, insufficient balance");
        }
    }
}
