package org.sunbrought.DesignModel.celuemoshi;

//满减策略
public class FullReductionPromotionStrategy implements PromotionStrategy{
    private double threshold;
    private double reduction;

    public FullReductionPromotionStrategy(double threshold, double reduction) {
        this.threshold = threshold;
        this.reduction = reduction;
    }

    @Override
    public double calculatePrice(double price) {
        return price >= threshold ? price - reduction : price;
    }
}
