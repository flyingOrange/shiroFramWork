package com.shiro.service;

import com.shiro.model.Permission;

public interface PermissionService {
    
    public void addPermission(Permission permission);
    
    public void deletePermission(long permissionId);

}
