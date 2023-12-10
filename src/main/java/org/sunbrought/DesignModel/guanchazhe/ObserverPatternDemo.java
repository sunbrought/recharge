package org.sunbrought.DesignModel.guanchazhe;

/**
 * 观察者模式的优点在于它提供了一种松耦合的方式，让观察者和主题之间的依赖关系变得更加灵活，同时也可以使得程序更易于扩展和维护。
 * 观察者模式的应用场景包括：当一个抽象模型有两个方面，其中一个方面依赖于另一个方面时；当一个对象的改变需要同时改变其他对象的时候；
 * 当一个对象的改变需要通知其他对象而又不希望与被通知对象形成紧耦合关系时。
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver("Observer1");
        Observer observer2 = new ConcreteObserver("Observer2");
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.notifyObservers("Hello, World!");
    }
}
