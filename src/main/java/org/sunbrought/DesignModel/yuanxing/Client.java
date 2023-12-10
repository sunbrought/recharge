package org.sunbrought.DesignModel.yuanxing;

public class Client {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype();
        Prototype clone = prototype.clone();
        System.out.println(prototype);
        System.out.println(clone);
    }
}
