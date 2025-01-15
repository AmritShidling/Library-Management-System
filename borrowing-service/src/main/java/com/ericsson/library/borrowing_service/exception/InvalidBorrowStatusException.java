package com.ericsson.library.borrowing_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidBorrowStatusException extends RuntimeException {
    public InvalidBorrowStatusException(String message) {
        super(message);
    }
}