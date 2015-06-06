package com.shclearing.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * User: changejava
 * Date: 2015/5/29
 * Time: 23:53
 */
//@Aspect
public class ReferencePointcutAspect {
  public void beforeAdvice() {
    System.out.println("===========before advice");
  }

  public void afterFinallyAdvice() {
    System.out.println("===========after finally advice");
  }

  public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("===========around before advice");
    Object retVal = pjp.proceed();
    System.out.println("===========around after advice");
    return retVal;

  }

}
