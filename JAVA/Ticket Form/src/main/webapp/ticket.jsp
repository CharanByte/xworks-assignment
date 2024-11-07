<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<style type="text/css">
h1{

}
</style>

</head>
<body>
<center><h1>Ticket Booking</h1></center>
<h3 style="color: green">${success}</h3>
<h3 style="color: red">${failure}</h3>
<form action="ticket" method="post">

<labe1>Ticket Name</labe1>
<select class="form-select" aria-label="Default select example" name="name" value="${dto.ticketName}">
  <option selected>select ..</option>
  <option value="1">Cricket</option>
  <option value="2">Hockey</option>
  <option value="3">FootBall</option>
</select>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">TicketsNo</label>
  <input type="number" class="form-control" id="exampleFormControlInput1" placeholder="Enter No of tickets" name="ticket" value="${dto.ticketNo}"/>
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Primary Contact</label>
  <input type="number" class="form-control" id="exampleFormControlInput1" placeholder="Enter Primary Contac" name="contact" value="${dto.contact}"/>
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Email</label>
  <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="Enter Your Email" name="email" value="${dto.email}"/>
</div>

<div class="d-grid gap-2 d-md-block">
  <input type="submit" value="submit">
  
</div>




</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>