package com.empolyee.controller.advice;

import com.empolyee.exception.Employeecustomexception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class EmployeeControlleradvice {

    @ExceptionHandler(Employeecustomexception.class)
    ResponseEntity<Map<String , Object>> HandleEmployeeCustomException(Employeecustomexception ex){
        Map<String,Object> errorDetails = new HashMap<>();
        errorDetails.put("time stamp", LocalDateTime.now());
        errorDetails.put("status code", ex.getHttpStatus().value());
        errorDetails.put("error", ex.getHttpStatus().getReasonPhrase());
        errorDetails.put("message", ex.getMessage());
        
        return new ResponseEntity<>(errorDetails,ex.getHttpStatus());
    }
    @ExceptionHandler(Exception.class)
    ResponseEntity<Map<String , Object>> HandleGeneralException(){
        Map<String,Object> errorDetails = new HashMap<>();
        errorDetails.put("time stamp", LocalDateTime.now());
        errorDetails.put("status code", HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorDetails.put("error", HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        errorDetails.put("message", "An unexpected error occured ");
        return new ResponseEntity<>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
