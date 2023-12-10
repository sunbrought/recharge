package org.sunbrought.DesignModel.chouxianggongchang;

// 抽象支付工厂
public abstract class PaymentFactory {
    public abstract CreditCardPayment createCreditCardPayment();
    public abstract OnlineBankingPayment createOnlineBankingPayment();
}

