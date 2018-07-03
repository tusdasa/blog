<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Login</title>
<style type="text/css">
*{
	padding: 0px;
	margin: 0px
}

.form{
	width: 300px;
	height: 400px;
	margin: 400px auto 0px auto;
}
.input{
	width: 300px;
	height: 30px;
}

.button{
	width: 300px;
	height: 50px;
}
</style>
</head>
<body>
<div class="form">
<form action="Login" method="post">
<input type="text" name="AccessKey" placeholder="AccessKey" class="input">
<input type="password" name="Secret" placeholder="SecretKey" class="input">
<input type="password" name="Number" placeholder="Number" class="input">
<input type="submit" class="button">

</form>
</div>

</body>
</html>