package com.zero.result;

import java.io.Serializable;

public class CommonResult<T> implements Serializable {

    public static final String RESP_CODE_SUCCESS = "00000000";

    public static final String RESP_MESSAGE_SUCCESS = "success";

    private static final long serialVersionUID = -4759245479120310282L;

    private String code;

    private boolean success;

    private String message;

    private T data;

    public CommonResult() {
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static <T> CommonResult<T> success(T data) {
        CommonResult<T> result = new CommonResult<>();
        result.setCode(RESP_CODE_SUCCESS);
        result.setMessage(RESP_MESSAGE_SUCCESS);
        result.setSuccess(true);
        result.setData(data);
        return result;
    }

    public static <T> CommonResult<T> fail(String code, String message, T data) {
        CommonResult<T> result = new CommonResult<>();
        result.setCode(code);
        result.setData(data);
        result.setMessage(message);
        result.setSuccess(false);
        return result;
    }

    public static <T> CommonResult<T> fail(String code, String message) {
        CommonResult<T> result = new CommonResult<>();
        result.setCode(code);
        result.setMessage(message);
        result.setSuccess(false);
        result.setData(null);
        return result;
    }
}
