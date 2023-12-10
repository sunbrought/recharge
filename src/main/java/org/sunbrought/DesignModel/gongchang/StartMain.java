package org.sunbrought.DesignModel.gongchang;

/**
 * 通过一个工厂类来封装对象的创建过程，客户端只需要告诉工厂类需要创建哪种类型的对象即可。将对象的创建过程与客户端代码分离开来，
 * 使代码更加灵活和易于扩展
 */
public class StartMain {
    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct("A");
        productA.operation(); // 输出 "ConcreteProductA operation."

        Product productB = SimpleFactory.createProduct("B");
        productB.operation(); // 输出 "ConcreteProductB operation."
    }
}
