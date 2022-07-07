<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


 <% 
   String id = request.getParameter("id");
   String name = request.getParameter("name");
   String email = request.getParameter("email");
   String regNo = request.getParameter("regno");
   String faculty = request.getParameter("faculty");
   String phone = request.getParameter("phone");
   String type = request.getParameter("rtype");
   String subject = request.getParameter("subject");
   String message = request.getParameter("message");
   String answer = request.getParameter("answer");
%>
   <form action="updateans" method="post">
       
       Answer 
       <textarea rows="5" col="15" placeholder="type here.." name="answer" value="<%= answer%>"></textarea>
   </form>
   
   
</body>
</html>