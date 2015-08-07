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
        <link type="text/css" rel="stylesheet" href="css/pagina_css.css">

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
                        <li><a href="#"><strong>Início</strong></a></li>
                        <li><a href="GerenciarUsuarios?acao=listar"><strong>Usuários</strong></a></li>
                        <li><a href="#"><strong>Gerenciar</strong></a>
                            <ul>
                                <li><a href="GerenciarMateriais?acao=listar"><strong>Material</strong></a></li>
                                <li><a href="GerenciarSala?acao=listar"><strong>Sala</strong></a></li>
                                <li><a href="GerenciarLivros?acao=listar"><strong>Livro</strong></a></li>
                                <li><a href="gerenciarHorario.jsp"><strong>Horários</strong></a></li>

                            </ul>
                        </li>
                        <li class="selected"><a href="#"><strong>Solicitar</strong></a>
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
                        <li><a href="horarios.jsp"><strong>Horários</strong></a></li>
                    </ul>

                </div>
            </div>
            <section id="menu">
                <div id="espaco">
                    <div align="center">
                        <h2 id="a1">Solicitação de materiais</h2>
                    </div>
                    <table border="0">
                        <tr>
                            <td colspan="5" width="0.5%" id="colunatb"></td>
                        </tr>
                        <tr>
                            <td width="44%">

                                <h1>Material de escritório</h1> 

                                <br>
                                <form action="GerenciarMateriais" method="post">
                                    <div id="formm">
                                        <table>
                                            <p id="aviso"><strong><tagsAviso:statusInformarCategoria/></strong></p>

                                            <br>
                                            <tr>
                                                <td>Material:</td>
                                                <td>

                                                    <select name="escritorio">
                                                        <c:forEach var="registroEscritorio" items="${sessaoListaEscritorio}">
                                                            <option value="${registroEscritorio['nome_material']}"> ${registroEscritorio['nome_material']} </option>
                                                        </c:forEach>
                                                    </select>
                                                </td>

                                            </tr>
                                            <tr>
                                                <td>Quantidade:</td>
                                                <td><input type="text" name="quantidade" size="10" required></td>
                                            </tr>
                                            <tr>
                                                <td valign="top">Descrição:</td>
                                                <td><textarea name="descricaoEscritorio" rows="5" cols="30"></textarea></td>
                                            </tr>

                                        </table>
                                        <br>
                                        <div align="center">
                                            <input type="submit" value="Solicitar">
                                            <input type="hidden" name="acao" value="solicitarEscritorio">
                                            <input type="hidden" name="solicitantenomeEscritorio" value="${sessaoUsuario}">
                                            <input type="hidden" name="solicitantematriculaEscritorio" value="${sessaoUsuario2}">
                                            <input type="reset" value="Limpar">
                                        </div>
                                    </div> 
                                </form>



                            </td>
                            <td width="5%">
                            </td>
                            <td width="0.5%" id="colunatb">
                            </td>
                            <td width="5%">
                            </td>

                            <td>

                                <h1>Material para videoaula</h1>
                                <br>
                                <form action="GerenciarMateriais" method="post">
                                    <div id="formm">
                                        <table>
                                            <tr>
                                                <td>Dia:</td>
                                                <td>
                                                    <input type="text" name="dia" required>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>Início:</td>
                                                <td>
                                                    <input type="text" name="inicio" required>
                                                </td>
                                                <td>Término:</td>
                                                <td>
                                                    <input type="text" name="termino" required>
                                                </td>

                                            </tr>
                                            <td valign="top">Descrição:</td>
                                            <td><textarea name="descricaoVideoAula" rows="5" cols="30"></textarea></td>
                                            </tr>

                                        </table>
                                        <br>
                                        <div align="center">
                                            <input type="submit" value="Solicitar">
                                            <input type="hidden" name="acao" value="solicitarVideoAula">
                                            <input type="hidden" name="solicitantenomeVideoAula" value="${sessaoUsuario}">
                                            <input type="hidden" name="solicitantematriculaVideoAula" value="${sessaoUsuario2}">
                                            <input type="reset" value="Limpar">
                                        </div>
                                    </div> 
                                </form>

                            </td>
                        </tr>



                    </table>







                </div>
            </section>

        </section>

    </body>

</html>
