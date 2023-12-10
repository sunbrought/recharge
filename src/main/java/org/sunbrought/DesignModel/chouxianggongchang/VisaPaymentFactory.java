package org.sunbrought.DesignModel.chouxianggongchang;

// Visa 信用卡支付工厂
public class VisaPaymentFactory extends PaymentFactory {
    @Override
    public CreditCardPayment createCreditCardPayment() {
        return new VisaCreditCardPayment();
    }

    @Override
    public OnlineBankingPayment createOnlineBankingPayment() {
        return new AlipayOnlineBankingPayment();
    }
}
