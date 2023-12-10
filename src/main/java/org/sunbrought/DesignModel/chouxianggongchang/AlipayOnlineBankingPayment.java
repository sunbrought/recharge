package org.sunbrought.DesignModel.chouxianggongchang;

// 支付宝网银支付
public class AlipayOnlineBankingPayment implements OnlineBankingPayment{
    @Override
    public void pay(double amount) {
        System.out.println("Alipay online banking payment: ¥" + amount);
    }
}
