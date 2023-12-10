package org.sunbrought.DesignModel.danli;

//懒汉式
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // 私有构造函数，防止外部实例化
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

//饿汉式
class Singleton1 {
    // 在类加载时就创建单例对象
    private static Singleton1 instance = new Singleton1();

    // 将构造函数设为私有，禁止外部创建实例
    private Singleton1() {}

    // 提供获取单例对象的方法
    public static Singleton1 getInstance() {
        return instance;
    }
}

//静态内部类
class Singleton2 {
    private Singleton2() {
        // 私有构造函数，防止外部实例化
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }
}

//双重检查锁验证
class Singleton3 {
    private static volatile Singleton3 instance;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}

