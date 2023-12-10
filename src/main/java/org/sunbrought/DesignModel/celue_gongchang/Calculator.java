package org.sunbrought.DesignModel.celue_gongchang;


/**
 * 首先，我们定义一个 CalculatorStrategy 接口，其中包含了两个方法：calculate 用于计算两个数的结果，getDescription 用于获取当前策略的描述信息。
 * 接下来，我们使用工厂模式来创建具体的策略对象。我们创建一个 CalculatorStrategyFactory 工厂类，其中定义了一个 getCalculatorStrategy 方法，根据传入的操作符，返回相应的计算策略对象。
 */
public class Calculator {

    public static void main(String[] args) {
        //调用计算器
        // 执行加法计算
        double result = Calculator.calculate(10, 5, "+");
        // 输出 15.0
        System.out.println(result);
    }

    public static double calculate(double num1, double num2, String operator) {
        CalculatorStrategy calculatorStrategy = CalculatorStrategyFactory.getCalculatorStrategy(operator);
        System.out.println("正在执行 " + calculatorStrategy.getDescription() + " 计算");
        return calculatorStrategy.calculate(num1, num2);
    }
}
