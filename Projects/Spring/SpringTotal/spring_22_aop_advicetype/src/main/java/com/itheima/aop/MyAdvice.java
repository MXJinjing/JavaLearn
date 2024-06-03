package com.itheima.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Objects;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.itheima.dao.BookDao.findByName(..))")
    private void pt(){

    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = "beta";
        Object ret = pjp.proceed(args);
        return ret;
    }

    @AfterReturning(value = "pt()", returning = "ret")
    public void afterReturning(String ret){
        System.out.println("afterReturning advice ..."+ret);
    }

    @AfterThrowing(value = "pt()", throwing = "t")
    public void afterThrowing(Throwable t){
        System.out.println("afterThrowing advice ..."+t);
    }
}
