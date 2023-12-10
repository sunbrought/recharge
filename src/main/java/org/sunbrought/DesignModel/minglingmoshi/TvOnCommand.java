package org.sunbrought.DesignModel.minglingmoshi;

//具体命令类
public class TvOnCommand implements Command{
    private TV tv;

    public TvOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

}
