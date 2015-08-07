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
                                <h2 id="a1">Gerenciar horários</h2>
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
                                <form method="post" action="GerenciarHorarios">
                                    <div id="formm">
                                        <table>
                                            <div align="center">
                                                <h1>Cadastrar horário</h1> 
                                                <div align="center">

                                                    <tr>
                                                        <td>Tipo: </td>
                                                        <td>
                                                            <select name="tipo">
                                                                <option value="0">---</option>
                                                                <option value="1">Turma</option>
                                                                <option value="2">Professor</option>
                                                                <option value="3">Monitoria</option>
                                                            </select>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td>Nome: </td>
                                                        <td>
                                                            <input type="text" name="nome" required size="45">
                                                        </td>
                                                    </tr>
                                                </div>
                                        </table>
                                        <br>




                                        </td>
                                        <td width="60%">

                                        </td>

                                        </tr>
                                        <tr>
                                            <td colspan="3">
                                                <div align="center">
                                                    <br>
                                                    <p id="aviso"><strong><tagsAviso:statusInformarCategoria/></strong></p>

                                                    <table border="1" width="70%" bgcolor="white">
                                                        <tr>
                                                            <th colspan="6" bgcolor="gray">MANHÃ</th>
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
                                                            <td><input type="text" size="25%" name="seg1"></td>
                                                            <td><input type="text" size="25%" name="ter1"></td>
                                                            <td><input type="text" size="25%" name="qua1"></td>
                                                            <td><input type="text" size="25%" name="qui1"></td>
                                                            <td><input type="text" size="25%" name="sex1"></td>
                                                        </tr>
                                                        <tr align="center">
                                                            <th width="25%">2º</th>
                                                            <td><input type="text" size="25%" name="seg2"></td>
                                                            <td><input type="text" size="25%" name="ter2"></td>
                                                            <td><input type="text" size="25%" name="qua2"></td>
                                                            <td><input type="text" size="25%" name="qui2"></td>
                                                            <td><input type="text" size="25%" name="sex2"></td>
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
                                                            <td><input type="text" size="25%" name="seg3"></td>
                                                            <td><input type="text" size="25%" name="ter3"></td>
                                                            <td><input type="text" size="25%" name="qua3"></td>
                                                            <td><input type="text" size="25%" name="qui3"></td>
                                                            <td><input type="text" size="25%" name="sex3"></td>
                                                        </tr>
                                                        <tr align="center">
                                                            <th width="25%">4º</th>
                                                            <td><input type="text" size="25%" name="seg4"></td>
                                                            <td><input type="text" size="25%" name="ter4"></td>
                                                            <td><input type="text" size="25%" name="qua4"></td>
                                                            <td><input type="text" size="25%" name="qui4"></td>
                                                            <td><input type="text" size="25%" name="sex4"></td>
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
                                                            <td><input type="text" size="25%" name="seg5"></td>
                                                            <td><input type="text" size="25%" name="ter5"></td>
                                                            <td><input type="text" size="25%" name="qua5"></td>
                                                            <td><input type="text" size="25%" name="qui5"></td>
                                                            <td><input type="text" size="25%" name="sex5"></td>
                                                        </tr>
                                                        <tr align="center">
                                                            <th width="25%">6º</th>
                                                            <td><input type="text" size="25%" name="seg6"></td>
                                                            <td><input type="text" size="25%" name="ter6"></td>
                                                            <td><input type="text" size="25%" name="qua6"></td>
                                                            <td><input type="text" size="25%" name="qui6"></td>
                                                            <td><input type="text" size="25%" name="sex6"></td>
                                                        </tr>


                                                        <table border="1" width="70%" bgcolor="white">
                                                            <tr>
                                                                <th colspan="6" bgcolor="gray">TARDE</th>
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
                                                                <td><input type="text" size="25%" name="seg7"></td>
                                                                <td><input type="text" size="25%" name="ter7"></td>
                                                                <td><input type="text" size="25%" name="qua7"></td>
                                                                <td><input type="text" size="25%" name="qui7"></td>
                                                                <td><input type="text" size="25%" name="sex7"></td>
                                                            </tr>
                                                            <tr align="center">
                                                                <th width="25%">2º</th>
                                                                <td><input type="text" size="25%" name="seg8"></td>
                                                                <td><input type="text" size="25%" name="ter8"></td>
                                                                <td><input type="text" size="25%" name="qua8"></td>
                                                                <td><input type="text" size="25%" name="qui8"></td>
                                                                <td><input type="text" size="25%" name="sex8"></td>
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
                                                                <td><input type="text" size="25%" name="seg9"></td>
                                                                <td><input type="text" size="25%" name="ter9"></td>
                                                                <td><input type="text" size="25%" name="qua9"></td>
                                                                <td><input type="text" size="25%" name="qui9"></td>
                                                                <td><input type="text" size="25%" name="sex9"></td>
                                                            </tr>
                                                            <tr align="center">
                                                                <th width="25%">4º</th>
                                                                <td><input type="text" size="25%" name="seg10"></td>
                                                                <td><input type="text" size="25%" name="ter10"></td>
                                                                <td><input type="text" size="25%" name="qua10"></td>
                                                                <td><input type="text" size="25%" name="qui10"></td>
                                                                <td><input type="text" size="25%" name="sex10"></td>
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
                                                                <td><input type="text" size="25%" name="seg11"></td>
                                                                <td><input type="text" size="25%" name="ter11"></td>
                                                                <td><input type="text" size="25%" name="qua11"></td>
                                                                <td><input type="text" size="25%" name="qui11"></td>
                                                                <td><input type="text" size="25%" name="sex11"></td>
                                                            </tr>
                                                            <tr align="center">
                                                                <th width="25%">6º</th>
                                                                <td><input type="text" size="25%" name="seg12"></td>
                                                                <td><input type="text" size="25%" name="ter12"></td>
                                                                <td><input type="text" size="25%" name="qua12"></td>
                                                                <td><input type="text" size="25%" name="ter12"></td>
                                                                <td><input type="text" size="25%" name="sex12"></td>
                                                            </tr>
                                                            <tr>
                                                                <th colspan="6" bgcolor="gray">NOITE</th>
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
                                                                <td><input type="text" size="25%" name="seg13"></td>
                                                                <td><input type="text" size="25%" name="ter13"></td>
                                                                <td><input type="text" size="25%" name="qua13"></td>
                                                                <td><input type="text" size="25%" name="qui13"></td>
                                                                <td><input type="text" size="25%" name="sex13"></td>
                                                            </tr>
                                                            <tr align="center">
                                                                <th width="25%">2º</th>
                                                                <td><input type="text" size="25%" name="seg14"></td>
                                                                <td><input type="text" size="25%" name="ter14"></td>
                                                                <td><input type="text" size="25%" name="qua14"></td>
                                                                <td><input type="text" size="25%" name="qui14"></td>
                                                                <td><input type="text" size="25%" name="sex14"></td>
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
                                                                <td><input type="text" size="25%" name="seg15"></td>
                                                                <td><input type="text" size="25%" name="ter15"></td>
                                                                <td><input type="text" size="25%" name="qua15"></td>
                                                                <td><input type="text" size="25%" name="qui15"></td>
                                                                <td><input type="text" size="25%" name="sex15"></td>
                                                            </tr>
                                                            <tr align="center">
                                                                <th width="25%">4º</th>
                                                                <td><input type="text" size="25%" name="seg16"></td>
                                                                <td><input type="text" size="25%" name="ter16"></td>
                                                                <td><input type="text" size="25%" name="qua16"></td>
                                                                <td><input type="text" size="25%" name="qui16"></td>
                                                                <td><input type="text" size="25%" name="sex16"></td>
                                                            </tr>


                                                        </table>
                                                        <div align="center">
                                                            <br>
                                                            <input type="hidden" name="acao" value="cadastrar">
                                                            <input type="submit" value="Cadastrar">
                                                            <input type="reset" value="Limpar">
                                                        </div>
                                                </div>
                                    </div>

                            </td>
                        </tr>
                    </table>
                </div>
                </form>


                <form method="POST" action="GerenciarHorarios">
                    <div align="center">
                        <br><br>
                        <table>
                            <tr>
                                <td align="center" colspan="2">
                                    <h1>Buscar</h1>
                                    <h3 id="a2">Informe o nome para consultar horários</h3>
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
                                        <input type="hidden" name="acao" value="buscar">
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

                        <div align="center">
                            <br>

                            <a href="alteraHorarios.jsp?idhorarios=${registroHorarios['idhorarios']}&nome=${registroHorarios['nome']}&tipo=${registroHorarios['tipo']}&idhorario_manha=${registroHorarios['idhorario_manha']}&seg1=${registroHorarios['seg1']}&seg2=${registroHorarios['seg2']}&seg3=${registroHorarios['seg3']}&seg4=${registroHorarios['seg4']}&seg5=${registroHorarios['seg5']}&seg6=${registroHorarios['seg6']}&ter1=${registroHorarios['ter1']}&ter2=${registroHorarios['ter2']}&ter3=${registroHorarios['ter3']}&ter4=${registroHorarios['ter4']}&ter5=${registroHorarios['ter5']}&ter6=${registroHorarios['ter6']}&qua1=${registroHorarios['qua1']}&qua2=${registroHorarios['qua2']}&qua3=${registroHorarios['qua3']}&qua4=${registroHorarios['qua4']}&qua5=${registroHorarios['qua5']}&qua6=${registroHorarios['qua6']}&qui1=${registroHorarios['qui1']}&qui2=${registroHorarios['qui2']}&qui3=${registroHorarios['qui3']}&qui4=${registroHorarios['qui4']}&qui5=${registroHorarios['qui5']}&qui6=${registroHorarios['qui6']}&sex1=${registroHorarios['sex1']}&sex2=${registroHorarios['sex2']}&sex3=${registroHorarios['sex3']}&sex4=${registroHorarios['sex4']}&sex5=${registroHorarios['sex5']}&sex6=${registroHorarios['sex6']}&idhorario_tarde=${registroHorarios['idhorario_tarde']}&seg7=${registroHorarios['seg7']}&seg8=${registroHorarios['seg8']}&seg9=${registroHorarios['seg9']}&seg10=${registroHorarios['seg10']}&seg11=${registroHorarios['seg11']}&seg12=${registroHorarios['seg12']}&ter7=${registroHorarios['ter7']}&ter8=${registroHorarios['ter8']}&ter9=${registroHorarios['ter9']}&ter10=${registroHorarios['ter10']}&ter11=${registroHorarios['ter11']}&ter12=${registroHorarios['ter12']}&qua7=${registroHorarios['qua7']}&qua8=${registroHorarios['qua8']}&qua9=${registroHorarios['qua9']}&qua10=${registroHorarios['qua10']}&qua11=${registroHorarios['qua11']}&qua12=${registroHorarios['qua12']}&qui7=${registroHorarios['qui7']}&qui8=${registroHorarios['qui8']}&qui9=${registroHorarios['qui9']}&qui10=${registroHorarios['qui10']}&qui11=${registroHorarios['qui11']}&qui12=${registroHorarios['qui12']}&sex7=${registroHorarios['sex7']}&sex8=${registroHorarios['sex8']}&sex9=${registroHorarios['sex9']}&sex10=${registroHorarios['sex10']}&sex11=${registroHorarios['sex11']}&sex12=${registroHorarios['sex12']}&idhorario_noite=${registroHorarios['idhorario_noite']}&seg13=${registroHorarios['seg13']}&seg14=${registroHorarios['seg14']}&seg15=${registroHorarios['seg15']}&seg16=${registroHorarios['seg16']}&ter13=${registroHorarios['ter13']}&ter14=${registroHorarios['ter14']}&ter15=${registroHorarios['ter15']}&ter16=${registroHorarios['ter16']}&qua13=${registroHorarios['qua13']}&qua14=${registroHorarios['qua14']}&qua15=${registroHorarios['qua15']}&qua16=${registroHorarios['qua16']}&qui13=${registroHorarios['qui13']}&qui14=${registroHorarios['qui14']}&qui15=${registroHorarios['qui15']}&qui16=${registroHorarios['qui16']}&sex13=${registroHorarios['sex13']}&sex14=${registroHorarios['sex14']}&sex15=${registroHorarios['sex15']}&sex16=${registroHorarios['sex16']}&idhorariosmanha=${registroHorarios['idhorariosmanha']}&idhorariostarde=${registroHorarios['idhorariostarde']}&idhorariosnoite=${registroHorarios['idhorariosnoite']}"><img src="imagens/editarr.png" width="85" height="30"></a>
                            <a href="GerenciarHorarios?acao=excluir&idhorarios=${registroHorarios['idhorarios']}"> <img src="imagens/excluir.png" width="85" height="30"></a>

                            <br><br>
                        </div>
                    </c:forEach>
                </div>
                </div>
            </section>

        </section>

    </body>

</html>
