package com.nttdata.pt1.controller;

import com.nttdata.pt1.dto.ErrorDTO;
import com.nttdata.pt1.exception.BusinessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ErrorDTO> requestExceptionHandler(BusinessException ex){
        ErrorDTO errorDTO = ErrorDTO.builder().code(ex.getCode()).message(ex.getMessage()).build();
        return new ResponseEntity<>(errorDTO, ex.getStatus());
    }
}
