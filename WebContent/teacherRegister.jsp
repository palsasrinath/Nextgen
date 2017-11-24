<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet" />
<link href="css/fancybox/jquery.fancybox.css" rel="stylesheet">
<link href="css/jcarousel.css" rel="stylesheet" />
<link href="css/flexslider.css" rel="stylesheet" />
<link href="css/style.css" rel="stylesheet" /> 
</head>
<body>
<form action="teacherRegister" method="post">
<center><pre><b>
							
	 	<h2 style="color:white;  background-color:#de3b69;">Teacher Registration Form</h2>			 
	
					
  	First Name: <input type="text" name="firstName" id="fName" /><br>
  		<span id="errfName" style="color: red"></span>
  	 Last Name: <input type="text" name="lastName" id="lName" /><br>
  	 		<span id="errlName" style="color: red"></span>
  	     Email: <input type="text" name="email" id="email" /><br>
  	     		<span id="errEmail" style="color: red"></span>
  	  Password: <input type="password" name="password" id="pwd" /><br>
  	  		<span id="errPwd" style="color: red"></span>
  	  Conform Password: <input type="password" name="conformpassword" id="cpwd" /><br>
  	  		<span id="errPwd" style="color: red"></span>
  	  MobileNumber:  <input type="text" name="mobile" id="mobile" /><br>
  	  		<span id="errPwd" style="color: red"></span>
    Gender:Male<input type="radio" name="gender" id="gender" size="20" />Female<input
								type="radio" name="gender" id="gender" size="20" /><br>
   			<span id="errGender" style="color: red"></span>
   	Address:<input type="text" name="address" id="add" /><br>
  	  		<span id="errPwd" style="color: red"></span>
  	 Qualification:<select name="qualification" id="qualification"><option>BTECH</option>
                       <option>MTECH</option>
                       <option>MSC</option>
                       <option>other</option>
                      </select><br>
  	City:<select name="city" id="city"><option>Hyderabad</option>
                       <option>Bangalore</option>
                       <option>Pune</option>
                       <option>other</option>
                      </select><br>
               	<span id="errDesignation" style="color: red"></span>	
   State:<select name="state" id="state"><option>Telangana</option>
                       <option>AndhraPradhesh</option>
                       <option>Karnataka</option>
                       <option>other</option>
                      </select><br>
               	<span id="errDesignation" style="color: red"></span>	
               		    		                           	
 <div class="button-click">
		<button type="submit" class="button-cls" style="color: white">Register Now</button>
								</div>
    </b></pre></center>
				</form>

</body>
</html>