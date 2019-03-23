package com.gupaoedu.designPattern.decorateModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class BaseCake extends Cake {

    @Override
    public String getCakeName() {

        return "Cake";

    }

    @Override
    public int getCakePrice() {

        return 5;

    }
}
