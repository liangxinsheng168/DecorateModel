package com.gupaoedu.designPattern.decorateModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class EggDecorator extends CakeDecorater {

    public EggDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getCakeName() {
        return super.getCakeName() + " add one egg ";
    }

    @Override
    public int getCakePrice() {
        return super.getCakePrice() + 1;
    }

}
