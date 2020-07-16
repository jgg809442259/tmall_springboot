package com.how2java.tmall.aspect;

import com.how2java.tmall.pojo.Order;
import com.how2java.tmall.pojo.User;
import com.how2java.tmall.service.OrderService;
import com.how2java.tmall.service.impl.OrderServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class UserAspect {
    @DeclareParents(
            value = "com.how2java.tmall.service.impl.OrderServiceImpl+",
            defaultImpl = OrderServiceImpl.class)
    public OrderService orderService;

    @Pointcut("execution(* com.how2java.tmall.service.impl.UserServiceImpl.getByName(..))")
    public void pointCut(){
    }

    @Before("pointCut() && args(user)")
    public void before(JoinPoint jp, User user){
        System.out.println("登录"+ user.getName() + "用户之前");
    }

    @After("pointCut() && args(user)")
    public void after(JoinPoint jp, User user){
        System.out.println("登录"+ user.getName() + "用户之后");
        List<Order> orderList = orderService.listByUserWithoutDelete(user);
        for(Order o : orderList){
            System.out.println("订单手机号是"+ o.getMobile());
        }
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("登录用户完毕");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("登录用户异常");
    }
}
