package com.meta.web.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @Author hvemuri
 * @Generated at 5/14/2018 10:52 AM
 */
public class MetaCoreResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<MetaRecord> metas;

    private MetaCoreStatus metaCoreStatus;

    public List<MetaRecord> getMetas() {
        return metas;
    }

    public void setMetas(List<MetaRecord> metas) {
        this.metas = metas;
    }

    public MetaCoreStatus getMetaCoreStatus() {
        return metaCoreStatus;
    }

    public void setMetaCoreStatus(MetaCoreStatus metaCoreStatus) {
        this.metaCoreStatus = metaCoreStatus;
    }
}
