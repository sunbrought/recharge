package org.sunbrought.DesignModel.chouxianggongchang;

// Visa 信用卡支付
public class VisaCreditCardPayment implements CreditCardPayment{
    @Override
    public void pay(double amount) {
        System.out.println("Visa credit card payment: $" + amount);
    }
}
