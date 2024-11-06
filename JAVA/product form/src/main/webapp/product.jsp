<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Form</title>
</head>
<body>
	<h1>Product Form</h1>
	<form action="product" method="post">
		<pre>
Company Name<input type="text" name="companyName">
Product Name<input type="text" name="productName">
Product Type<select name="type">
<option>select</option>
<option>Electronics</option>
<option>Furniture</option>
<option>Furniture</option>
<option>Health & Beauty</option>

</select>
Product Quantity<input type="number" name="productQuantiy">
Product Cost<input type="number" name="productCost">

<input type="submit" value="Search">
</pre>

	</form>
</body>
</html>
