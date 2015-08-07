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
        <link type="text/css" rel="stylesheet" href="css/folha_de_estilo.css">


    </head>

    <body id="home" class="big">
        <section id="section">
            <p id="tel">
                <strong> <tagsUsuario:UsuarioLogado/></strong>

            </p>
            <p id="tel">
                <br>
                <a href="alterarSenha.jsp" id="tt">Alterar senha</a> | <a href="Sair" id="tt">Sair</a>

            </p>

            <br>

            <section id="wrapper2">
                <div id="imagensLogo" align="center"> <img id="logo" alt="Sistema de Gerenciamento de Solicitações" align="center" src="imagens/cccaaaa.png" width="800" height="150"></div>
            </section>

            <div id="wrapper">
                <div id="navMenu">

                   <ul id="c">
                        <li  class="selected"><a href="#"><strong>Início</strong></a></li>
                        <li><a href="GerenciarUsuarios?acao=listar"><strong>Usuários</strong></a></li>
                        <li><a href="#"><strong>Gerenciar</strong></a>
                            <ul>
                                <li><a href="GerenciarMateriais?acao=listar"><strong>Material</strong></a></li>
                                <li><a href="GerenciarSala?acao=listar"><strong>Sala</strong></a></li>
                                <li><a href="GerenciarLivros?acao=listar"><strong>Livro</strong></a></li>
                                <li><a href="gerenciarHorario.jsp"><strong>Horários</strong></a></li>

                            </ul>
                        </li>
                        <li><a href="#"><strong>Solicitar</strong></a>
                            <ul>
                                <li><a href="GerenciarMateriais?acao=listar2"><strong>Material</strong></a></li>
                                <li><a href="GerenciarSala?acao=listar2"><strong>Sala</strong></a></li>
                                <li><a href="GerenciarLivros?acao=listar2"><strong>Livro</strong></a></li>
                                <li><a href="objetos.jsp"><strong>Objetos perdidos</strong></a></li>
                                <li><a href="solicitarlimpeza.jsp"><strong>Limpeza</strong></a></li>

                            </ul>
                        </li>

                        <li><a href="#"><strong>Solicitações</strong></a>
                            <ul>
                                <li><a href="GerenciarMateriais?acao=listar3"><strong>Material escritório</strong></a></li>
                                <li><a href="GerenciarMateriais?acao=listar4"><strong>Material videoaula</strong></a></li>
                                <li><a href="GerenciarSala?acao=listando"><strong>Salas</strong></a></li>
                                <li><a href="GerenciarLivros?acao=listar4"><strong>Livros</strong></a></li>
                                <li><a href="GerenciarObjetosPerdidos?acao=listar4"><strong>Objetos perdidos</strong></a></li>
                                <li><a href="GerenciarLimpeza?acao=listar4"><strong>Limpeza</strong></a></li>


                            </ul>
                        </li>
                        <li><a href="minhasSolicitacoes.jsp"><strong>Minhas solicitações</strong></a></li>
                        <li><a href="horarios.jsp"><strong>Horários</strong></a></li>
                    </ul>


                </div>
            </div>
            <section id="menu">
                <div id="espaco">


                    <table border="0">
                        <tr>
                            <td  colspan="4" align="center">
                                <h2 id="a1">Solicitação de salas</h2>
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
                                <form method="post" action="GerenciarSala">
                                    <div id="formm">
                                        <table>
                                            <p id="aviso"><strong><tagsAviso:statusInformarCategoria/></strong></p>

                                            <br>
                                            <tr>

                                                <td>Sala:</td>
                                                <td>
                                                    <select name="sala">
                                                        <c:forEach var="registroSala" items="${sessaoListaSala}">
                                                            <option value="${registroSala['nome']}"> ${registroSala['nome']} </option>
                                                        </c:forEach>
                                                    </select>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>Dia:</td>
                                                <td><input type="text" size="28" name="dia" required></td>
                                            </tr>
                                            <tr>
                                                <td>Início:</td>
                                                <td><input type="text" name="inicio" size="28" required></td>
                                                <td>Término:</td>
                                                <td><input type="text" name="termino" size="28" required></td>
                                            </tr>
                                            <tr>
                                                <td valign="top">Descrição:</td>
                                                <td colspan="3"> <textarea name="descricao" rows="3" cols="68"></textarea></td>
                                            </tr>

                                        </table>
                                        <br>


                                        <div align="center">
                                            <input type="hidden" name="acao" value="solicitar">
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
