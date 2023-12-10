package org.sunbrought.DesignModel.mobanfangfamoshi;

// 抽象类，定义算法骨架
public abstract class AbstractClass {

    // 模板方法，定义算法流程(需要注意的是，在模板方法模式中，模板方法通常被声明为 final，以防止子类对其进行重写)
    public final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }

    // 抽象方法1，由子类实现
    public abstract void primitiveOperation1();

    // 抽象方法2，由子类实现
    public abstract void primitiveOperation2();

}
