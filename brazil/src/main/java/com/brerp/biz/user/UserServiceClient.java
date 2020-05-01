package com.brerp.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("com/config/applicationContext.xml");
		
		UserService userService = (UserService) context.getBean("userService");
		
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("1234");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + " 님 환영합니다.");
		} else {
			System.out.println("로그인 실패");
		}
		
		context.close();
	}

}
