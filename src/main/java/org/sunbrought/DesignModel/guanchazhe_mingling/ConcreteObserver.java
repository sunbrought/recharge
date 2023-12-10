package org.sunbrought.DesignModel.guanchazhe_mingling;

/**
 * 5最后，我们创建一个具体观察者类 ConcreteObserver，该类实现了 Observer 接口，其中包含一个 execute() 方法，该方法会输出一条消息。
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserver received notification.");
    }
}