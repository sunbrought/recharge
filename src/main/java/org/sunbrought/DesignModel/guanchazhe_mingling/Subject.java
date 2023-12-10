package org.sunbrought.DesignModel.guanchazhe_mingling;

import java.util.ArrayList;
import java.util.List;

/**
 * 2接着，我们创建一个类 Subject 来表示被观察者对象，其中包含一些观察者对象的引用和一些方法用于注册、注销和通知观察者。
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
