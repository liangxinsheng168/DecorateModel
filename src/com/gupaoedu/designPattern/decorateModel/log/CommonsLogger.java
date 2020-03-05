package com.gupaoedu.designPattern.decorateModel.log;

public class CommonsLogger implements Logger{

    @Override
    public String info() {
        return "message info";
    }

    @Override
    public String error() {
        return "message error";
    }
}
