package com.marvin.sysadmin.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ResultJson implements Serializable {

    private static final long serialVersionUID = 1;

    private String code;
    private String message;
    private Map<String, Object> data = new HashMap<>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public ResultJson() {
    }

    public ResultJson(String code, String message, Map<String, Object> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ResultJson success() {
        ResultJson resultJson = new ResultJson();
        resultJson.setCode(Constants.SUCCESS);
        resultJson.setMessage(Constants.SUCCESS_MSG);
        return resultJson;
    }

    public static ResultJson failure() {
        return new ResultJson(Constants.FAILURE, Constants.FAILURE_MSG, null);
    }

    public static ResultJson failure(String code, String msg) {
        ResultJson resultJson = new ResultJson();
        resultJson.setCode(code);
        resultJson.setMessage(msg);
        return resultJson;
    }

    public ResultJson add(String key, Object value) {
        this.getData().put(key, value);
        return this;
    }

}
