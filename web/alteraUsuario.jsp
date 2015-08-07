<%-- 
    Document   : alteraUsuario
    Created on : 02/09/2014, 02:30:08
    Author     : maryna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsUsuario" %>
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

                <a href="Sair" id="tt">(Sair)</a>
            </p>
            <br>

            <section id="wrapper2">
                <div id="imagensLogo" align="center"> <img id="logo" alt="Sistema de Gerenciamento de Solicitações" align="center" src="imagens/cccaaaa.png" width="800" height="150"></div>
            </section>

            <div id="wrapper">
                <div id="navMenu">
                    <ul id="c">

                        <li><a href="InicioAdm.jsp"><strong>Início</strong></a>
                        <li class="selected"><a href="GerenciarUsuarios?acao=listar"><strong>Usuários</strong></a></li>
                        <li><a href="#"><strong>Solicitar</strong></a>
                            <ul>
                                <li><a href="GerenciarMateriais?acao=listar"><strong>Material</strong></a></li>
                                <li><a href="#"><strong>Salas</strong></a></li>
                                <li><a href="#"><strong>Livros</strong></a></li>
                                <li><a href="#"><strong>Objetos perdidos</strong></a></li>
                                <li><a href="#"><strong>Limpeza</strong></a></li>

                            </ul>
                        </li>
                        <li><a href="#"><strong>Cadastrar</strong></a>
                            <ul>
                                <li><a href="cadastrarUsuario.jsp"><strong>Usuário</strong></a></li>
                                <li><a href="gerenciar_materialEscritorio.jsp"><strong>Material</strong></a></li>
                                <li><a href="gerenciar_salas.jsp"><strong>Sala</strong></a></li>
                                <li><a href="gerenciar_livros.jsp"><strong>Livro</strong></a></li>
                                <li><a href="gerenciarHorarios.jsp"><strong>Horários</strong></a></li>

                            </ul>
                        </li>
                        <li><a href=""><strong>Relatório</strong></a>
                            <ul>
                                <li><a><strong>Individual</strong></a></li>
                                <li><a><strong>Geral</strong></a></li>
                                <li><a><strong>Avaliação de serviço</strong></a></li>
                            </ul>
                        </li>
                        <li><a href="AvaliacaoDeServico.jsp"><strong>Avaliar</strong></a></li>
                        <li><a href="visualizarHorarios.jsp"><strong>Horários</strong></a></li>

                    </ul>
                </div>
            </div>
            <section id="menu">
                <div id="espaco">
                    <table border="0">
                        <tr>
                            <td  colspan="4" align="center">
                                <h2 id="a1">Editar usuário</h2>
                                <h3 id="a2">Altere dos dados do usuário ${param.nome}</h3>
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
                                <form  method="post" action="GerenciarUsuarios">
                                    <div id="formm">
                                        <table>
                                            <tr>
                                                <th>Nome:</th>
                                                <td>
                                                    <input type="text" name="nome" value="${param.nome}" required size="40"/>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>Matrícula: </th>
                                                <td>
                                                    <input type="text" name="matricula" value="${param.matricula}" required size="40"/>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>RG: </th>
                                                <td>
                                                    <input type="text" name="rg" value="${param.rg}" required size="40"/>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>CPF: </th>
                                                <td>
                                                    <input type="text" name="cpf" value="${param.cpf}" required size="40"/>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>Telefone: </th>
                                                <td>
                                                    <input type="text" name="telefone" value="${param.telefone}" required size="40"/>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>Email: </th>
                                                <td>
                                                    <input type="text" name="email" value="${param.email}" required size="40"/>
                                                </td>
                                            </tr>
                                        </table>
                                                
                                    </div>
                                                <div align="center">
                                                    <br>
                                    <input type="hidden" name="idpessoa" value="${param.idpessoa}"/>
                                    <input type="hidden" name="tipo" value="${param.tipo}"/>
                                    <input type="hidden" name="acao" value="alterarDados"/>
                                    <input type="submit" value="Alterar"/>
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
