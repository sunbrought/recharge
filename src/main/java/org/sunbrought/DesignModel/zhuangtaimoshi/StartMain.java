package org.sunbrought.DesignModel.zhuangtaimoshi;


public class StartMain {
    public static void main(String[] args) {
        Order order = new Order();
        order.processOrder();    // Output: Processing new order.
        order.processOrder();    // Output: Processing order in progress.
        order.processOrder();    // Output: Processing completed order.
    }
}
