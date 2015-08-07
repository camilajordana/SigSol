<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsUsuario" %>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsUsuario2" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SigSol</title>
        <link type="text/css" rel="stylesheet" href="css/folha_de_estilo_aluno.css">

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
                        <li><a href="#"><strong>Solicitar</strong></a>
                            <ul>
                                <li><a href="GerenciarMateriais?acao=listarAluno"><strong>Material</strong></a></li>
                                <li><a href="GerenciarSala?acao=listarSala"><strong>Sala</strong></a></li>
                                <li><a href="GerenciarLivros?acao=listarLivro"><strong>Livro</strong></a></li>
                                <li><a href="objetos2.jsp"><strong>Objetos perdidos</strong></a></li>
                                <li><a href="solicitarlimpeza2.jsp"><strong>Limpeza</strong></a></li>
                            </ul>
                        </li>
                        <li><a href="horarios2.jsp"><strong>Horários</strong></a></li>
                        <li><a href="#"><strong>Minhas solicitações</strong></a></li>
                        
                    </ul>



                </div>
            </div>
            <section id="menu">
                <div id="espaco">
                    <h2> Bem-vindo(a) ao SigSol, <tagsUsuario:UsuarioLogado/>!</h2>
                    <br><br>

                    <h1>O SigSol propõe uma melhor execução das tarefas e facilidade no processo de solicitações feitas
                        pelas pessoas que utilizam esse setor do Apoio Acadêmico do IFRN campus João Câmara.</h1>
                </div>
            </section>

        </section>
    </body>
</html>
