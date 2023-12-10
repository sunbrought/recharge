package org.sunbrought.DesignModel.daili.jingtaidaili;

public class StartMain {
    public static void main(String[] args) {
        //创建一个银行账户实例
        BankAccount bankAccount = new BankAccount(1000.0);
        //创建一个账户代理实例
        AccountProxy accountProxy = new AccountProxy(bankAccount);
        accountProxy.deposit(500);
        accountProxy.withdraw(600);
    }
}
