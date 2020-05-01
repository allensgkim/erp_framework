package com.brerp.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface Controller {
	//String handlerRequest(HttpServletRequest request, HttpServletResponse response);
	ModelAndView handleRequest(HttpServletRequest request,
				HttpServletResponse response) throws Exception;

}
