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
<form action="login" method="post">
<pre>
User ID<input type="text" name="user" value="${dto.userName}"/>
Email<input type="email" name="email" value="${dto.email}"/>
Password<input type="password" name="password">
Conform Password<input type="password" name="conformpassword">
<input type="submit" value="Signup">
</pre>
</form>

</body>
</html>