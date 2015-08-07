<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsAviso" %>
<html>
    <head>
	<title>Bem-vindo ao SigSol</title>
        
    <link type="text/css" rel="stylesheet" href="css/estilo_login.css">    	
	
</head>
<body>
    
<div id="login">
  <div id="triangle"></div>
  
  <h1><img src="imagens/img_index.png" height="100" width="350"/></h1>
  <form id="area" method="POST" action="logar">
      
      <input type="text" autofocus name="matricula" id="matricula" placeholder="Matrícula" maxlength="14" required />
      <input type="password" name="senha" id="senha" placeholder="Senha" required/>
      <input type="hidden" name="acao" value="confirmarLogin"/>
      <p><strong><tagsAviso:statusUsuarioSenha/></strong></p>
      
    <input type="submit" value="Entrar" />
    
  </form>
</div>
    
    
</body>
</html>
