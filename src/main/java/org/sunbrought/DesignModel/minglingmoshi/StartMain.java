package org.sunbrought.DesignModel.minglingmoshi;

public class StartMain {
    public static void main(String[] args) {
        TV tv = new TV();
        Command onCommand = new TvOnCommand(tv);
        Command offCommand = new TvOffCommand(tv);
        Command changeChannelCommand = new TvChangeChannelCommand(tv, 2);

        RemoteController remoteController = new RemoteController(onCommand, offCommand, changeChannelCommand);
        remoteController.turnOn(); // 输出 "TV is on"
        remoteController.turnOff(); // 输出 "TV is off"
        remoteController.changeChannel();//输出 "TV is changeChannel to 2"
        Command changeChannelCommand2 = new TvChangeChannelCommand(tv, 5);
        RemoteController remoteController2 = new RemoteController(onCommand, offCommand, changeChannelCommand2);
        remoteController2.changeChannel(); // 输出 "TV channel is changed to 5"
    }
}
