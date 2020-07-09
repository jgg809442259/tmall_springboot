package com.how2java.tmall.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {
    @Override
    public void requestDestroyed(ServletRequestEvent arg0) {
//        System.out.println("销毁了一个Request ");
    }

    @Override
    public void requestInitialized(ServletRequestEvent arg0) {
//        System.out.println("创建了一个Request ");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent e) {
//        System.out.println("Request增加属性Key: " + e.getName());
//        System.out.println("             Value: " + e.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent e) {
//        System.out.println("Request移除属性Key: " + e.getName());
//        System.out.println("             Value: " + e.getValue());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent e) {
//        System.out.println("Request替换属性Key: " + e.getName());
//        System.out.println("             Value: " + e.getValue());
    }
}