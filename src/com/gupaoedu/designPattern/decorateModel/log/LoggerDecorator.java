package com.gupaoedu.designPattern.decorateModel.log;

public class LoggerDecorator  implements Logger{

    private Logger logger;

    public LoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public String info() {
        return logger.info();
    }

    @Override
    public String error() {
        return logger.error();
    }
}
