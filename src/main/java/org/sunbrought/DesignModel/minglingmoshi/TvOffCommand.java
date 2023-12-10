package org.sunbrought.DesignModel.minglingmoshi;

//具体命令类
public class TvOffCommand implements Command{
    private TV tv;

    public TvOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
