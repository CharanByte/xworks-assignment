<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Login</title>
</head>
<body>
<h1>Ticket Booking</h1>
<h3 style="color: green">${success}</h3>
<h3 style="color: red">${failure}</h3>
<form action="ticket" method="post">
<pre>
Ticket Name<select name="name" value="${dto.ticketName}"/>
<option>select</option>
<option>Cricket</option>
<option>FootBall</option>
<option>Hockey</option>
<option>Kabaddi</option>
</select>
Tickets<input type="number" name="ticket" value="${dto.ticketNo}"/>
Primary Contact<input type="number" name="contact" value="${dto.contact}"/>
Email<input type="email" name="email" value="${dto.email}"/>
<input type="submit" value="Book">

</pre>


</form>
</body>
</html>