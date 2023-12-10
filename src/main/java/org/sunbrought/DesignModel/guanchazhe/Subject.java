package org.sunbrought.DesignModel.guanchazhe;

//被观察者
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
