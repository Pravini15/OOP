<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import = "java.sql.Connection" %>
<%@page import = "java.sql.DriverManager" %>
<%@page import = "java.sql.Statement" %>
<%@page import = "java.sql.ResultSet" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
     <link href="CSS/view.css" rel="stylesheet"  type="text/css"/>
</head>
<body>
     
     <h1><center>Tickets</center></h1>
     <br><br>
     <div class ="container">
    <%
    
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    String driver = "com.mysql.jdbc.Driver";
    String url ="jdbc:mysql://localhost:3308/ticket";
    String userName = "root";
    String password = "gOoglelk50";

    try{
    Class.forName(driver);
    }catch(Exception e) {
    e.printStackTrace();
    }

    con = DriverManager.getConnection(url, userName, password);
    stmt = con.createStatement();

    String sql = "Select * from ticket";
    
    rs = stmt.executeQuery(sql);
    
    while(rs.next()){
    
 
    %>
    <div class="box">
    
    <br>
    <table>
    <tr>
		<td>Ticket ID</td>
		<td><%=rs.getString(1)%></td>
	</tr>
	<tr>
		<td>Student Name</td>
		<td><%=rs.getString(2)%></td>
	</tr>
	<tr>
		<td>Student Email</td>
		<td><%=rs.getString(3)%></td>
	</tr>
	<tr>
		<td>Registration number</td>
		<td><%=rs.getString(4)%>}</td>
	</tr>
	<tr>
		<td>Faculty</td>
		<td><%=rs.getString(5)%></td>
	</tr>
	<tr>
		<td>Contact number</td>
		<td><%=rs.getString(6)%></td>
	</tr>
	<tr>
		<td>Request type</td>
		<td><%=rs.getString(7)%></td>
	</tr>
	<tr>
		<td>Subject</td>
		<td><%=rs.getString(8)%></td>
	</tr>
	<tr>
		<td>Message</td>
		<td><%=rs.getString(9)%></td>
	</tr>
		
    </table>
	
    <br>
    
    <c:set var="id" value ="<%=rs.getString(1) %>"/>
    <c:set var="subject" value ="<%=rs.getString(8) %>"/>
    <c:set var="message" value ="<%=rs.getString(9) %>"/>
    <c:set var="answer" value ="<%=rs.getString(10) %>"/>

    
    
    
    
    
   
 
	
	<c:url value="ticketView.jsp" var="view">
	    <c:param name="id" value="${id}"/>
	    <c:param name="subject" value="${subject}"/>
	    <c:param name="message" value="${message}"/>
	    <c:param name="answer" value="${answer}"/>
	    
	    
	</c:url>
	<a href="${view}">
	<input type="button" class="button" name="update"  value="Reply">
	</a>
	
	
	<c:set var="id" value ="<%=rs.getString(1) %>"/>
	<c:set var="name" value ="<%=rs.getString(2) %>"/>
    <c:set var="email" value ="<%=rs.getString(3) %>"/>
    <c:set var="regno" value ="<%=rs.getString(4) %>"/>
    <c:set var="faculty" value ="<%=rs.getString(5) %>"/>
    <c:set var="phone" value ="<%=rs.getString(6) %>"/>
    <c:set var="rtype" value ="<%=rs.getString(7) %>"/>
    <c:set var="subject" value ="<%=rs.getString(8) %>"/>
    <c:set var="message" value ="<%=rs.getString(9) %>"/>
    <c:set var="answer" value ="<%=rs.getString(10) %>"/>
	
	<c:url value="deleteTicket.jsp" var="delete">
	    <c:param name="id" value="${id}"/>
	    <c:param name="name" value="${name}"/>
	    <c:param name="email" value="${email}"/>
	    <c:param name="regno" value="${regno}"/>
	    <c:param name="faculty" value="${faculty}"/>
	    <c:param name="phone" value="${phone}"/>
	    <c:param name="rtype" value="${type}"/>
	    <c:param name="subject" value="${subject}"/>
	    <c:param name="message" value="${message}"/>
	    <c:param name="answer" value="${answer}"/>
	 
	 </c:url>
	 

	<a href="${delete}">
	<input type="button" class="button" name="remove"  value="Remove">
	</a>
	
	</div>
	
	<br><br>
	<% }%>
	</div>
	
</body>
</html>