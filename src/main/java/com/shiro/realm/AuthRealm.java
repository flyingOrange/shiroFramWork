package com.shiro.realm;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

public class AuthRealm extends AuthorizingRealm {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //从principals中获取登录用户信息
        Object principal = principals.getPrimaryPrincipal();
        
        //利用用户信息从缓存或数据库中查询用户role和perm
        Set<String> roles = new HashSet<>();
        
        //创建并返回SimpleAuthorizationInfo
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);

        return info;
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
        if("unknown".equals(username)) {
            throw new UnknownAccountException("用户不存在");
        }

        // 根据用户状况，抛出其他异常(如用户被锁定)
        if("locked".equals(username)) {
            throw new UnknownAccountException("用户被锁定");
        }

        // 通过realm的CredentialsMatcher属性比对密码
        
        
        //假设以下数据是从数据库中查询所得
        Object principal = username;
        Object credentials = "123456";
        String realmName = getName();
        //盐值。使用ByteSource.Util.bytes()计算盐值
        ByteSource credentialsSalt = ByteSource.Util.bytes(username);
        
        
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, credentials, credentialsSalt,
                realmName);

        return info;
    }

    public static void main(String[] args) {
        String algorithmName = "MD5";
        String source = "123456";
        Object salt = ByteSource.Util.bytes("admin");
        //加密次数
        int hashIterations = 5;
        Object result = new SimpleHash(algorithmName, source, salt, hashIterations);
        System.out.println(result);

    }

}
