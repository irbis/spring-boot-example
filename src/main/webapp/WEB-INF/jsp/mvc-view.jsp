<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MVC example</title>
</head>
<body>

<form action="<c:url value='/logout'/>" method="POST" id="logoutForm">
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>

Welcome : ${pageContext.request.userPrincipal.name} | <a href="javascript:formSubmit()">Logout</a>
<hr/>
${message}
</body>
<script type="text/javascript">
	function formSubmit() {
		document.getElementById("logoutForm").submit();
	}
</script>
</html>