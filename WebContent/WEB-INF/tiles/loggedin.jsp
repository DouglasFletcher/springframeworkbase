<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach var="users" items="${users}">

	user:  <c:out value="${users}"/><p>

</c:forEach>

