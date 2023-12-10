package org.sunbrought.DesignModel.minglingmoshi;

//定义接收者类
public class TV {
    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }

    public void changeChannel(int channel) {
        System.out.println("TV channel is changed to " + channel);
    }
}
