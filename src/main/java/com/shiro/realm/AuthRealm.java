package com.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class AuthRealm extends AuthorizingRealm {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println(token.hashCode());
        // 把AuthenticationToken转化为UsernamePasswordToken
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        // 从UsernamePasswordToken获取username
        String username = upToken.getUsername();

        // 在数据库中查询username

        // 用户不存在,抛出异常

        // 根据用户状况，抛出其他异常(如用户被锁定)
        
        
        //CredentialsMatcher属性比对密码

        // principal-认证信息实体 credentials-密码
        // realmName-当前realm对象的name,调用父类getName()即可
        Object principal = username;
        Object credentials = "123";
        String realmName = getName();
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, credentials, realmName);

        return null;
    }

}
