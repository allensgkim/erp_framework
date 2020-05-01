package com.brerp.view.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Servlet implementation class DispatcherServlet
 */
//@WebServlet(name = "action", urlPatterns = { "*.do" })
public class DispatcherServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L; 
	
	public void init(ServletContext container) throws ServletException {
		XmlWebApplicationContext context = new XmlWebApplicationContext();
		context.setConfigLocation("/WEB-INF/config/presentation-layer.xml");
		/*
		 * handlerMapping = new HandlerMapping(); viewResolver = new ViewResolver();
		 * viewResolver.setPrefix("./"); viewResolver.setSuffix(".jsp");
		 */
	}	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
	/*
	 * public DispatcherServlet() { super(); // TODO Auto-generated 0constructor stub
	 * }
	 */

	/*
	 * public void init() throws ServletException { handlerMapping = new
	 * HandlerMapping(); viewResolver = new ViewResolver();
	 * viewResolver.setPrefix("./"); viewResolver.setSuffix(".jsp"); }
	 */

	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub
	 * //response.getWriter().append("Served at: ").append(request.getContextPath())
	 * ; process(request, response); }
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub //doGet(request, response);
	 * request.setCharacterEncoding("EUC-KR"); process(request, response); }
	 */

	/*
	 * private void process(HttpServletRequest request, HttpServletResponse
	 * response) throws IOException { // TODO Auto-generated method stub String uri
	 * = request.getRequestURI(); String path = uri.substring(uri.lastIndexOf("/"));
	 * System.out.println("Servlet path :::" + path);
	 * 
	 * Controller ctrl = handlerMapping.getController(path); String viewName =
	 * ctrl.handlerRequest(request, response);
	 * 
	 * String view = null; if(viewName.contains(".do")) { view =
	 * viewResolver.getView(viewName); } else { view =
	 * viewResolver.getView(viewName);//viewName; } System.out.println("view ::: " +
	 * view); response.sendRedirect(view); }
	 */

	/* Servlet으로 처리시
	 * 
	 * if(path.equals("/login.do")) { System.out.println("로그인 처리");
	 * response.sendRedirect("login.jsp"); } else if (path.equals("/logout.do")) {
	 * System.out.println("로그아웃 처리"); HttpSession session = request.getSession();
	 * session.invalidate();
	 * 
	 * response.sendRedirect("login.jsp"); } else if
	 * (path.equals("/insertBoard.do")) { System.out.println("글 등록 처리"); } else if
	 * (path.equals("/updateBoard.do")) { System.out.println("글 수정 처리"); } else if
	 * (path.equals("/deleteBoard.do")) { System.out.println("글 삭제 처리"); } else if
	 * (path.equals("/getBoard.do")) { System.out.println("글 상세 조회 처리"); } else if
	 * (path.equals("/getBoardList.do")) { System.out.println("글 목록 검색 처리"); }
	 */


}
