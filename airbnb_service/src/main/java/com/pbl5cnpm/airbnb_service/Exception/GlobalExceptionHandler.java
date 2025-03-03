package com.pbl5cnpm.airbnb_service.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.pbl5cnpm.airbnb_service.dto.ApiResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ApiResponse<String>> handleRuntimeException(RuntimeException runtimeErr){
        ApiResponse<String> apiresponse = new ApiResponse<>();
        apiresponse.setMessage(runtimeErr.getMessage());

        return ResponseEntity.badRequest().body(apiresponse);
    }
    @ExceptionHandler(AppException.class)
    public ResponseEntity<ApiResponse<String>> handleAppException(AppException appException){
        ApiResponse<String> apirest = new ApiResponse<>();
        ErrorCode err = appException.getErrorcode();
        apirest.setCode(err.getCode());
        apirest.setMessage((err.getMessage()));

        return ResponseEntity.badRequest().body(apirest);
    }
}
