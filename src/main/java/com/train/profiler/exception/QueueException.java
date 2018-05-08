package com.train.profiler.exception;

/**
 * @author ryan 
 * exception class
 */
public class QueueException extends Exception {

    public QueueException() {
        super();
    }

    public QueueException(final String message) {
        super(message);
    }

    public QueueException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public QueueException(final Throwable cause) {
        super(cause);
    }
}
