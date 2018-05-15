package com.meta.web.dto;

import java.io.Serializable;

/**
 * @Author hvemuri
 * @Generated at 5/14/2018 10:54 AM
 */
public class MetaRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    private String metaName;

    private String about;

    public String getMetaName() {
        return metaName;
    }

    public void setMetaName(String metaName) {
        this.metaName = metaName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
