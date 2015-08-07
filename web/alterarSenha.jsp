

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsUsuario" %>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsUsuario2" %>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsUsuario3" %>

<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsAviso" %>

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
                <a href="#" id="tt">Alterar senha</a> | <a href="Sair" id="tt">Sair</a>

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


                    <table border="0">
                        <tr>
                            <td  colspan="4" align="center">
                                <h2 id="a1">Altere sua senha</h2>
                                <h3 id="a2"></h3>
                            </td>
                        </tr>
                        <tr>
                            <td width="0.5%" colspan="3" id="colunatb">
                            </td>

                        </tr>
                        <tr>
                            <td width="0.5%" colspan="3">
                                <div align="center">
                                <p id="aviso"><strong><tagsAviso:statusInformarCategoria/></strong></p>
</div>
                            </td>
                        </tr>
                        <tr>
                            <td width="0%"></td>
                            <td width="100%">
                                <br>
                                <div align="center">
                                    <form  method="post" action="GerenciarUsuarios">
                                        <div id="formm">
                                            <table>
                                                <tr>
                                                    <th width="40%">Senha atual:</th>
                                                    <td>
                                                        <input type="password" name="senhaAtual" required size="40"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th>Nova senha: </th>
                                                    <td>
                                                        <input type="password" name="novaSenha" required size="40"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th>Confirmar senha: </th>
                                                    <td>
                                                        <input type="password" name="confirmarSenha" required size="40"/>
                                                    </td>
                                                </tr>

                                            </table>

                                        </div>
                                        <div align="center">
                                            <br>
                                            <input type="hidden" value="<tagsUsuario3:PegarID/>" name="id"/>
                                            <input type="hidden" name="acao" value="alterarSenha"/>
                                            <input type="submit" value="Alterar"/>
                                        </div> 
                                    </form>
                                </div>
                            </td>
                            <td width="20%">

                            </td>

                        </tr>

                    </table>



                </div>
            </section>

        </section>
    </body>

</html>
