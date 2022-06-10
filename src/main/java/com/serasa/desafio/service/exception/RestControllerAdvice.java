package com.serasa.desafio.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestControllerAdvice {
    @ExceptionHandler(NotContentException.class)
    public ResponseEntity<?> noContent() {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}