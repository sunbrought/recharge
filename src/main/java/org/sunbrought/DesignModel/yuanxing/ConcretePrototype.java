package org.sunbrought.DesignModel.yuanxing;

public class ConcretePrototype implements Prototype{
    @Override
    public Prototype clone() {
        return new ConcretePrototype();
    }
}
