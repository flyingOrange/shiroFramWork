package com.common;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginAction {

    @RequestMapping("login")
    public String login() {
        String username = "zc";
        String password = "123";

        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            token.setRememberMe(true);
            try {
                System.out.println(token.hashCode());
                currentUser.login(token);
            } catch (AuthenticationException e) {
                System.out.println("登录失败:"+e.getMessage());
            }

        }
        return "succ";

    }
    
    @RequiresAuthentication
    @RequestMapping("authentication")
    public void testAuthentication() {
        
    }
    
    @RequiresPermissions("test:add")
    @RequestMapping("permission")
    public void testPermission(HttpSession httpSession) {
        System.out.println("testPermission");
        httpSession.setAttribute("test", "33haha");
        
    }
    
    

}
