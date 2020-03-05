package com.gupaoedu.designPattern.decorateModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public abstract class CakeDecorater extends Cake{

    private Cake cake;

    public CakeDecorater(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getCakeName() {
        return cake.getCakeName();
    }

    @Override
    public int getCakePrice() {
        return cake.getCakePrice();
    }
}
