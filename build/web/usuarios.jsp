

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="br.edu.ifrn.jdbc.modelo.Pessoa"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.edu.ifrn.jdbc.dao.PessoaDAO"%>
<%@page import="java.util.List"%>
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
        
        
        <script>
            
            function validarCPF( cpf ){
	var filtro = /^\d{3}.\d{3}.\d{3}-\d{2}$/i;
	
	if(!filtro.test(cpf))
	{
		return false;
	}
   
	cpf = remove(cpf, ".");
        cpf = remove(cpf, "-");
	
	if(cpf.length != 11 || cpf == "00000000000" || cpf == "11111111111" ||
		cpf == "22222222222" || cpf == "33333333333" || cpf == "44444444444" ||
		cpf == "55555555555" || cpf == "66666666666" || cpf == "77777777777" ||
		cpf == "88888888888" || cpf == "99999999999")
	{
	return false;
   }

	soma = 0;
	for(i = 0; i < 9; i++)
	{
		soma += parseInt(cpf.charAt(i)) * (10 - i);
	}
	
	resto = 11 - (soma % 11);
	if(resto == 10 || resto == 11)
	{
		resto = 0;
	}
	if(resto != parseInt(cpf.charAt(9))){
	return false;
	}
	
	soma = 0;
	for(i = 0; i < 10; i ++)
	{
		soma += parseInt(cpf.charAt(i)) * (11 - i);
	}
	resto = 11 - (soma % 11);
	if(resto == 10 || resto == 11)
	{
		resto = 0;
	}
	
	if(resto != parseInt(cpf.charAt(10))){
	return false;
	}
	
	return true;
 }
 
jQuery("#rg").mask("999.999.999"); 
function remove(str, sub) {
	i = str.indexOf(sub);
	r = "";
	if (i == -1) return str;
	{
		r += str.substring(0,i) + remove(str.substring(i + sub.length), sub);
	}
	
	return r;
}

/**
   * MASCARA ( mascara(o,f) e execmascara() ) CRIADAS POR ELCIO LUIZ
   * elcio.com.br
   */
function mascara(o,f){
	v_obj=o
	v_fun=f
	setTimeout("execmascara()",1)
}

function execmascara(){
	v_obj.value=v_fun(v_obj.value)
}

function cpf_mask(v){
	v=v.replace(/\D/g,"")                 //Remove tudo o que não é dígito
	v=v.replace(/(\d{3})(\d)/,"$1.$2")    //Coloca ponto entre o terceiro e o quarto dígitos
	v=v.replace(/(\d{3})(\d)/,"$1.$2")    //Coloca ponto entre o setimo e o oitava dígitos
	v=v.replace(/(\d{3})(\d)/,"$1-$2")   //Coloca ponto entre o decimoprimeiro e o decimosegundo dígitos
	return v
}

            
        </script>
     
        
        
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
                        <li class="selected"><a href="GerenciarUsuarios?acao=listar"><strong>Usuários</strong></a></li>
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
                        <li><a href="horarios.jsp"><strong>Horários</strong></a></li>
                    </ul>

                </div>
            </div>
            <section id="menu">
                <div id="espaco">

                    <%-- FORMULÁRIO PARA CADASTRAR USUÁRIO --%>

                    <div id="divForm">
                        <form name="formulario" action="GerenciarUsuarios" method="POST">

                            <h2 id="a1">Usuários</h2>
                            <h3 id="a2">Cadastre, visualize, modifique e exclua usuários do SigSol</h3>


                            <fieldset>

                                <legend>Novo usuário</legend>

                                <table id="tabelaUsuarios">

                                    <tr><td>
                                            Categoria:
                                        </td>
                                        <td width="100" height="10">
                                        </td>
                                        <td>
                                            <p id="aviso"><strong><tagsAviso:statusInformarCategoria/></strong></p>
                                        </td>
                                        <td rowspan="10">
                                            <img src="imagens/newuser2.png" width="300" height="170">
                                        </td>
                                    </tr>

                                    <tr><td>
                                            <select name="categoriaUsuario" id="categoriaUsuario" >
                                                <option value="0" selected>(Selecione)</option>
                                                <option value="1">Aluno</option>
                                                <option value="2">Professor</option>
                                                <option value="3">Técnico administrativo</option>
                                                <option value="4">Administrador</option>

                                            </select>
                                        </td>
                                        <td width="100" height="10">
                                        </td>
                                        <td></td>
                                    </tr>

                                    <tr><td>
                                            Nome: 
                                        </td>
                                        <td width="100" height="10">
                                        </td>
                                        <td>
                                            Matrícula:
                                        </td>
                                    </tr>

                                    <tr><td>
                                            <input type="text" name="nome" required size="35"/>
                                        </td>
                                        <td width="100" height="10">
                                        </td>
                                        <td>
                                            <input type="text" name="matricula" maxlength="14" required size="35"/>
                                        </td>
                                    </tr>

                                    <tr><td>
                                            CPF:
                                        </td>
                                        <td width="100" height="10">
                                        </td>
                                        <td>
                                            RG:
                                        </td>
                                    </tr>

                                    <tr><td>
                                            <input type="text" name="cpf" id="cpf" onblur="javascript: validarCPF(this.value);" onkeypress="javascript: mascara(this, cpf_mask);" maxlength="14" required size="35">
                                        </td>
                                        <td width="100" height="10">
                                        </td>
                                        <td>
                                            <input type="text" id="rg" name="rg" maxlength="9" required size="35">
                                        </td>
                                    </tr>

                                    <tr><td>
                                            Telefone:
                                        </td>
                                        <td width="100" height="10">
                                        </td>
                                        <td>
                                            E-mail:
                                        </td>
                                    </tr>
                                    <tr><td>
                                            <input type="text" name="telefone" onKeyPress="MascaraTelefone(formulario.telefone);" maxlength="14"  onBlur="ValidaTelefone(formulario.telefone);" required size="35">
                                        </td>
                                        <td width="100" height="10">
                                        </td>
                                        <td>
                                            <input type="email" name="email" required size="35"/>
                                        </td>
                                    </tr>

                                    <tr><td>
                                            Senha:
                                        </td>
                                        <td width="100" height="10">
                                        </td>
                                        <td>
                                            Confirmar senha:
                                        </td>
                                    </tr>
                                    <tr><td>
                                            <input type="password" name="senha" required size="35"/> 
                                        </td>
                                        <td width="100" height="10">
                                        </td>
                                        <td>
                                            <input type="password" name="confirmarSenha" required size="35"/> 
                                        </td>
                                    </tr>

                                </table>
                                <div id="botao"><br><br>
                                    <input type="hidden" name="acao" value="confirmarDados"/>
                                    <input type="submit" name="cadastrar" value="Cadastrar"/>
                                    <input type="reset" name="cadastrar" value="Limpar"/>
                                </div>
                            </fieldset>
                            <br><br>

                        </form>
                        <hr><br>
                        <h3 id="a2">Exibir usuários</h3>
                        <form name="formulario2" action="GerenciarUsuarios" method="POST">
                            <table>
                                <tr>
                                    <td>Categoria</td>
                                    <td>

                                        <select name="categoriaBusca" id="categoriaBusca">
                                            <option value="0">(Todos)</option>
                                            <option value="1">Alunos</option>
                                            <option value="2">Professores</option>
                                            <option value="3">Técnicos administrativos</option>
                                            <option value="4">Administradores</option>
                                            
                                        </select>

                                    </td>
                                </tr>


                                <tr>
                                    <td width="100">Nome: </td>
                                    <td>
                                        <input type="text" name="nomeBusca" size="40"/>
                                    </td>
                                </tr>

                                <tr>
                                    <td>Matrícula: </td>
                                    <td>
                                        <input type="text" name="matriculaBusca" size="40"/>
                                    </td>
                                </tr>
                            </table>
                            <input type="hidden" name="acao" value="buscar"/>
                            <input type="submit" name="buscar" value="Buscar"/>
                        </form>


                        <br><br>
                        
                        

                        <table border="1" class="CSSTableGenerator">
                            <tr>

                                <td><strong>
                                    Nome
                                    </strong>
                                </td>

                                <td>
                                    <strong>
                                    Matrícula
                                    </strong>
                                </td>
                                <td>
                                    <strong>
                                    Categoria
                                    </strong>
                                </td>
                                <td>
                                    <strong>
                                    CPF
                                    </strong>
                                </td>
                                <td>
                                    <strong>
                                    RG
                                    </strong>
                                </td>
                                <td>
                                    <strong>
                                    Telefone
                                    </strong>
                                </td>
                                <td>
                                    <strong>
                                    E-mail
                                </strong>
                                    </td>
                                <td colspan="2">
                                    <strong>
                                    Ação
                                    </strong>
                                </td>


                            </tr>
                            <c:forEach var="registroUsuarios" items="${sessaoListaPessoas}">
                                <tr>


                                    <td>
                                        ${registroUsuarios['nome']}
                                    </td>
                                    <td>
                                        ${registroUsuarios['matricula']}
                                    </td>
                                    <td>
                                        ${registroUsuarios['categoria']}
                                    </td>
                                    <td>
                                        ${registroUsuarios['cpf']}
                                    </td>
                                    <td>
                                        ${registroUsuarios['rg']}
                                    </td>
                                    <td>
                                        ${registroUsuarios['telefone']}
                                    </td>
                                    <td>
                                        ${registroUsuarios['email']}
                                    </td>
                                    <td>
                                        <a href="alteraUsuario.jsp?idpessoa=${registroUsuarios['idpessoa']}&matricula=${registroUsuarios['matricula']}&nome=${registroUsuarios['nome']}&tipo=${registroUsuarios['tipo']}&cpf=${registroUsuarios['cpf']}&rg=${registroUsuarios['rg']}&telefone=${registroUsuarios['telefone']}&email=${registroUsuarios['email']}"> <img src="imagens/editar.png" width="20" height="20" alt="editar"></a>
                                    </td>
                                    <td>
                                        <a href="GerenciarUsuarios?acao=excluirusuario&matricula=${registroUsuarios['matricula']}"><img src="imagens/delete.png" width="20" height="20" alt="deletar"/></a>
                                    </td>


                                </tr>
                            </c:forEach>
                        </table>

                    </div>

            </section>

        </section>
    </body>
</html>
