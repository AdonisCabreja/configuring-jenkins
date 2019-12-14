package com.revature.delegates;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewDelegate {
	
	public void resolveView(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String uri = request.getServletPath();
		
		switch (uri) {
		case "/index":
			request.getRequestDispatcher("/static/Views/index.html").forward(request, response);
		}
	}
}
