package com.shiro.service;

import java.util.List;

import com.shiro.model.User;

public interface UserService {
    
    public void createUser(User user);
    
    public void changePassword(long userId,String newPassword);
    
    //添加用户-角色映射
    public void addUserRole(long userId,long roleId);
    
    public void addUserRoles(long userId,List<Long> roleIds);
    
    
    //移除用户-角色映射
    public void deleteUserRole(long userId,long roleId);
    
    public void deleteUserRoles(long userId,List<Long> roleIds);
      
}
