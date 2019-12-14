package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

public class FrontController extends DefaultServlet {

	private RequestHelper rh = new RequestHelper();
	
	private static final long serialVersionUID = 1L;
	
	public FrontController() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String path = request.getServletPath();
		if (path.startsWith("/static/")) {
			super.doGet(request, response);
		} else {
			rh.processGet(request, response);
		}
	}
}
