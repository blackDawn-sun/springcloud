package com.example.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Point {

    @Pointcut("execution(public * com.example.feign.controller.*.*(..))")
    public void ct(){

    }



    @Before("ct()")
    public void point(){
        System.out.println("切面执行前");
//        try {
//            jp.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//        System.out.println("切面执行后");
    }

    @Around("ct()")
    public void sm(ProceedingJoinPoint jp)  {
        System.out.println("切面执行前arroud");
//        System.out.println(jp.toString());
//        Object[] objects = jp.getArgs();
//        String s = jp.getSignature().getName();
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
