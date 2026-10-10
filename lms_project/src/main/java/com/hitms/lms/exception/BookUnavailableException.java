package com.hitms.lms.exception;

/** Signals that a requested book has no copies available to issue. */
public class BookUnavailableException extends Exception {

    /** Creates the exception with a user-readable explanation. */
    public BookUnavailableException(String message) {
        super(message);
    }
}
