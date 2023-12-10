package org.sunbrought.DesignModel.minglingmoshi;

//定义调用者类
public class RemoteController {
    private Command onCommand;
    private Command offCommand;
    private Command changeChannelCommand;

    public RemoteController(Command onCommand, Command offCommand, Command changeChannelCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
        this.changeChannelCommand = changeChannelCommand;
    }

    public void turnOn() {
        onCommand.execute();
    }

    public void turnOff() {
        offCommand.execute();
    }

    public void changeChannel() {
        changeChannelCommand.execute();
    }
}
