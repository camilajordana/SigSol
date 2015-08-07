<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsUsuario" %>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsAviso" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SigSol</title>
        <link type="text/css" rel="stylesheet" href="css/folha_de_estilo.css">
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
                        <li class="selected"><a href="horarios.jsp"><strong>Horários</strong></a></li>
                    </ul>

                </div>
            </div>
            <section id="menu">
                <div id="espaco">
                <form method="POST" action="GerenciarHorarios">
                    <div align="center">
                        <br><br>
                        <table>
                            <tr>
                                <td align="center" colspan="2">
                                    <h1>Buscar</h1>
                                    <h3 id="a2">Informe o nome para consultar horários</h3>
                                    <hr>
                                </td>
                            </tr>
                            <tr>
                                <td align="center">
                                    Tipo:
                                </td>
                                <td>
                                    <select name="tipoBuscar">
                                        <option value="1">Turma</option>
                                        <option value="2">Professor</option>
                                        <option value="3">Monitoria</option>

                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td align="center">
                                    Nome:
                                </td>
                                <td>
                                    <input type="text" name="nomeBuscar" required size="45">
                                </td>
                            </tr>
                            <tr>
                                <td align="center" colspan="2">
                                    <br>
                                    <div align="center">
                                        <input type="hidden" name="acao" value="buscar2">
                                        <input type="submit" value="Buscar">
                                        <input type="reset">
                                    </div>
                                </td>
                            </tr>

                        </table>
                    </div>

                </form>
                <br><br>
                <div align="center">
                    <c:forEach var="registroHorarios" items="${sessaoListaHorarios}">

                        <table border="1" width="90%" class="CSSTableGenerator">
                            <div align="center">
                                <h1>${registroHorarios['nome']}</h1>
                            </div>
                            <tr>
                                <th colspan="6">MANHÃ</th>
                            </tr>
                            <tr>
                                <th>Horários</th>
                                <th>Segunda-feira</th>
                                <th>Terça-feira</th>
                                <th>Quarta-feira</th>
                                <th>Quinta-feira</th>
                                <th>Sexta-feira</th>
                            </tr>
                            <tr align="center">
                                <th width="25%">1º</th>
                                <td>${registroHorarios['seg1']}</td>
                                <td>${registroHorarios['ter1']}</td>
                                <td>${registroHorarios['qua1']}</td>
                                <td>${registroHorarios['qui1']}</td>
                                <td>${registroHorarios['sex1']}</td>
                            </tr>
                            <tr align="center">
                                <th width="25%">2º</th>
                                <td>${registroHorarios['seg2']}</td>
                                <td>${registroHorarios['ter2']}</td>
                                <td>${registroHorarios['qua2']}</td>
                                <td>${registroHorarios['qui2']}</td>
                                <td>${registroHorarios['sex2']}</td>
                            </tr>
                            <tr align="center">
                                <th>Intervalo</th>
                                <td>---</td>
                                <td>---</td>
                                <td>---</td>
                                <td>---</td>
                                <td>---</td>
                            </tr>
                            <tr align="center">
                                <th width="25%">3º</th>
                                <td>${registroHorarios['seg3']}</td>
                                <td>${registroHorarios['ter3']}</td>
                                <td>${registroHorarios['qua3']}</td>
                                <td>${registroHorarios['qui3']}</td>
                                <td>${registroHorarios['sex3']}</td>
                            </tr>
                            <tr align="center">
                                <th width="25%">4º</th>
                                <td>${registroHorarios['seg4']}</td>
                                <td>${registroHorarios['ter4']}</td>
                                <td>${registroHorarios['qua4']}</td>
                                <td>${registroHorarios['qui4']}</td>
                                <td>${registroHorarios['sex4']}</td>
                            </tr>
                            <tr align="center">
                                <th>Intervalo</th>
                                <td>---</td>
                                <td>---</td>
                                <td>---</td>
                                <td>---</td>
                                <td>---</td>
                            </tr>
                            <tr align="center">
                                <th width="25%">5º</th>
                                <td>${registroHorarios['seg5']}</td>
                                <td>${registroHorarios['ter5']}</td>
                                <td>${registroHorarios['qua5']}</td>
                                <td>${registroHorarios['qui5']}</td>
                                <td>${registroHorarios['sex5']}</td>
                            </tr>
                            <tr align="center">
                                <th width="25%">6º</th>
                                <td>${registroHorarios['seg6']}</td>
                                <td>${registroHorarios['ter6']}</td>
                                <td>${registroHorarios['qua6']}</td>
                                <td>${registroHorarios['qui6']}</td>
                                <td>${registroHorarios['sex6']}</td>
                            </tr>
                            <tr>
                                <th colspan="6">TARDE</th>
                            </tr>
                            <tr>
                                <th>Horários</th>
                                <th>Segunda-feira</th>
                                <th>Terça-feira</th>
                                <th>Quarta-feira</th>
                                <th>Quinta-feira</th>
                                <th>Sexta-feira</th>
                            </tr>
                            <tr align="center">
                                <th width="25%">1º</th>
                                <td>${registroHorarios['seg7']}</td>
                                <td>${registroHorarios['ter7']}</td>
                                <td>${registroHorarios['qua7']}</td>
                                <td>${registroHorarios['qui7']}</td>
                                <td>${registroHorarios['sex7']}</td>
                            </tr>
                            <tr align="center">
                                <th width="25%">2º</th>
                                <td>${registroHorarios['seg8']}</td>
                                <td>${registroHorarios['ter8']}</td>
                                <td>${registroHorarios['qua8']}</td>
                                <td>${registroHorarios['qui8']}</td>
                                <td>${registroHorarios['sex8']}</td>
                            </tr>
                            <tr align="center">
                                <th>Intervalo</th>
                                <td>---</td>
                                <td>---</td>
                                <td>---</td>
                                <td>---</td>
                                <td>---</td>
                            </tr>
                            <tr align="center">
                                <th width="25%">3º</th>
                                <td>${registroHorarios['seg9']}</td>
                                <td>${registroHorarios['ter9']}</td>
                                <td>${registroHorarios['qua9']}</td>
                                <td>${registroHorarios['qui9']}</td>
                                <td>${registroHorarios['sex9']}</td>
                            </tr>
                            <tr align="center">
                                <th width="25%">4º</th>
                                <td>${registroHorarios['seg10']}</td>
                                <td>${registroHorarios['ter10']}</td>
                                <td>${registroHorarios['qua10']}</td>
                                <td>${registroHorarios['qui10']}</td>
                                <td>${registroHorarios['sex10']}</td>
                            </tr>
                            <tr align="center">
                                <th>Intervalo</th>
                                <td>---</td>
                                <td>---</td>
                                <td>---</td>
                                <td>---</td>
                                <td>---</td>
                            </tr>
                            <tr align="center">
                                <th width="25%">5º</th>
                                <td>${registroHorarios['seg11']}</td>
                                <td>${registroHorarios['ter11']}</td>
                                <td>${registroHorarios['qua11']}</td>
                                <td>${registroHorarios['qui11']}</td>
                                <td>${registroHorarios['sex11']}</td>
                            </tr>
                            <tr align="center">
                                <th width="25%">6º</th>
                                <td>${registroHorarios['seg12']}</td>
                                <td>${registroHorarios['ter12']}</td>
                                <td>${registroHorarios['qua12']}</td>
                                <td>${registroHorarios['qui12']}</td>
                                <td>${registroHorarios['sex12']}</td>
                            </tr>
                            
                            <tr>
                                <th colspan="6">NOITE</th>
                            </tr>
                            <tr>
                                <th>Horários</th>
                                <th>Segunda-feira</th>
                                <th>Terça-feira</th>
                                <th>Quarta-feira</th>
                                <th>Quinta-feira</th>
                                <th>Sexta-feira</th>
                            </tr>
                            <tr align="center">
                                <th width="25%">1º</th>
                                <td>${registroHorarios['seg13']}</td>
                                <td>${registroHorarios['ter13']}</td>
                                <td>${registroHorarios['qua13']}</td>
                                <td>${registroHorarios['qui13']}</td>
                                <td>${registroHorarios['sex13']}</td>
                            </tr>
                            <tr align="center">
                                <th width="25%">2º</th>
                                <td>${registroHorarios['seg14']}</td>
                                <td>${registroHorarios['ter14']}</td>
                                <td>${registroHorarios['qua14']}</td>
                                <td>${registroHorarios['qui14']}</td>
                                <td>${registroHorarios['sex14']}</td>
                            </tr>
                            <tr align="center">
                                <th>Intervalo</th>
                                <td>---</td>
                                <td>---</td>
                                <td>---</td>
                                <td>---</td>
                                <td>---</td>
                            </tr>
                            <tr align="center">
                                <th width="25%">3º</th>
                                <td>${registroHorarios['seg15']}</td>
                                <td>${registroHorarios['ter15']}</td>
                                <td>${registroHorarios['qua15']}</td>
                                <td>${registroHorarios['qui15']}</td>
                                <td>${registroHorarios['sex15']}</td>
                            </tr>
                            <tr align="center">
                                <th width="25%">4º</th>
                                <td>${registroHorarios['seg16']}</td>
                                <td>${registroHorarios['ter16']}</td>
                                <td>${registroHorarios['qua16']}</td>
                                <td>${registroHorarios['qui16']}</td>
                                <td>${registroHorarios['sex16']}</td>
                            </tr>
                        </table>

                    </c:forEach>
                </div>
                </div>
            </section>

        </section>

         
         
    </body>
</html>
