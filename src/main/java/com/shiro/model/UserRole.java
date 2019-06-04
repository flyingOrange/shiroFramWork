package com.shiro.model;

public class UserRole {
    
    long accountId;
    long roleId;
    long createTime;
    long updateTime;
    
    public long getAccountId() {
        return accountId;
    }
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
    public long getRoleId() {
        return roleId;
    }
    public void setRoleId(long roleId) {
        this.roleId = roleId;
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
    @Override
    public String toString() {
        return "UserRole [accountId=" + accountId + ", roleId=" + roleId + ", createTime=" + createTime
                + ", updateTime=" + updateTime + "]";
    }
    
}
