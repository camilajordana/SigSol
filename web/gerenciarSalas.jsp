<%-- 
    Document   : gerenciarSalas
    Created on : 02/12/2014, 02:59:32
    Author     : maryna
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsUsuario" %>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsAviso" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SigSol</title>
        <link type="text/css" rel="stylesheet" href="css/pagina_css.css">
        
        <link type="text/css" rel="stylesheet" href="css/estilo_tabela.css">
        
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
                        <li class="selected"><a href="#"><strong>Gerenciar</strong></a>
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
                        <li><a href="horarios.jsp"><strong>Horários</strong></a></li>
                    </ul>



                </div>
            </div>
            <section id="menu">
                <div id="espaco">
                    <table border="0">
                        <tr>
                            <td  colspan="4" align="center">
                                <h2 id="a1">Gerenciar salas</h2>
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
                                            <div align="center">
                                                    <h1>Cadastrar sala</h1> 
                                                <div>
                                            
                                            <tr>
                                                <td>Nome: </td>
                                                <td>
                                                    <input type="text" required size="40" name="nome">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                     <p id="aviso"><strong><tagsAviso:statusInformarCategoria/></strong></p>
                                                </td>
                                            </tr>
                                        </table>
                                        <br>
                                        <div align="center">
                                            <input type="hidden" name="acao" value="confirmarCadastro"/>
                                            <input type="submit" value="Cadastrar">
                                            <input type="reset" value="Limpar">
                                        </div>
                                    </div> 
                                </form>






                            </td>
                            <td width="60%">

                            </td>

                        </tr>
                        <tr>
                            <td colspan="3">
                                <div align="center">
                                    <br>
                                    <table border="0" width="50%" class="CSSTableGenerator">
                                        
                                        <tr>
                                            <td>
                                                Nome
                                            </td>
                                            <td colspan="2">
                                                Ação
                                            </td>
                                        </tr>
                                        <c:forEach var="registroSala" items="${sessaoListaSala}">
                                            <tr>
                                                <td>
                                                    ${registroSala['nome']}
                                                </td>
                                                <td width="5%">
                                        <a href="alteraSala.jsp?idsala=${registroSala['idsala']}&nome=${registroSala['nome']}"> <img src="imagens/editar.png" width="20" height="20" alt="editar"></a>
                                    </td>
                                    <td width="5%">
                                        <a href="GerenciarSala?acao=excluir&idsala=${registroSala['idsala']}"><img src="imagens/delete.png" width="20" height="20" alt="deletar"/></a>
                                    </td>
                                            </tr>
                                        </c:forEach>
                                        
                                    </table>
                                </div>
                            </td>
                        </tr>

                    </table>


                </div>
            </section>

        </section>

    </body>

</html>
