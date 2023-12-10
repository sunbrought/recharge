package org.sunbrought.DesignModel.celuemoshi;

//打折策略
public class DiscountPromotionStrategy implements PromotionStrategy{
    private double discount;

    public DiscountPromotionStrategy(double discount) {
        this.discount = discount;
    }

    @Override
    public double calculatePrice(double price) {
        return price * (1 - discount);
    }

}
