package org.sunbrought.DesignModel.zhuangtaimoshi;

public class CompletedOrder implements OrderState {
    @Override
    public void processOrder(Order order) {
        // 处理完成状态下的订单
        System.out.println("Processing completed order.");
    }

}
