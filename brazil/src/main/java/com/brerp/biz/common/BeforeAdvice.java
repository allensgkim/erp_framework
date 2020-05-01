package com.brerp.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class BeforeAdvice {
	
	/* 공통 포인트컷으로 처리
	 * @Pointcut("execution(* com.brerp.biz..*Impl.*(..))") public void
	 * allPointcut() { }
	 */	
	
	@Before("PointcutCommon.allPointcut()")
	public void beforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("\n[Before 사전처리] " + method + "() 메소드 ARGS 정보 : " + args[0].toString());
	}

}
