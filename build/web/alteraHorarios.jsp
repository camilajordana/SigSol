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
                                <li><a href="GerenciarLivros?acao=listar"><strong>Livro</strong></a></li>
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
                                <h2 id="a1">Editar horário</h2>

                            </td>

                        </tr>
                        <tr>
                            <td width="0.5%" colspan="3" id="colunatb">

                            </td>
                        </tr>
                        <tr>
                            <td width="0%"></td>
                            <td width="100%">
                                <br>
                                <form  method="post" action="GerenciarHorarios">
                                    <div id="formm">

                                        Nome: <input type="text" size="45" name="nome" required value="${param.nome}"/>


                                        <br><br><br>
                                        
                                       <table border="1" width="100%" bgcolor="white">
                                           <tr>
                                               <th align="center" colspan="6">
                                                   MANHÃ
                                               </th>
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
                                                            <th width="10%">1º</th>
                                                            <td width="18%"><input type="text" size="25" name="seg1" value="${param.seg1}"></td>
                                                            <td width="18%"><input type="text" size="25" name="ter1" value="${param.ter1}"></td>
                                                            <td width="18%"><input type="text"  size="25" name="qua1" value="${param.qua1}"></td>
                                                            <td width="18%"><input type="text" size="25" name="qui1" value="${param.qui1}"></td>
                                                            <td width="18%"><input type="text" size="25" name="sex1" value="${param.sex1}"></td>
                                                        </tr>
                                                        <tr align="center">
                                                            <th>2º</th>
                                                            <td><input type="text" name="seg2" size="25" value="${param.seg2}"></td>
                                                            <td><input type="text" name="ter2" size="25" value="${param.ter2}"></td>
                                                            <td><input type="text" size="25" name="qua2" value="${param.qua2}"></td>
                                                            <td><input type="text" name="qui2" size="25" value="${param.qui2}"></td>
                                                            <td><input type="text" size="25" name="sex2" value="${param.sex2}"></td>
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
                                                            <th>3º</th>
                                                            <td><input type="text" size="25" name="seg3" value="${param.seg3}"></td>
                                                            <td><input type="text" size="25" name="ter3" value="${param.ter3}"></td>
                                                            <td><input type="text" size="25" name="qua3" value="${param.qua3}"></td>
                                                            <td><input type="text" size="25" name="qui3" value="${param.qui3}"></td>
                                                            <td><input type="text" size="25" name="sex3" value="${param.sex3}"></td>
                                                        </tr>
                                                        <tr align="center">
                                                            <th>4º</th>
                                                            <td><input type="text" size="25" name="seg4" value="${param.seg4}"></td>
                                                            <td><input type="text" size="25" name="ter4" value="${param.ter4}"></td>
                                                            <td><input type="text" size="25" name="qua4" value="${param.qua4}"></td>
                                                            <td><input type="text" size="25" name="qui4" value="${param.qui4}"></td>
                                                            <td><input type="text" size="25" name="sex4" value="${param.sex4}"></td>
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
                                                            <th>5º</th>
                                                            <td><input type="text" size="25" name="seg5" value="${param.seg5}"></td>
                                                            <td><input type="text"  size="25" name="ter5" value="${param.ter5}"></td>
                                                            <td><input type="text" size="25" name="qua5" value="${param.qua5}"></td>
                                                            <td><input type="text" size="25" name="qui5" value="${param.qui5}"></td>
                                                            <td><input type="text" size="25" name="sex5" value="${param.sex5}"></td>
                                                        </tr>
                                                        <tr align="center">
                                                            <th>6º</th>
                                                            <td><input type="text" size="25" name="seg6" value="${param.seg6}"></td>
                                                            <td><input type="text" size="25" name="ter6" value="${param.ter6}"></td>
                                                            <td><input type="text" size="25" name="qua6" value="${param.qua6}"></td>
                                                            <td><input type="text" size="25" name="qui6" value="${param.qui6}"></td>
                                                            <td><input type="text" size="25" name="sex6" value="${param.sex6}"></td>
                                                        </tr>
                                                        <tr>
                                                            <th colspan="6" align="center">TARDE</th>
                                                        </tr>
                                                        
                                                        <tr align="center">
                                                            <th width="10%">1º</th>
                                                            <td width="18%"><input type="text" size="25" name="seg7" value="${param.seg7}"></td>
                                                            <td width="18%"><input type="text" size="25" name="ter7" value="${param.ter7}"></td>
                                                            <td width="18%"><input type="text"  size="25" name="qua7" value="${param.qua7}"></td>
                                                            <td width="18%"><input type="text" size="25" name="qui7" value="${param.qui7}"></td>
                                                            <td width="18%"><input type="text" size="25" name="sex7" value="${param.sex7}"></td>
                                                        </tr>
                                                        <tr align="center">
                                                            <th>2º</th>
                                                            <td><input type="text" name="seg8" size="25" value="${param.seg8}"></td>
                                                            <td><input type="text" name="ter8" size="25" value="${param.ter8}"></td>
                                                            <td><input type="text" size="25" name="qua8" value="${param.qua8}"></td>
                                                            <td><input type="text" name="qui8" size="25" value="${param.qui8}"></td>
                                                            <td><input type="text" size="25" name="sex8" value="${param.sex8}"></td>
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
                                                            <th>3º</th>
                                                            <td><input type="text" size="25" name="seg9" value="${param.seg9}"></td>
                                                            <td><input type="text" size="25" name="ter9" value="${param.ter9}"></td>
                                                            <td><input type="text" size="25" name="qua9" value="${param.qua9}"></td>
                                                            <td><input type="text" size="25" name="qui9" value="${param.qui9}"></td>
                                                            <td><input type="text" size="25" name="sex9" value="${param.sex9}"></td>
                                                        </tr>
                                                        <tr align="center">
                                                            <th>4º</th>
                                                            <td><input type="text" size="25" name="seg10" value="${param.seg10}"></td>
                                                            <td><input type="text" size="25" name="ter10" value="${param.ter10}"></td>
                                                            <td><input type="text" size="25" name="qua10" value="${param.qua10}"></td>
                                                            <td><input type="text" size="25" name="qui10" value="${param.qui10}"></td>
                                                            <td><input type="text" size="25" name="sex10" value="${param.sex10}"></td>
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
                                                            <th>5º</th>
                                                            <td><input type="text" size="25" name="seg11" value="${param.seg11}"></td>
                                                            <td><input type="text"  size="25" name="ter11" value="${param.ter11}"></td>
                                                            <td><input type="text" size="25" name="qua11" value="${param.qua11}"></td>
                                                            <td><input type="text" size="25" name="qui11" value="${param.qui11}"></td>
                                                            <td><input type="text" size="25" name="sex11" value="${param.sex11}"></td>
                                                        </tr>
                                                        <tr align="center">
                                                            <th>6º</th>
                                                            <td><input type="text" size="25" name="seg12" value="${param.seg12}"></td>
                                                            <td><input type="text" size="25" name="ter12" value="${param.ter12}"></td>
                                                            <td><input type="text" size="25" name="qua12" value="${param.qua12}"></td>
                                                            <td><input type="text" size="25" name="qui12" value="${param.qui12}"></td>
                                                            <td><input type="text" size="25" name="sex12" value="${param.sex12}"></td>
                                                        </tr>
                                                        <tr>
                                                            <th colspan="6" align="center">
                                                                NOITE
                                                            </th>
                                                        </tr>
                                                        
                                                        <tr align="center">
                                                            <th width="10%">1º</th>
                                                            <td width="18%"><input type="text" size="25" name="seg13" value="${param.seg13}"></td>
                                                            <td width="18%"><input type="text" size="25" name="ter13" value="${param.ter13}"></td>
                                                            <td width="18%"><input type="text"  size="25" name="qua13" value="${param.qua13}"></td>
                                                            <td width="18%"><input type="text" size="25" name="qui13" value="${param.qui13}"></td>
                                                            <td width="18%"><input type="text" size="25" name="sex13" value="${param.sex13}"></td>
                                                        </tr>
                                                        <tr align="center">
                                                            <th>2º</th>
                                                            <td><input type="text" name="seg14" size="25" value="${param.seg14}"></td>
                                                            <td><input type="text" name="ter14" size="25" value="${param.ter14}"></td>
                                                            <td><input type="text" size="25" name="qua14" value="${param.qua14}"></td>
                                                            <td><input type="text" name="qui14" size="25" value="${param.qui14}"></td>
                                                            <td><input type="text" size="25" name="sex14" value="${param.sex14}"></td>
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
                                                            <th>3º</th>
                                                            <td><input type="text" size="25" name="seg15" value="${param.seg15}"></td>
                                                            <td><input type="text" size="25" name="ter15" value="${param.ter15}"></td>
                                                            <td><input type="text" size="25" name="qua15" value="${param.qua15}"></td>
                                                            <td><input type="text" size="25" name="qui15" value="${param.qui15}"></td>
                                                            <td><input type="text" size="25" name="sex15" value="${param.sex15}"></td>
                                                        </tr>
                                                        <tr align="center">
                                                            <th>4º</th>
                                                            <td><input type="text" size="25" name="seg16" value="${param.seg16}"></td>
                                                            <td><input type="text" size="25" name="ter16" value="${param.ter16}"></td>
                                                            <td><input type="text" size="25" name="qua16" value="${param.qua16}"></td>
                                                            <td><input type="text" size="25" name="qui16" value="${param.qui16}"></td>
                                                            <td><input type="text" size="25" name="sex16" value="${param.sex16}"></td>
                                                        </tr>
                                                        
                                                        
                                                        
                                                        <p id="aviso"><strong><tagsAviso:statusInformarCategoria/></strong></p>


                                                    </table>
                                    </div> 
                                    <div align="center">
                                                    <br>
                                    <input type="hidden" name="idhorarios" value="${param.idhorarios}"/>
                                    <input type="hidden" name="tipo" value="${param.tipo}"/>
                                    <input type="hidden" name="idhorario_manha" value="${param.idhorario_manha}"/>
                                    <input type="hidden" name="idhorario_tarde" value="${param.idhorario_tarde}"/>
                                    <input type="hidden" name="idhorario_noite" value="${param.idhorario_noite}"/>
                                    <input type="hidden" name="idhorariosmanha" value="${param.idhorariosmanha}"/>
                                    <input type="hidden" name="idhorariostarde" value="${param.idhorariostarde}"/>
                                    <input type="hidden" name="idhorariosnoite" value="${param.idhorariosnoite}"/>
                                    
                                    <input type="hidden" name="acao" value="alterarDados"/>
                                    <input type="submit" value="Alterar"/>
                                    
                                    </div>
                                </form>





                            </td>
                            <td width="0%">

                            </td>

                        </tr>

                    </table>


                </div>
            </section>
        </section>
    </body>

</html>
