package com.zero.entity;

public class CommonBaseTime extends CommonBaseIndentity {

    private static final long serialVersionUID = -5609876577468629946L;

    private Long createTime;

    private Long updateTime;

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
