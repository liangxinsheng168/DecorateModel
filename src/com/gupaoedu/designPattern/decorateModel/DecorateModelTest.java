package com.gupaoedu.designPattern.decorateModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class DecorateModelTest {
    public static void main(String[] args) {
        Cake cake = new BaseCake();
        cake = new EggDecorator(cake);
        cake = new EggDecorator(cake);
        cake = new SausageDecorater(cake);
        System.out.println(cake.getCakeName() + ": " + cake.getCakePrice());
    }
}
