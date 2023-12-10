package org.sunbrought.DesignModel.guanchazhe_mingling;

/**
 * 4然后，我们创建一个具体命令类 ConcreteCommand，该类实现了 Command 接口，其中包含一个 Subject 对象的引用和一个 execute() 方法，
 * 该方法会调用 Subject 对象的 notifyObservers() 方法通知观察者对象。
 *
 */
public class ConcreteCommand implements Command{
    private Subject subject;

    public ConcreteCommand(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void execute() {
        subject.notifyObservers();
    }
}
