package org.sunbrought.DesignModel.chouxianggongchang;

public class PayClient {
    public static void main(String[] args) {
        // 选择 Visa 信用卡支付工厂
        PaymentFactory paymentFactory = new VisaPaymentFactory();

        // 创建 Visa 信用卡支付对象
        CreditCardPayment creditCardPayment = paymentFactory.createCreditCardPayment();
        creditCardPayment.pay(100);

        // 创建支付宝网银支付对象
        OnlineBankingPayment onlineBankingPayment = paymentFactory.createOnlineBankingPayment();
        onlineBankingPayment.pay(200);

        // 选择 MasterCard 信用卡支付工厂
        PaymentFactory paymentFactory2 = new MasterCardPaymentFactory();

        // 创建  MasterCard 信用卡支付对象
        CreditCardPayment creditCardPayment2 = paymentFactory2.createCreditCardPayment();
        creditCardPayment2.pay(100);

        // 创建微信网银支付对象
        OnlineBankingPayment onlineBankingPayment2 = paymentFactory2.createOnlineBankingPayment();
        onlineBankingPayment2.pay(200);
    }
}
