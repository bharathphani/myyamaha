package com.myymaha.yamahaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data @AllArgsConstructor
public class ErrorResponseDto {
    private String apiPath;
    private HttpStatus status;
    private String errorMsg;
}
