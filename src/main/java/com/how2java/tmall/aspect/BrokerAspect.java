package com.how2java.tmall.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BrokerAspect {
    @Pointcut("execution(public * com.how2java.tmall.web.CategoryController.*(..))")
    public void BrokerAspect(){

    }

    @Async
    @Before("BrokerAspect()")
    public void doBeforeGame(){
        System.out.println("分类之前的处理");
        System.out.println(Thread.currentThread().getName());
    }

    @Async
    @After("BrokerAspect()")
    public void doAfterGame(){
        System.out.println("分完类以后的处理");
        System.out.println(Thread.currentThread().getName());
    }

    @Async
    @AfterReturning("BrokerAspect()")
    public void doAfterReturningGame(){
        System.out.println("分类完成返回");
        System.out.println(Thread.currentThread().getName());
    }

    @Async
    @AfterThrowing("BrokerAspect()")
    public void doAfterThrowingGame(){
        System.out.println("异常分类");
        System.out.println(Thread.currentThread().getName());
    }
}
