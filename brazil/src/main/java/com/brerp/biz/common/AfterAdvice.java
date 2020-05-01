package com.brerp.biz.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterAdvice {

	@Pointcut("execution(* com.brerp.biz..*Impl.*(..))")
	public void allPointcut() {
	}
	
	@After("allPointcut()")
	public void finallyLog() {
		System.out.println("[finally 사후처리] 비즈니스 로직 수행 후 무조건 동작 - After어드바이스");
	}

}
