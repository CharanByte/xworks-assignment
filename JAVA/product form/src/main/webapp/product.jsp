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
	<h3 style="color:green">${success}</h3>
    <h3 style="color:red">${failure}</h3>
	<form action="product" method="post">
		<pre>
Company Name<input type="text" name="companyName" value="${dto.companyName}">
Product Name<input type="text" name="productName" value="${dto.productName}">
Product Type<select name="type" value="${dto.productType}">
<option>select</option>
<option>Electronics</option>
<option>Furniture</option>
<option>Furniture</option>
<option>Health & Beauty</option>

</select>
Product Quantity<input type="number" name="productQuantiy" value="${dto.productQuantiy}">
Product Cost<input type="number" name="productCost" value="${dto.productCost}">

<input type="submit" value="Search">
</pre>

	</form>
</body>
</html>
