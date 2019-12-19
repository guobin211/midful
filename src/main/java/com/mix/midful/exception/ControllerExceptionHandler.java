package com.mix.midful.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * ControllerExceptionHandler
 *
 * @author guobin211
 * @version 0.0.1
 */
@ControllerAdvice
@Slf4j
public class ControllerExceptionHandler {
    /**
     * 运行时异常
     * @param ex 运行时异常
     * @return ResponseEntity
     */
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        log.error("[运行时异常]: handleRuntimeException() = {}", ex.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
    }

    /**
     * 服务器异常
     * @param ex 服务器异常
     * @return ResponseEntity
     */
    public ResponseEntity<String> handleException(Exception ex) {
        log.error("[服务器异常]:handleException() = {}", ex.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
    }
}
