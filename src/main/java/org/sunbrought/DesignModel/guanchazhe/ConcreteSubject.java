package org.sunbrought.DesignModel.guanchazhe;

import java.util.ArrayList;
import java.util.List;

//具体的被观察者实现类
public class ConcreteSubject implements Subject{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
