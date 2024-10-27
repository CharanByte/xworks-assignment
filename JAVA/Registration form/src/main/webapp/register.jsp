<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration</title>
</head>
<body>

<h2>${success}</h2>
<h2>${failure}</h2>

<h1>Registration form</h1>
<form action="register" method="post">
<pre>

Name <input type="text" name="name" >
Email<input type="email" name="email" >
Age<input type="number" name="age">
City<select name="city">
<option>Bengaluru</option>
<option>Mysuru</option>
<option>Kolar</option>
<option>KGF</option>
</select>

State<select name="state">
<option>KA</option>
<option>AP</option>
<option>TN</option>
<option>TG</option>

</select>

<input type="submit" value="submit">
</pre>

</form>

</body>
</html>