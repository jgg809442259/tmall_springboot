package com.how2java.tmall.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class SessionAttributeListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent e) {
//        System.out.println("Session增加属性Key: " + e.getName());
//        System.out.println("             Value: " + e.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent e) {
//        System.out.println("Session移除属性Key: " + e.getName());
//        System.out.println("             Value: " + e.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent e) {
//        System.out.println("Session替换属性Key: " + e.getName());
//        System.out.println("             Value: " + e.getValue());
    }
}
