package com.brerp.view.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.brerp.biz.user.UserService;
import com.brerp.biz.user.UserVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	/*
	 * @RequestMapping(value="login.do", method=RequestMethod.GET) public String
	 * loginView(UserVO vo) { System.out.println("로그인 화면으로 이동"); vo.setId("test");
	 * vo.setPasword("1234"); return "login.do"; }
	 */	
	
	@RequestMapping(value="/login.do")
	public String login(UserVO vo) {
		String pId = vo.getId();
		System.out.println("로그인 인증처리 ..............."+pId);
		if(pId != null) {
			if(userService.getUser(vo) != null) { return "getBoardList.do"; }
			else { return "login.do"; }
		} else { return "login.do"; }
	}
}
