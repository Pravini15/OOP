<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Help Desk</title>
   <link href="CSS/ticketstyles.css" rel="stylesheet"  type="text/css"/>
</head>
<body>

    
    <div class="container">
    <br><br>
    
    
	    
	<form action="insert" method="post">
	    
	    <div class="box">
	    
	     <h2><div class="title"><center>Student Support</center></div></h2>

	    <h4>Please complete this form.You will get a reply by email as soon as possible.</h4><br>
		
		
		    <div class="user-details">
		   <table>
		   
		   <tr>
		   <div class="input-box">
		         <spam class="details">Name</spam>
		         <input type= "text" placeholder="Name" name="name" required>
		     </div>
		     
		     
		     <div class="input-box">
		         <spam class="details">Email</spam>
		         <input type= "text" placeholder="Email" name="email" required>   
		     </div></tr>
		     <tr>
		     <div class="input-box">
		         <spam class="details">Registration Number</spam>
		         <input type= "text" placeholder="Registration no" name="regno" required>
		     </div>
		     <div class="input-box">
		         <spam class="details">Faculty</spam>
		         <div class="select">
		         <select name="faculty">
		           <option selected disabled>Choose</option>
		           <option>Faculty of Computing</option>
		           <option>Faculty Of Engineering</option>
		           <option>Faculty of Humanities & Sciences</option>
		           <option>School of Architecture</option>
		           <option>School of Bussiness</option>
		         </select>
		         </div>
		     </div></tr>
		     <tr>
		     <div class="input-box">
		         <spam class="details">Contact number</spam>
		         <input type= "text" placeholder="contact no" name="phone">
		     </div>
		     <div class="input-box">
		     
		         <spam class="details">Request-type</spam>
		         <div class="select">
		         <select name="type">
		           <option selected disabled>choose</option>
		           <option>Question about registration</option>
		           <option>Question about examinations</option>
		           <option>Submit industrial training inquiry</option>
		           <option>Issue about GPA calculation</option>
		           <option>Other</option>
		         </select>
		         </div>
		     </div>
		     </tr>
		     <tr>
		     <div class="input-box">
		         <spam class="details">Subject</spam>
		         <input type= "text" placeholder="subject" name="subject" required>
		     </div>
		     </tr>
              <tr>
              <div class="input-bo">
		         <spam class="details">Message</spam>
		         <textarea rows="5" col="100" placeholder="type here.."  name="message"></textarea>
		        
		      </div>
		      </tr>
		        <br>
		        
		    </div>
		    </table>
	        <br><br><br>
		<input type="submit" class="button" name="submit" value="Submit">
		
		</div>
		</div>
		
	</form>
	
</body>
</html>