package com.meta.web.dto;

import java.io.Serializable;

/**
 * @Author hvemuri
 * @Generated at 5/15/2018 12:32 PM
 */
public class MetaCoreStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private String message;

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
}
