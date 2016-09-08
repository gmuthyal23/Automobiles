<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Data</title>
</head>
<style>
div.ex {
	text-align: right width:300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>
<body>
	<h1>Registration Form</h1>
	<div class="ex">
		<form:form method ="POST" action="AddUser" commandName="Signup">
			<table style="with: 50%">
				<tr>
					<td>Name</td>
					<td><form:input type="text" path="name" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password" /></td>
				</tr>
				<tr>
					<td>Mail</td>
					<td><form:input type="text" path="mail" /></td>
				</tr>
				<tr>
					<td>Contact</td>
					<td><form:input type="text" path="contact" /></td>
				</tr>
				<tr>
					<td>address</td>
					<td><form:input type="text" path="address" /></td>
				</tr>
				
			</table>
			<input type="submit" value="register" />
		</form:form>
	</div>
</body>
</html>