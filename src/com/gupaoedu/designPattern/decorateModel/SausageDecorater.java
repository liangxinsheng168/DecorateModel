package com.gupaoedu.designPattern.decorateModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class SausageDecorater extends CakeDecorater {

    public SausageDecorater(Cake cake) {
        super(cake);
    }

    @Override
    public String getCakeName() {
        return super.getCakeName() + " add one sausage ";
    }

    @Override
    public int getCakePrice() {
        return super.getCakePrice() + 2;
    }

}
