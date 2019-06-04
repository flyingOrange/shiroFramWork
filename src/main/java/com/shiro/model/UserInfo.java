package com.shiro.model;

public class UserInfo {
    
    long accountId;
    String loginName;
    String loginPwd;
    String accountName;
    int flag;
    String salt;
    int status;
    long createTime;
    long updateTime;
    
    public long getAccountId() {
        return accountId;
    }
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
    public String getLoginName() {
        return loginName;
    }
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    public String getLoginPwd() {
        return loginPwd;
    }
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public int getFlag() {
        return flag;
    }
    public void setFlag(int flag) {
        this.flag = flag;
    }
    public String getSalt() {
        return salt;
    }
    public void setSalt(String salt) {
        this.salt = salt;
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
        return "UserInfo [accountId=" + accountId + ", loginName=" + loginName + ", loginPwd=" + loginPwd
                + ", accountName=" + accountName + ", flag=" + flag + ", salt=" + salt + ", status=" + status
                + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
    }
    
}
