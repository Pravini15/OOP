package com.ticket;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateAnswerServlet")

public class UpdateAnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String id = request.getParameter("id");
		String sub = request.getParameter("subject");
		String msg = request.getParameter("message");
		String ans = request.getParameter("answer");
		
		int conID =Integer.parseInt(id);
		boolean isTrue;
		
		isTrue = TicketDBUtil.updateAnswer(id, ans);
		
		if(isTrue==true) {
			RequestDispatcher dis = request.getRequestDispatcher("successUpdate.jsp");
			dis.forward(request, response);
			
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("failedUpdate.jsp");
			dis.forward(request, response);			
		}
	}

}
