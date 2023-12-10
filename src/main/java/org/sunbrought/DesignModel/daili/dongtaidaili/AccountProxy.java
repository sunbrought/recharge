package org.sunbrought.DesignModel.daili.dongtaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AccountProxy implements InvocationHandler {
    private BankAccount bankAccount;

    public AccountProxy(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("deposit")) {
            System.out.println("Before deposit");
            method.invoke(bankAccount, args);
            System.out.println("After deposit");
        } else if (method.getName().equals("withdraw")) {
            System.out.println("Before withdraw");
            method.invoke(bankAccount, args);
            System.out.println("After withdraw");
        }
        return null;
    }
}
