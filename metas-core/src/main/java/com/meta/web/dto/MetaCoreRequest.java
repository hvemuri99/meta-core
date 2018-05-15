package com.meta.web.dto;

import java.io.Serializable;

/**
 * @Author hvemuri
 * @Generated at 5/14/2018 10:46 AM
 */
public class MetaCoreRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String superStrength;

    private String timeStamp;

    public String getSuperStrength() {
        return superStrength;
    }

    public void setSuperStrength(String superStrength) {
        this.superStrength = superStrength;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
