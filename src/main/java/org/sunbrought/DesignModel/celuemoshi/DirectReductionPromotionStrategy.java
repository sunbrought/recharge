package org.sunbrought.DesignModel.celuemoshi;

//直降策略
public class DirectReductionPromotionStrategy implements PromotionStrategy {
    private double reduction;

    public DirectReductionPromotionStrategy(double reduction) {
        this.reduction = reduction;
    }

    @Override
    public double calculatePrice(double price) {
        return price - reduction;
    }
}
