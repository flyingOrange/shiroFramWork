package com.shiro.model;

public class RolePermission {

    long roleId;
    long permId;
    long createTime;
    long updateTime;
    public long getRoleId() {
        return roleId;
    }
    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }
    public long getPermId() {
        return permId;
    }
    public void setPermId(long permId) {
        this.permId = permId;
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
        return "RolePermission [roleId=" + roleId + ", permId=" + permId + ", createTime=" + createTime
                + ", updateTime=" + updateTime + "]";
    }
    
}
