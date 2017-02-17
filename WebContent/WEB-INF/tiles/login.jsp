
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<title>Login Page</title>
	<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css">
</head>
<body onload='document.f.j_username.focus();'>
	<h3>Hello Natasha: create new account & login in</h3>
	
	<c:if test="${param.error != null}">
	
		<p class="error">Login Failed. Check username and password are correct.</p>
		
	</c:if>
	
	
	<form name='f' action='${pageContext.request.contextPath}/j_spring_security_check' method='POST'>
		
		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='j_username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='j_password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Login" /></td>
			</tr>
		</table>
		
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" 
		/>
	
	</form>

	<p><a href="<c:url value="/newaccount"/>">Create New Account</a></p>
</body>
</html>