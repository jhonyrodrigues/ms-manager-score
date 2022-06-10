package com.serasa.desafio.service.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class RestControllerAdvice {
    @ExceptionHandler(NotContentException.class)
    public ResponseEntity<?> noContent() {
        log.info("[REST_CONTROLLER_ADVICE] - Find person out -> response not content");
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}