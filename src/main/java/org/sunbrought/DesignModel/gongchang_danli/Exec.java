package org.sunbrought.DesignModel.gongchang_danli;

public class Exec {
    public static void main(String[] args) {
        SingletonFactory instance = SingletonFactory.getInstance();
        System.out.println(instance.createObject("type1"));
        System.out.println(instance.createObject("type2"));
    }
}
