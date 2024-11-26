package com.myymaha.yamahaapi.exception;

import com.myymaha.yamahaapi.dto.ErrorResponseDto;
import com.myymaha.yamahaapi.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<ErrorResponseDto> handleCustomerAlreadyExistsException(UserAlreadyExistsException exception, WebRequest request) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto(request.getDescription(false),
                HttpStatus.BAD_REQUEST,
                exception.getMessage());
        return new ResponseEntity<>(errorResponseDto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleResourceNotFoundException(ResourceNotFoundException exception, WebRequest request) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto(request.getDescription(false),
                HttpStatus.BAD_REQUEST,
                exception.getMessage());
        return new ResponseEntity<>(errorResponseDto, HttpStatus.NOT_FOUND);
    }
}
