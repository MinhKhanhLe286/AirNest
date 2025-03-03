package com.pbl5cnpm.airbnb_service.Exception;

public enum ErrorCode {
    USER_EXISTED(1000,"user existd")
    ;
    ErrorCode(int code, String message){
        this.code = code;
        this.message = message;     
    }
    private int code;
    private String message;
    
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    
}
