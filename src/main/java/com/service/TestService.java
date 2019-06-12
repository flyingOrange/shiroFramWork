package com.service;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    
    public void test() {
        //在service中获取了HttpSession
        Session session = SecurityUtils.getSubject().getSession();
        System.out.println(session.getAttribute("test"));
        
    }

}
