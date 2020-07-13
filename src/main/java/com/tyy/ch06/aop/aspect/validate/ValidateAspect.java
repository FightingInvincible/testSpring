package com.tyy.ch06.aop.aspect.validate;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//校验切面
@Component
@Aspect
@Order(1)
public class ValidateAspect {
//    @Pointcut("execution(public int com.tyy.ch06.aop.aspect.CountImpl.*(..))")
//    public void pointCut(){ }
    //环绕通知
//    @Around("pointCut()")
    @Around("com.tyy.ch06.aop.aspect.LogAspect.pointCut()")//共用切点 拷贝全类名
    public Object aroudAdvice(ProceedingJoinPoint pjp) throws Throwable {
        //获得方法名
        String methodName = pjp.getSignature().getName();
        //获得参数列表
        for(Object arg : pjp.getArgs()){
            int value = (int)arg;
            //此时出现非正数
            if(value<=0){
                System.out.println("校验参数：the method "+methodName+" validate校验时发现0或者负数");
                return 0;
            }
        }

        System.out.println("校验参数：the method "+methodName+" validate校验通过");
        Object result = pjp.proceed();
        return result;
    }

}
