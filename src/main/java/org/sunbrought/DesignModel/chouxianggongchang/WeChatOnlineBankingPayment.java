package org.sunbrought.DesignModel.chouxianggongchang;

// 微信网银支付
public class WeChatOnlineBankingPayment implements OnlineBankingPayment{
    @Override
    public void pay(double amount) {
        System.out.println("WeChat online banking payment: ¥" + amount);
    }
}
