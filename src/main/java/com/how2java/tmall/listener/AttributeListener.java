package com.how2java.tmall.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AttributeListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
//        System.out.println("增加属性Key: " + scae.getName());
//        System.out.println("      Value: " + scae.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
//        System.out.println("移除属性Key: " + scae.getName());
//        System.out.println("      Value: " + scae.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
//        System.out.println("替换属性Key: " + scae.getName());
//        System.out.println("      Value: " + scae.getValue());
    }
}