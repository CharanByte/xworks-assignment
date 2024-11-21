<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
<h3>${success}</h3>
<h3>${failure}</h3>
<form action="list" method="post">
Id<input type="text" name="id">
<button type="Get">search</button>
</form>
</body>
</html>