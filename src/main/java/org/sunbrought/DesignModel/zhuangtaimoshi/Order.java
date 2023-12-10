package org.sunbrought.DesignModel.zhuangtaimoshi;

public class Order {
    private OrderState state;

    public Order() {
        state = new NewOrder();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.processOrder(this);
    }
}