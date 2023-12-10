package org.sunbrought.DesignModel.daili.jingtaidaili;

public class AccountProxy  implements Account{
    private BankAccount bankAccount;

    public AccountProxy(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(double amount) {
        bankAccount.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        bankAccount.withdraw(amount);
    }
}
