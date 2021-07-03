<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring boot MVC</title>
</head>
<body>
<h2 align='center'>-----Spring Boot CRUD Operations-----</h2>
<div id="addingcandidates" style="border: 1px solid green;">
<form action="addCandidate" style="align:center;">
<h4>ADD Details</h4>
<table style="align:center;">
<tr>
<td>User Id:</td>
<td><input type="text" name="id" ></td>
</tr>
<tr>
<td>Name:</td>
<td><input type="text" name="name" ></td>
</tr>
<tr>
<td>Address:</td>
<td><input type="text" name="address" ></td>
</tr>
<tr>
<td>Gender:</td>
<td><input type="text" name="gender" ></td>
</tr>
<tr>
<td><input type="submit" name="Add" value="Add"></td>
</tr>
</table>

</form>
</div>
<br>
<div style="border: 1px solid blue;">
<a href="products" style="align:center;">Show Candidates</a>
</div>
<div>
<form action="products/${param.id}"> 
<input type="text" name="id">
<input type="submit" value="Find">
</form>
</div>

<div id="updatingcandidates" style="border: 1px solid red;">
<form action="update" style="align:center;">
<h4>ADD Details</h4>
<table style="align:center;">
<tr>
<td>User Id:</td>
<td><input type="text" name="id" ></td>
</tr>
<tr>
<td>Name:</td>
<td><input type="text" name="name" ></td>
</tr>
<tr>
<td>Address:</td>
<td><input type="text" name="address" ></td>
</tr>
<tr>
<td>Gender:</td>
<td><input type="text" name="gender" ></td>
</tr>
<tr>
<td><input type="submit" name="Add" value="Add"></td>
</tr>
</table>

</form>
</div>
<div>
<form action="removeCandidate/${param.id}"> 
<input type="text" name="id">
<input type="submit" value="Delete">
</form>
</div>


</body>
</html>