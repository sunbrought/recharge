package org.sunbrought.DesignModel.zhuangshiqi;

// 测试代码
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // 创建原始对象
        Shape circle = new Circle();

        // 创建装饰器对象
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        // 调用方法
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
