package com.how2java.tmall.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session创建, Id是： " + se.getSession().getId());
        ServletContext application = se.getSession().getServletContext();

        Integer online_number = (Integer) application.getAttribute("online_number");

        if (null == online_number)
            online_number = 0;
        online_number++;
        application.setAttribute("online_number", online_number);
        System.out.println("新增一位在线用户");
        System.out.println("在线人数： " + online_number);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session销毁, Id是： " + se.getSession().getId());
        ServletContext application = se.getSession().getServletContext();

        Integer online_number = (Integer) application.getAttribute("online_number");

        if(null==online_number){
            online_number = 0;
        }
        else
            online_number--;
        application.setAttribute("online_number", online_number);
        System.out.println("一位用户离线");
        System.out.println("在线人数： " + online_number);
    }
}
