package org.sunbrought.DesignModel.zhuangtaimoshi;

public class ProcessingOrder implements OrderState {
    @Override
    public void processOrder(Order order) {
        // 处理处理中状态下的订单
        System.out.println("Processing order in progress.");
        order.setState(new CompletedOrder());
    }
}
