package com.app.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RedirectingServlet")
public class RedirectingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RedirectingServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getServletPath());
		// response.sendRedirect(request.getContextPath()+"/HelloServer?username=123");
		// request.getRequestDispatcher("/HelloServer?username=12345").include(request, response);
		request.getRequestDispatcher("/HelloServer?username=12345").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
