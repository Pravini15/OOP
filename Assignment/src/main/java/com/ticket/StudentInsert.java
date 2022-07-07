package com.ticket;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/StudentInsert")
public class StudentInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String regNo = request.getParameter("regno");
		String faculty = request.getParameter("faculty");
		String phone = request.getParameter("phone");
		String type = request.getParameter("type");
		String subject = request.getParameter("subject");
		String msg = request.getParameter("message");
		
		
		boolean isTrue;
		
		isTrue = TicketDBUtil.studentInsert(name,email,regNo,faculty,phone,type,subject,msg);
		
		if(isTrue==true)
		{
			RequestDispatcher dis = request.getRequestDispatcher("TicketSuccess.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("TicketFailed.jsp");
			dis2.forward(request, response);
		}
	}

}
