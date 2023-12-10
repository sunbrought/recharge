package org.sunbrought.DesignModel.gongchang_danli;


/**
 * 使用工厂模式来创建对象，通过单例模式来保证该工厂只有一个实例，从而减少创建对象时的开销。
 *
 * 首先，创建一个工厂类，该类使用单例模式来保证只有一个实例，该实例负责创建对象。然后，根据需要创建多个工厂方法，每个方法用于创建不同的对象。
 */
public class SingletonFactory {
    private static volatile SingletonFactory instance;

    private SingletonFactory() {
        // 私有构造方法
    }

    public static SingletonFactory getInstance() {
        if (instance == null) {
            synchronized (SingletonFactory.class) {
                if (instance == null) {
                    instance = new SingletonFactory();
                }
            }
        }
        return instance;
    }

    public Object createObject(String type) {
        if ("type1".equals(type)) {
            return new Type1();
        } else if ("type2".equals(type)) {
            return new Type2();
        } else {
            throw new IllegalArgumentException("Unsupported type: " + type);
        }
    }
}


