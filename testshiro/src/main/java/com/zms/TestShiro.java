package com.zms;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

public class TestShiro {

    public static void main(String[] args) {

        //加载配置文件
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager sm = factory.getInstance();
        SecurityUtils.setSecurityManager(sm);

        //获取主体       IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        //
        //        //安全管理器
        Subject subject = SecurityUtils.getSubject();

        //令牌
        UsernamePasswordToken token = new UsernamePasswordToken("qq", "qq");

        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            System.out.println("账号不存在");
        } catch (AuthenticationException e) {
            System.out.println("密码错误");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("this is qq" + subject.hasRole("order"));
        System.out.println(subject.isAuthenticated());
        //退出

        //IncorrectCredentialsException
        //UnknownAccountException

    }


}
