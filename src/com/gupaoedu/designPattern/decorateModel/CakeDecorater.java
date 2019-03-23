package com.gupaoedu.designPattern.decorateModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public abstract class CakeDecorater extends BaseCake{

    BaseCake baseCake = null;

    public CakeDecorater(BaseCake baseCake) {
        this.baseCake = baseCake;
    }

    @Override
    public String getCakeName() {
        return baseCake.getCakeName();
    }

    @Override
    public int getCakePrice() {
        return baseCake.getCakePrice();
    }
}
