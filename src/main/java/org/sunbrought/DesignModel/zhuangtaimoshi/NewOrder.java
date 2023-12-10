package org.sunbrought.DesignModel.zhuangtaimoshi;


public class NewOrder implements OrderState{
    @Override
    public void processOrder(Order order) {
        // 处理新建状态下的订单
        System.out.println("Processing new order.");
        order.setState(new ProcessingOrder());
    }
}
