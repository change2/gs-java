package com.shclearing.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * User: changejava
 * Date: 2015/5/29
 * Time: 23:53
 */
@Aspect
public class ReferencePointcutAspect {

  @Around(value="execution(* com.shclearing.aop.annotation.*.*(..))")
  public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("===========around before advice");
    Object retVal = pjp.proceed();
    System.out.println("===========around after advice");
    return retVal;

  }
  @Pointcut(value="execution(* *())")
  public void pointcut() {
    System.out.println("===========pointcut Pointcut advice");
  }
}
