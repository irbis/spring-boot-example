<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body onLoad="document.getElementById('f').username.focus();">

<c:if test="${param.logout ne null}">
	<p>You have successfully logout!</p>
</c:if>
<c:if test="${param.error ne null}">
	<p>Username or password is incorrect!</p>
</c:if>

<form id="f" name="form" action="<c:url value='/login'/>" method="POST">
	<fieldset>
			Username: <input type="text" name="username" value="" /><br/>
			Password: <input type="password" name="password"/><br/>
	</fieldset>
	<input type="submit" id="login" value="login"/>
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>

</body>
</html>