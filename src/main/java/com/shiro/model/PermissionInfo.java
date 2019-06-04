package com.shiro.model;

public class PermissionInfo {
    
    int permId;
    String permCode;
    String permName;
    int premise;
    long createTime;
    long updateTime;
    
    public int getPermId() {
        return permId;
    }
    public void setPermId(int permId) {
        this.permId = permId;
    }
    public String getPermName() {
        return permName;
    }
    public void setPermName(String permName) {
        this.permName = permName;
    }
    public int getPremise() {
        return premise;
    }
    public void setPremise(int premise) {
        this.premise = premise;
    }
    public long getCreateTime() {
        return createTime;
    }
    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }
    public long getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }
    public String getPermCode() {
        return permCode;
    }
    public void setPermCode(String permCode) {
        this.permCode = permCode;
    }
    @Override
    public String toString() {
        return "PermissionInfo [permId=" + permId + ", permCode=" + permCode + ", permName=" + permName + ", premise="
                + premise + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
    }
    
}
