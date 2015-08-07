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
        <link type="text/css" rel="stylesheet" href="css/estilo_tabela.css">
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
                        <li><a href="minhasSolicitacoes.jsp"><strong>Minhas solicitações</strong></a></li>
                        <li><a href="horarios.jsp"><strong>Horários</strong></a></li>
                    </ul>

    
                </div>
            </div>
            <section id="menu">
                <div id="espaco">





                    <table border="0" width="100%">
                        <tr>
                            <td  colspan="4" align="center">
                                <h2 id="a1">Solicitações de salas</h2>
                            </td>

                        </tr>
                        <tr>
                            <td width="0.5%" colspan="3" id="colunatb">

                            </td>
                        </tr>
                        <tr>
                            <td width="0%"></td>
                            <td>
                                <br>
                                <div align="center">

                                    <p id="aviso"><strong><tagsAviso:statusInformarCategoria/></strong></p>
                                    <br>
                                </div>

                                <form method="post" action="GM"> 
                                    <div id="formm">
                                        <table width="100%" border="1" class="CSSTableGenerator">
                                            <tr>
                                                <th width="10%">Sala</th>
                                                <th width="20%">Solicitante</th>
                                                <th width="15%">Matrícula</th>
                                                <th  width="8%">Dia</th>
                                                <th width="8%">Início</th>
                                                <th width="8%">Término</th>
                                                <th width="30%">Descrição</th>
                                                <th colspan="2">Ação</th>

                                            </tr>
                                            <c:forEach var="registroSalas" items="${sessaoListaSalas}">

                                                <tr>


                                                    <td>
                                                        ${registroSalas['sala']}
                                                    </td>
                                                    <td>
                                                        ${registroSalas['solicitantenomeSala']}
                                                    </td>
                                                    <td>
                                                        ${registroSalas['solicitantematriculaSala']}
                                                    </td>
                                                    <td>
                                                        ${registroSalas['diaSala']}
                                                    </td>
                                                    <td>
                                                        ${registroSalas['inicioSala']}
                                                    </td>
                                                    <td>
                                                        ${registroSalas['terminoSala']}
                                                    </td>
                                                    <td>
                                                        ${registroSalas['descricaoSala']}
                                                    </td>
                                                    


                                                    <td width="3%">

                                                        <input type="hidden" name="id_solicitacaoSala" value="${registroSalas['id_solicitacaoSala']}"> 

                                                        <a href="GM?acao=aceitarSala&id_solicitacaoSala=${registroSalas['id_solicitacaoSala']}"><img src="imagens/feito.png" width="20" height="20" alt="deletar"/></a></td>
                                                    <td width="3%">   <a href="GM?acao=naoaceitoSala&id_solicitacaoSala=${registroSalas['id_solicitacaoSala']}"><img src="imagens/naofeito.png" width="20" height="20" alt="deletar"/></a></td>
                                                    
                                                        <!--         <input type="image" src="imagens/feito.png" onClick="teste1()" name="aceito" width="20" height="20"></td> -->
                                                        <!--     <td width="3%"><input type="image" onClick="teste2()" src="imagens/naofeito.png" name="naoaceito" width="20" height="20">  -->

                                                    



                                                    <!--      <td width="3%"><a href="#" onclick="this.href = 'GM?acao2=' + document.getElementById('c').value"><img src="imagens/feito.png" width="20" height="20" alt="Feito"></a></td> -->

                                                    <!--      <td width="3%"><input type="image" src="imagens/naofeito.png" name="naoaceito" width="20" height="20"></td> -->





                                                </tr>


                                            </c:forEach>

                                        </table>

                                    </div> 
                                </form>






                            </td>
                            <td width="0%">

                            </td>

                        </tr>

                    </table>

<div align="right">

                                    <table>
                                        <tr>
                                            <td>
                                                <div align="right"> 
                                                <br>
                                                <p>
                                                    <img src="imagens/relatorio.png" width="20" height="20"><a href="GerenciarSala?acao=listarTodos"> GERAR RELATÓRIO</a>
                                                </p>
                                                </div>
                                            </td>
                                        </tr>
                                    </table>

</div>




                </div>
            </section>

        </section>
    </body>
</html>
