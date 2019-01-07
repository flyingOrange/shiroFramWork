package com.shiro.service;

import java.util.List;

import com.shiro.model.Role;

public interface RoleService {
    
    public void addRole(Role role);
    
    public void deleteRole(long roleId);
    
    //添加角色-权限映射
    public void addRolePerm(long roleId,long permissionId);
    
    public void addRolePerms(long roleId,List<Long> permissionIds);
    
    //移除角色-权限映射
    public void deleteRolePerm(long roleId,long permissionId);
    
    public void deleteRolePerms(long roleId,List<Long> permissionIds);
}
