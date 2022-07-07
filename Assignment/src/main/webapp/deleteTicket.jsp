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
  height: 530px;
  padding: 15px;
  background-color: #98cb85;
  box-shadow: 10px 10px 5px #596467;
  align-items: center;
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
    padding: 7px 13px;
    outline: none;
    color: white;
    cursor: pointer;
    transition: 0.25px;
    text-decoration: none;
    top: 80px;
   

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
   
   
      <center><br><br>
      <div class="box">
      <h1>Remove Ticket</h1>
     
    
      <form action="remove" method="post">
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
                 Student Name
             </td>
             <td>
                 <input type="text" name="name" value="<%= name%>" readonly><br><br>
            </td>        
         </tr>
         <tr>   
             <td>
                 Student email 
             </td>
             <td>
                 <input type="text" name="email" value="<%= email%>" readonly><br><br>
             </td>        
        </tr>
         <tr>  
             <td> 
                  Registration number 
             </td>     
             <td>
                  <input type="text" name="regNo" value="<%= regNo%>" readonly><br><br>
             </td>         
        </tr>
         <tr>   
             <td>
                  Faculty 
             </td>
             <td>     
                  <input type="text" name="faculty" value="<%= faculty%>" readonly><br><br>
             </td>          
        </tr>
         <tr>   
             <td>
                   Contact-number
             </td>
             <tD>
                   <input type="text" name="id" value="<%= phone%>" readonly><br><br>
             </tD>         
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
                   <input type="text" name="answer" value="<%= answer%>" readonly><br><br>
             </td>
        </tr>
        </table>
        <input type="submit"  class="button"  name="submit" value="confirm delete">
        
    </form>
    </div>
    </center>
</body>
</html>