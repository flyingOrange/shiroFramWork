package com.shiro.service;

import com.shiro.model.PermissionInfo;

public interface PermissionService {
    
    public void addPermission(PermissionInfo permission);
    
    public void deletePermission(long permissionId);

}
