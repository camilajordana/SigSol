<%-- 
    Document   : InicioProfessor
    Created on : 31/08/2014, 17:17:24
    Author     : maryna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsUsuario" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Olá, <tagsUsuario:UsuarioLogado/>.<br>
        <a href="Sair">Sair</a>
    </body>
</html>
