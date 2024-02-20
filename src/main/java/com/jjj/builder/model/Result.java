package com.jjj.builder.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 响应
 *
 * @param <T>
 * @Author jjj
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final String successMsg = "success";
    public static final int CODE_SUCCESS = 0;
    public static final int CODE_FAILURE = 1;

    /**
     * 响应码 0成功 1失败
     */
    private int code = CODE_SUCCESS;
    /**
     * 响应数据
     */
    private T data;
    /**
     * 响应信息
     */
    private String message;

    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        result.message = successMsg;
        return result;
    }

    @SuppressWarnings("rawtypes")
    public static <T> Result<T> success(T data) {
        Result<T> result = Result.success();
        result.setData(data);
        return result;
    }
    @SuppressWarnings("rawtypes")
    public static <T> Result<T> success(T data, String message) {
        Result<T> result = Result.success();
        result.setData(data);
        result.message = message;
        return result;
    }

    public static <T> Result<T> fail(String message) {
        return fail(1, message);
    }

    public static <T> Result<T> fail(int code, String message) {
        return fail(code, message, null);
    }

    public static <T> Result<T> fail(int code, String message, T data) {
        Result<T> result = new Result<>();
        result.setMessage(message);
        result.setCode(code);
        result.setData(data);
        return result;
    }

    public boolean isOk() {
        return this.code == CODE_SUCCESS;
    }

}
