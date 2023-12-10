package org.sunbrought.DesignModel.chouxianggongchang;

// MasterCard 信用卡支付
public class MasterCardCreditCardPayment implements CreditCardPayment{
    @Override
    public void pay(double amount) {
        System.out.println("MasterCard credit card payment: $" + amount);
    }
}
