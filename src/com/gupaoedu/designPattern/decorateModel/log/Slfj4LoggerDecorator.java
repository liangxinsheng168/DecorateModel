package com.gupaoedu.designPattern.decorateModel.log;

public class Slfj4LoggerDecorator extends LoggerDecorator{

    public Slfj4LoggerDecorator(Logger logger) {
        super(logger);
    }

    @Override
    public String info() {
        return super.info() + " using slfj4.";
    }

    @Override
    public String error() {
        return super.error() + " using slfj4.";
    }
}
