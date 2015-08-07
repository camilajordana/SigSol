<%-- 
    Document   : relatorio
    Created on : 24/01/2015, 02:46:14
    Author     : maryna
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link type="text/css" rel="stylesheet" href="css/relatorio.css">
        
        <title>SigSol</title>
    </head>
    <body>
        <div align="center">
        <table width="50%" border="0">
            <tr>
                <td colspan="2">
                    <div align="right">
                    <img src="imagens/ifrn_2.png">
                    </div>
                </td>
                <td colspan="3">
                    <div align="center" class="titulo">
                        
                        <strong>
                    Instituto Federal de Educação, Ciência e Tecnologia do </br>
                    Rio Grande do Norte
                    
                    </strong>
                        
                    
                        </br>
                       <i> Campus </i>João Câmara
                       
                    </div>
                </td>
                
            </tr>
            <tr>
                
                <td colspan="6" class="t1">
                    <br><br><br>
                    <p align="center">
                    Relatório - Materiais de Escritório
                    </p>
                </td>
                
            </tr>
            <c:forEach var="registroMateriais" items="${sessaoListaMateriais}">
            <tr>
                <td class="t2" align="center" width="20%">
                    <strong>
                    ${registroMateriais['escritorio']}
                    </strong>
                </td>
                <td class="t2" align="center" width="20%">
                    <strong>
                    ${registroMateriais['solicitantenomeEscritorio']}
                    </strong>
                </td>
                <td class="t2" align="center" width="15%">
                    <strong>
                    ${registroMateriais['solicitantematriculaEscritorio']}
                    </strong>
                </td>
                <td class="t2" align="center">
                    <strong>
                    ${registroMateriais['quantidadeEscritorio']}
                    </strong>
                </td>
                <td class="t2" align="center" width="30%">
                    <strong>
                    ${registroMateriais['descricaoEscritorio']}
                    </strong>
                </td>
                <td class="t2" align="center" width="50%">
                    <strong>
                    ${registroMateriais['status']}
                    </strong>
                </td>
                
            </tr>
            </c:forEach>
            
        </table>
            </div>
    </body>
</html>
