package org.sunbrought.DesignModel.daili.dongtaidaili;

import java.lang.reflect.Proxy;

public class StartMain {
    public static void main(String[] args) {
        //创建一个银行账户实例
        BankAccount bankAccount = new BankAccount(1000.0);
        //创建一个账户代理实例
        AccountProxy accountProxy = new AccountProxy(bankAccount);
        Account proxy = (Account) Proxy.newProxyInstance(Account.class.getClassLoader(), new Class<?>[]{Account.class}, accountProxy);
        proxy.deposit(500);
        proxy.withdraw(400);
    }
}
