package org.sunbrought.DesignModel.celuemoshi;

public class StartMain {
    public static void main(String[] args) {
        Order order = new Order(100, new DiscountPromotionStrategy(0.1));
        double price = order.calculatePrice(); // 90
        System.out.println("打折价格:" + price);

        order = new Order(200, new FullReductionPromotionStrategy(150, 50));
        price = order.calculatePrice(); // 150
        System.out.println("满减价格:" + price);

        order = new Order(300, new DirectReductionPromotionStrategy(50));
        price = order.calculatePrice(); // 250
        System.out.println("直降价格:" + price);
    }
}
