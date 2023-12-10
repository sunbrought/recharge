package org.sunbrought.DesignModel.guanchazhe_mingling;

public class Client {
    public static void main(String[] args) {
        // 创建一个被观察者对象
        Subject subject = new Subject();

        // 创建一个观察者对象
        Observer observer = new ConcreteObserver();

        // 注册观察者对象
        subject.register(observer);

        // 创建一个命令对象
        Command command = new ConcreteCommand(subject);

        // 执行命令，通知观察者对象
        command.execute();
    }
}
