

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@tag body-content="empty" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
    
    <c:when test="${mensagem != null}">
        ${mensagem}
    </c:when>
    
</c:choose>