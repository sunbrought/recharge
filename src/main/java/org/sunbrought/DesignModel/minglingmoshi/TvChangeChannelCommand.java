package org.sunbrought.DesignModel.minglingmoshi;

//具体命令类
public class TvChangeChannelCommand implements Command{
    private TV tv;
    private int channel;

    public TvChangeChannelCommand(TV tv, int channel) {
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public void execute() {
        tv.changeChannel(channel);
    }
}
