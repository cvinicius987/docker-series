package br.com.exemplo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class Index extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
		response.setContentType("text/html");
	
		response.getWriter()
				.append("<h1>Java EE, Tomcat e Docker</h1>")
				.append("<h2>Server Path:"+request.getContextPath()+"</h2>");
	}
}