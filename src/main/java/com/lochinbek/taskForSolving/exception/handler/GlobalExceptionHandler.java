package com.lochinbek.taskForSolving.exception.handler;

import com.lochinbek.taskForSolving.exception.NotFoundUserException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundUserException.class)
    public ResponseEntity<Object> exception(NotFoundUserException notFoundUserException) {
        return new ResponseEntity<>(notFoundUserException.getMessage(), HttpStatus.NOT_FOUND);
    }
}
