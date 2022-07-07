<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
     body{
	
	height: 100vh;
    justify-content: center;
	align-items: center;
	background: linear-gradient(135deg, #71b7e6, #9b59b6);
	background-image: url("https://i.pinimg.com/originals/a5/59/6f/a5596ffd4897b35688d3b3b882d7919d.jpg");
	padding:10px;
}
.box{
  
  width: 300px;
  height: 350px;
  padding: 15px;
  background-color: #98cb85;
  box-shadow: 10px 10px 5px #596467;
  align-items: center;
  top: 80px;
  border-radius: center;
  border-radius: 12px;
  border: 2px solid #366473;
}

.container {
    display: flex;
    flex-direction: row;
    align-items: flex-start;
    justify-content: space-evenly;
}


.button{
    background-color: #338fbd;
    display: block;
    text-align: center;
    border-radius: center;
    border-radius: 12px;
    border: 2px solid #366473;
    padding: 7px 15px;
    outline: none;
    color: white;
    cursor: pointer;
    transition: 0.25px;
    text-decoration: none;
    

}
.button:hover {
	cursor: pointer;
	background: #9b59b6
}
</style>
</head>



<body>


    <% 
   String id = request.getParameter("id");
   String subject = request.getParameter("subject");
   String message = request.getParameter("message");
   String answer = request.getParameter("answer");
   %>
   
  <center><br><br><br><br><br><br>
  
   <div class="box">
   
    <h1>Reply ticket</h1>
    <form action="updateans" method="post">
       <table>
        <tr>   
           <td>
                Ticket ID
           </td>
           <td>
                <input type="text" name="id" value="<%= id%>" readonly><br><br>
           </td>          
        </tr>
        <tr>
            <td>
                 Subject 
            </td>
            <td>
                 <input type="text" name="subject" value="<%= subject%>" readonly><br><br>
            </td>
        </tr>
        <tr>
            <td>
                  Message 
            </td>
            <td>
                  <input type="text" name="message" value="<%= message%>" readonly><br><br>
            </td>
        </tr>
        <tr>
             <td>
                  Answer 
             </td>
             <td>
                  <input type="textarea" name="answer" value="<%= answer%>" ><br><br>
             </td>
        </tr>
        </table><br><br>
        <input type="submit"  class="button" name="submit" value="Reply">
        
    </form>
    </div>
    </center>
    
</body>
</html>