<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	${SPRING_SECURITY_LAST_EXCEPTION.message}
<body>
	<form action="/login" method="post">
	<input type="text" name="username">
	<br>
	<input type="text" name="password">
	<br>
	<input type="submit" name="Login">
	
	</form>
</body>
</html>