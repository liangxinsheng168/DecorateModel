package com.gupaoedu.designPattern.decorateModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class DecorateModelTest {
    public static void main(String[] args) {
        BaseCake baseCake = new BaseCake();
        baseCake = new EggDecorator(baseCake);
        baseCake = new EggDecorator(baseCake);
        baseCake = new SausageDecorater(baseCake);
        System.out.println(baseCake.getCakeName() + ": " + baseCake.getCakePrice());
    }
}
