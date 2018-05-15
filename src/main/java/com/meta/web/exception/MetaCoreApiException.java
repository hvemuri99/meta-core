package com.meta.web.exception;

import com.meta.web.dto.MetaCoreStatus;

import java.util.List;

/**
 * @Author hvemuri
 * @Generated at 5/15/2018 12:31 PM
 */
public class MetaCoreApiException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private List<MetaCoreStatus> errors;
    private String code;

    public MetaCoreApiException(MetaCoreStatus status) {
        super(status.getMessage());
        this.code = status.getCode();
    }

    public MetaCoreApiException(String code, String message) {
        super(message);
        this.code = code;
    }
}
