package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.delegates.ViewDelegate;

public class RequestHelper {
	
	private ViewDelegate vDel = new ViewDelegate();

	public RequestHelper() {
		super();
	}
	
	public void processGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		vDel.resolveView(request, response);
	}
}
