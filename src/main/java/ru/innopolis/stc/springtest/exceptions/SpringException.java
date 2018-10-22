package ru.innopolis.stc.springtest.exceptions;

public class SpringException extends RuntimeException {
    private String exceptionMessage;

    public SpringException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}
