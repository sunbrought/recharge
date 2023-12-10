package org.sunbrought.DesignModel.chouxianggongchang;

// MasterCard 信用卡支付工厂
public class MasterCardPaymentFactory extends PaymentFactory {
    @Override
    public CreditCardPayment createCreditCardPayment() {
        return new MasterCardCreditCardPayment();
    }

    @Override
    public OnlineBankingPayment createOnlineBankingPayment() {
        return new WeChatOnlineBankingPayment();
    }
}
