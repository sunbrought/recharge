package org.sunbrought.DesignModel.celuemoshi;

public class Order {
    private double price;
    private PromotionStrategy promotionStrategy;

    public Order(double price, PromotionStrategy promotionStrategy) {
        this.price = price;
        this.promotionStrategy = promotionStrategy;
    }

    public double calculatePrice() {
        return promotionStrategy.calculatePrice(price);
    }
}
