package com.zero.exception;

public class BasicDataException extends Exception {

    private static final long serialVersionUID = 9106391646012717490L;

    public BasicDataException(final String message) {
        super(message);
    }

    public BasicDataException(final Throwable cause) {
        super(cause);
    }

    public BasicDataException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
