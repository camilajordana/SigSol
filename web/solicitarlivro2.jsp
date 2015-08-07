<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsUsuario" %>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsAviso" %>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsAviso2" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SigSol</title>
        <link type="text/css" rel="stylesheet" href="css/folha_de_estilo_aluno.css">
    </head>
    <body id="home" class="big">
        <section id="section">
            <p id="tel">
                <strong> <tagsUsuario:UsuarioLogado/></strong>
          <a href="Sair" id="tt">(Sair)</a>
            </p>
            <br>

            <section id="wrapper2">
                <div id="imagensLogo" align="center"> <img id="logo" alt="Sistema de Gerenciamento de Solicitações" align="center" src="imagens/cccaaaa.png" width="800" height="150"></div>
            </section>

            <div id="wrapper">
                <div id="navMenu">

                    <ul id="c">
                        
                        <li  class="selected"><a href="#"><strong>Início</strong></a>
                        <li><a href="#"><strong>Solicitar</strong></a>
                            <ul>
                                <li><a href="GerenciarMateriais?acao=listarAluno"><strong>Material</strong></a></li>
                                <li><a href="GerenciarSala?acao=listarSala"><strong>Sala</strong></a></li>
                                <li><a href="#"><strong>Livro</strong></a></li>
                                <li><a href="#"><strong>Objetos perdidos</strong></a></li>
                                <li><a href="#"><strong>Limpeza</strong></a></li>
                            </ul>
                        </li>
                        <li><a href="horarios.jsp"><strong>Horários</strong></a></li>
                        <li><a href="#"><strong>Minhas solicitações</strong></a></li>
                        
                    </ul>


                </div>
            </div>
            <section id="menu">
                <div id="espaco">


                    <table border="0">
                        <tr>
                            <td  colspan="4" align="center">
                                <h2 id="a1">Solicitação de livros</h2>
                            </td>

                        </tr>
                        <tr>
                            <td width="0.5%" colspan="3" id="colunatb">

                            </td>
                        </tr>
                        <tr>
                            <td width="50%"></td>
                            <td>
                                <br>
                                <form method="post" action="GerenciarLivros">
                                    <div id="formm">
                                        <table>
                                            <p id="aviso"><strong><tagsAviso:statusInformarCategoria/></strong></p>

                                            <br>
                                            <tr>

                                                <td>Livro:</td>
                                                <td>
                                                    <select name="livro">
                                                        <c:forEach var="registroLivro" items="${sessaoListaLivro}">
                                                            <option value="${registroLivro['nome']}"> ${registroLivro['nome']} </option>
                                                        </c:forEach>
                                                    </select>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>Quantidade:</td>
                                                <td><input type="text" size="10" name="quantidade" required></td>
                                            </tr>
                                            <tr>
                                                <td valign="top">Descrição:</td>
                                                <td colspan="3"> <textarea name="descricao" rows="3" cols="50"></textarea></td>
                                            </tr>

                                        </table>
                                        <br>
                                        
                                        
                                        <div align="center">
                                            <input type="hidden" name="acao" value="solicitar2">
                                            <input type="hidden" name="solicitantenome" value="${sessaoUsuario}">
                                            <input type="hidden" name="solicitantematricula" value="${sessaoUsuario2}">
                                            <input type="submit" value="Solicitar">
                                            <input type="reset" value="Limpar">
                                        </div>
                                    </div> 
                                </form>






                            </td>
                            <td width="60%">

                            </td>

                        </tr>

                    </table>  





                </div>
            </section>

        </section>
    </body>

</html>

