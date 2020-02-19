package org.wjx.exception;

public class NullValueExecption extends RuntimeException {

    public NullValueExecption(String message) {
        super(message);
    }

    public NullValueExecption(String message, Throwable cause) {
        super(message, cause);
    }
}
