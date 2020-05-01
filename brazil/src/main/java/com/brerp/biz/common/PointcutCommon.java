package com.brerp.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/*
 * 어노테이션 설정으로 변경 후 어드바이스 클래스마다 포인트컷 설정이 포함되면서
 * 비슷하거나 같읕 포인트컷이 반복 선언되는 문제가 발생
 * 스프링은 이런 문제를 해결하고자 포이트컷을 외부에 독립된 클래스에 따로 설정하도록 한다. 
 * */

@Aspect
public class PointcutCommon {
	
	@Pointcut("execution(* com.brerp.biz..*Impl.*(..))")
	public void allPointcut() {
	}

	@Pointcut("execution(* com.brerp.biz..*Impl.*(..))")
	public void getPointcut() {
	}

}
