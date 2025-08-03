<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
	<form action="reg" method="post">
	Name: <input type="text" name="name"><br><br>
	Email: <input type="text" name="email"><br><br>
	Password: <input type="password" name="pass"><br><br>
	Gender: <input type="radio" name="gender" value="Male"> Male <input type="radio" name="gender" value="Female"> Female<br><br>
	City: <select name="city">
		<option>Pune</option>
		<option>Mumbai</option>
		<option>Delhi</option>
		<option>Kolkata</option>
		<option>Chennai</option>
	</select><br><br>
	<input type="submit" value="register">
	</form>

</body>
</html>