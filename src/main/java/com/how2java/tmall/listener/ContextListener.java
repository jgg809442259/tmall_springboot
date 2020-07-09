package com.how2java.tmall.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("天猫启动啦！！！！！！！！！！！！！");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("天猫宕机啦！！！！！！！！！！！！！");
    }
}
