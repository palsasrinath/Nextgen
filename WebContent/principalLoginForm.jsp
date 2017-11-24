<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/principalLoginForm.css">
<title>Insert title here</title>
</head>
<body>
<center>
	<div class="header">
			<h2>Welcome To Principal</h2>
	</div><br><br>
	<form action="principalLoginServlet" method="Get">
			<h3>Principal Login Form</h3><br>
			Email:<input type="text" name="Email" placeholder="Email"><br><br>
			Password:<input type="password" name="Password" placeholder="Password"><br><br>
			<input type="Submit" value="submit">
	</form><br><br>
<div class="footer">
		<h2>All Rights Reserved To MKtechno</h2>
	</div>
	</center>
</body>
</html>