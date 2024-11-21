<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>${success}</h3>

	<form action="update" method="post">
		Email<input type="text" name="email">
		<button type="submit">update</button>
	</form>
</body>
</html>