<%-- 
    Document   : alteraMateriais
    Created on : 01/12/2014, 21:59:07
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
                        <li><a href="GerenciarUsuarios?acao=listar"><strong>Usuários</strong></a></li>
                        <li class="selected"><a href="#"><strong>Gerenciar</strong></a>
                            <ul>
                                <li><a href="GerenciarMateriais?acao=listar"><strong>Material</strong></a></li>
                                <li><a href="GerenciarSala?acao=listar"><strong>Sala</strong></a></li>
                                <li><a href="#"><strong>Livro</strong></a></li>
                                <li><a href="#"><strong>Horários</strong></a></li>

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
                                <h2 id="a1">Editar material</h2>
                                
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
                                <form  method="post" action="GerenciarMateriais">
                                    <div id="formm">
                                        
                                        <table>
                                            <tr>
                                                <th>Nome:</th>
                                                <td>
                                                    <input type="text" name="nome_material" value="${param.nome_material}" required size="40"/>
                                                </td>
                                            </tr>
                                            
                                        </table>
                                    </div>
                                                
                                                <div align="center">
                                                    <br>
                                    <input type="hidden" name="idmaterial" value="${param.idmaterial}"/>
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
