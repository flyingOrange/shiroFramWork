package com.shiro.model;

public class RoleInfo {
    
    long roleId;
    String roleName;
    int status;
    long createTime;
    long updateTime;
    
    public long getRoleId() {
        return roleId;
    }
    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
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
        return "RoleInfo [roleId=" + roleId + ", roleName=" + roleName + ", status=" + status + ", createTime="
                + createTime + ", updateTime=" + updateTime + "]";
    }

}
