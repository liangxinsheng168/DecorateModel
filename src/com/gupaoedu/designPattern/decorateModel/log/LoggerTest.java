package com.gupaoedu.designPattern.decorateModel.log;

public class LoggerTest {
    public static void main(String[] args) {
        CommonsLogger commonsLogger = new CommonsLogger();
        System.out.println(commonsLogger.info());
        System.out.println(commonsLogger.error());

        Slfj4LoggerDecorator slfj4LoggerDecorator = new Slfj4LoggerDecorator(commonsLogger);
        System.out.println(slfj4LoggerDecorator.info());
        System.out.println(slfj4LoggerDecorator.error());
    }
}
