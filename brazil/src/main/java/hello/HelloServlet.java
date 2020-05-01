package hello;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloServlet extends HttpServlet {

	
	public HelloServlet() {
		System.out.println("==> HelloServelt Object creation");
		AbstractApplicationContext context = new GenericXmlApplicationContext("com/config/applicationContext.xml");
	}
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 메소드 호출");
	}

}
