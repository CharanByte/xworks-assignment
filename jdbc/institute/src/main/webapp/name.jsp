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
<h3>${failure}</h3>
<form action="search" method="post">
phone number<input type="text" name="phone">
<button type="submit">search</button>
</form>

</body>
</html>