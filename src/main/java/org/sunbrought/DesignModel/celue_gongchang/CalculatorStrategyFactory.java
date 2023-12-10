package org.sunbrought.DesignModel.celue_gongchang;

public class CalculatorStrategyFactory {
    public static CalculatorStrategy getCalculatorStrategy(String operator) {
        switch (operator) {
            case "+":
                return new AddStrategy();
            case "-":
                return new SubtractStrategy();
            case "*":
                return new MultiplyStrategy();
            case "/":
                return new DivideStrategy();
            default:
                throw new IllegalArgumentException("无效的操作符：" + operator);
        }
    }
}
