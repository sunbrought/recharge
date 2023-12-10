package org.sunbrought.DesignModel.celue_gongchang;

public class AddStrategy implements CalculatorStrategy{
    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public String getDescription() {
        return "加法";
    }
}
