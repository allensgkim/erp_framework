package com.brerp.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class AroundAdvice {

	@Pointcut("execution(* com.brerp.biz..*Impl.*(..))")
	public void allPointcut() {
	}
	
	@Around("allPointcut()")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		//System.out.println("[Before] : 비즈니스 메소드 수행 전에 처리할 내용...");
		
		String method = pjp.getSignature().getName();
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Object returnObj = pjp.proceed();
		
		stopWatch.stop();
		System.out.println("[Around] : " + method + "() 메소드 수행에 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)초");
		return returnObj;
	}

}