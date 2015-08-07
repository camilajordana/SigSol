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
                        <li  class="selected"><a href="#"><strong>Início</strong></a>
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
                        <li><a href=""><strong>Relatório</strong></a>
                            <ul>
                                <li><a><strong>Individual</strong></a></li>
                                <li><a><strong>Geral</strong></a></li>
                                <li><a><strong>Avaliação de serviço</strong></a></li>
                            </ul>
                        </li>
                        <li><a href="#"><strong>Solicitações</strong></a>
                            <ul>
                                <li><a href="#"><strong>Material escritório</strong></a></li>
                                <li><a href="#"><strong>Material videoaula</strong></a></li>
                                <li><a href="#"><strong>Salas</strong></a></li>
                                <li><a href="#"><strong>Livros</strong></a></li>
                                <li><a href="#"><strong>Objetos perdidos</strong></a></li>
                                <li><a href="#"><strong>Limpeza</strong></a></li>


                            </ul>
                        </li>
                        <li><a href="horarios.jsp"><strong>Horários</strong></a></li>
                    </ul>

                </div>
            </div>
            <section id="menu">
                <div id="espaco">





                    <table border="0" width="100%">
                        <tr>
                            <td  colspan="4" align="center">
                                <h2 id="a1">Solicitações de livros</h2>
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
                                                <th width="10%">Livro</th>
                                                <th width="20%">Solicitante</th>
                                                <th width="15%">Matrícula</th>
                                                <th  width="10%">Quantidade</th>
                                                <th width="30%">Descrição</th>
                                                <th colspan="2">Ação</th>

                                            </tr>
                                            <c:forEach var="registroLivros" items="${sessaoListaLivros}">

                                                <tr>


                                                    <td>
                                                        ${registroLivros['livro']}
                                                    </td>
                                                    <td>
                                                        ${registroLivros['solicitantenomeLivro']}
                                                    </td>
                                                    <td>
                                                        ${registroLivros['solicitantematriculaLivro']}
                                                    </td>
                                                    <td>
                                                        ${registroLivros['quantidadeLivro']}
                                                    </td>
                                                    <td>
                                                        ${registroLivros['descricaoLivro']}
                                                    </td>
                                                    

                                                    <td width="3%">

                                                        <input type="hidden" name="id_solicitacaoLivro" value="${registroLivros['id_solicitacaoLivro']}"> 

                                                        <a href="GM?acao=aceitarLivro&id_solicitacaoLivro=${registroLivros['id_solicitacaoLivro']}"><img src="imagens/feito.png" width="20" height="20" alt="deletar"/></a></td>
                                                    <td width="3%">   <a href="GM?acao=naoaceitoLivro&id_solicitacaoLivro=${registroLivros['id_solicitacaoLivro']}"><img src="imagens/naofeito.png" width="20" height="20" alt="deletar"/></a></td>
                                                    
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
                                                    <img src="imagens/relatorio.png" width="20" height="20"><a href="GerenciarLivros?acao=listarTodos"> GERAR RELATÓRIO</a>
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

