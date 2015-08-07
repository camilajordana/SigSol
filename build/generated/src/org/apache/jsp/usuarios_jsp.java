package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.edu.ifrn.jdbc.modelo.Pessoa;
import java.util.ArrayList;
import br.edu.ifrn.jdbc.dao.PessoaDAO;
import java.util.List;

public final class usuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/tags/UsuarioLogado.tag");
    _jspx_dependants.add("/WEB-INF/tags/statusInformarCategoria.tag");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SigSol</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/folha_de_estilo.css\">\n");
      out.write("    </head>\n");
      out.write("    <body id=\"home\" class=\"big\">\n");
      out.write("        <section id=\"section\">\n");
      out.write("            <p id=\"tel\">\n");
      out.write("                ");
      if (_jspx_meth_tagsUsuario_UsuarioLogado_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                <a href=\"Sair\"><img src=\"imagens/partirr.png\" width=\"120\" height=\"40\"  align=\"right\" id=\"sair\"></a>\n");
      out.write("            </p>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <section id=\"wrapper2\">\n");
      out.write("                <div id=\"imagensLogo\" align=\"center\"> <img id=\"logo\" alt=\"Sistema de Gerenciamento de Solicitações\" align=\"center\" src=\"imagens/cccaaaa.png\" width=\"800\" height=\"150\"></div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <div id=\"wrapper\">\n");
      out.write("                <div id=\"navMenu\">\n");
      out.write("\n");
      out.write("                    <ul id=\"c\">\n");
      out.write("                        <li><a href=\"InicioAdm.jsp\"><strong>Início</strong></a>\n");
      out.write("                        <li><a href=\"#\"><strong>Solicitações</strong></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"material_escritorio.jsp\"><strong>Material escritório</strong></a></li>\n");
      out.write("                                <li><a href=\"videoaula.jsp\"><strong>Material videoaula</strong></a></li>\n");
      out.write("                                <li><a href=\"sala.jsp\"><strong>Salas</strong></a></li>\n");
      out.write("                                <li><a href=\"livro.jsp\"><strong>Livros</strong></a></li>\n");
      out.write("                                <li><a href=\"objetos_perdidos.jsp\"><strong>Objetos perdidos</strong></a></li>\n");
      out.write("                                <li><a href=\"limpeza.jsp\"><strong>Limpeza</strong></a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        <li><a href=\"#\"><strong>Cadastrar</strong></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"cadastrarUsuario.jsp\"><strong>Usuário</strong></a></li>\n");
      out.write("                                <li><a href=\"gerenciar_materialEscritorio.jsp\"><strong>Material</strong></a></li>\n");
      out.write("                                <li><a href=\"gerenciar_salas.jsp\"><strong>Sala</strong></a></li>\n");
      out.write("                                <li><a href=\"gerenciar_livros.jsp\"><strong>Livro</strong></a></li>\n");
      out.write("                                <li><a href=\"gerenciarHorarios.jsp\"><strong>Horários</strong></a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"selected\"><a href=\"#\"><strong>Usuários</strong></a></li>\n");
      out.write("                        <li><a href=\"\"><strong>Relatório</strong></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a><strong>Individual</strong></a></li>\n");
      out.write("                                <li><a><strong>Geral</strong></a></li>\n");
      out.write("                                <li><a><strong>Avaliação de serviço</strong></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"AvaliacaoDeServico.jsp\"><strong>Avaliar</strong></a></li>\n");
      out.write("                        <li><a href=\"visualizarHorarios.jsp\"><strong>Horários</strong></a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <section id=\"menu\">\n");
      out.write("                <div id=\"espaco\">\n");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("                    <div id=\"divForm\">\n");
      out.write("                        <form name=\"formulario\" action=\"cadastrarUsuario\" method=\"POST\">\n");
      out.write("\n");
      out.write("                            <h2 id=\"a1\">Usuários</h2>\n");
      out.write("                            <h3 id=\"a2\">Cadastre, visualize, modifique e exclua usuários do SigSol</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <fieldset>\n");
      out.write("\n");
      out.write("                                <legend>Novo usuário</legend>\n");
      out.write("\n");
      out.write("                                <table id=\"tabelaUsuarios\">\n");
      out.write("\n");
      out.write("                                    <tr><td>\n");
      out.write("                                            Categoria:\n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"100\" height=\"10\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <p id=\"aviso\"><strong>");
      if (_jspx_meth_tagsAviso_statusInformarCategoria_0(_jspx_page_context))
        return;
      out.write("</strong></p>\n");
      out.write("\n");
      out.write("                                        </td>\n");
      out.write("                                        <td rowspan=\"10\">\n");
      out.write("                                            <img src=\"imagens/newuser2.png\" width=\"300\" height=\"170\">\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr><td>\n");
      out.write("                                            <select name=\"categoriaUsuario\" id=\"categoriaUsuario\" >\n");
      out.write("                                                <option value=\"0\" selected>(Selecione)</option>\n");
      out.write("                                                <option value=\"1\">Aluno</option>\n");
      out.write("                                                <option value=\"2\">Professor</option>\n");
      out.write("                                                <option value=\"3\">Técnico administrativo</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"100\" height=\"10\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td></td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr><td>\n");
      out.write("                                            Nome: \n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"100\" height=\"10\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            Matrícula:\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr><td>\n");
      out.write("                                            <input type=\"text\" name=\"nome\" required size=\"35\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"100\" height=\"10\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" name=\"matricula\" maxlength=\"14\" required size=\"35\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr><td>\n");
      out.write("                                            CPF:\n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"100\" height=\"10\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            RG:\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr><td>\n");
      out.write("                                            <input type=\"text\" name=\"cpf\" onBlur=\"ValidarCPF(formulario.cpf);\" onKeyPress=\"MascaraCPF(formulario.cpf);\" maxlength=\"14\" required size=\"35\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"100\" height=\"10\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" name=\"rg\" onBlur=\"ValidarRG(formulario.rg);\" onKeyPress=\"MascaraRG(formulario.rg);\" maxlength=\"14\" required size=\"35\">\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr><td>\n");
      out.write("                                            Telefone:\n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"100\" height=\"10\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            E-mail:\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr><td>\n");
      out.write("                                            <input type=\"text\" name=\"telefone\" onKeyPress=\"MascaraTelefone(formulario.telefone);\" maxlength=\"14\"  onBlur=\"ValidaTelefone(formulario.telefone);\" required size=\"35\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"100\" height=\"10\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"email\" name=\"email\" required size=\"35\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr><td>\n");
      out.write("                                            Senha:\n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"100\" height=\"10\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            Confirmar senha:\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr><td>\n");
      out.write("                                            <input type=\"password\" name=\"senha\" required size=\"35\"/> \n");
      out.write("                                        </td>\n");
      out.write("                                        <td width=\"100\" height=\"10\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"password\" name=\"confirmarSenha\" required size=\"35\"/> \n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                                <div id=\"botao\"><br><br>\n");
      out.write("                                    <input type=\"hidden\" name=\"acao\" value=\"confirmarDados\"/>\n");
      out.write("                                    <input type=\"submit\" name=\"cadastrar\" value=\"Cadastrar\"/>\n");
      out.write("                                    <input type=\"reset\" name=\"cadastrar\" value=\"Limpar\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </fieldset>\n");
      out.write("                            <br><br>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                        <hr><br><br>\n");
      out.write("\n");
      out.write("                        <form name=\"formulario2\" action=\"GerenciarUsuarios\" method=\"POST\">\n");
      out.write("                            <table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Categoria</td>\n");
      out.write("                                    <td>\n");
      out.write("\n");
      out.write("                                        <select name=\"categoriaBusca\" id=\"categoriaBusca\">\n");
      out.write("                                            <option value=\"0\">(Todos)</option>\n");
      out.write("                                            <option value=\"1\">Aluno</option>\n");
      out.write("                                            <option value=\"2\">Professor</option>\n");
      out.write("                                            <option value=\"3\">Técnico administrativo</option>\n");
      out.write("                                        </select>\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td width=\"100\">Nome: </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <input type=\"text\" name=\"nomeBusca\" size=\"40\"/>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Matrícula: </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <input type=\"text\" name=\"matriculaBusca\" size=\"40\"/>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                            <input type=\"hidden\" name=\"acaobuscar\" value=\"buscar\"/>\n");
      out.write("                            <input type=\"submit\" name=\"buscar\" value=\"Buscar\"/>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        <table border=\"1\">\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td  width=\"280\">Nome</td>\n");
      out.write("                                <td  width=\"120\">Matrícula</td>\n");
      out.write("                                <td  width=\"100\">Categoria</td>\n");
      out.write("                                <td  width=\"100\">RG</td>\n");
      out.write("                                <td  width=\"120\">CPF</td>\n");
      out.write("                                <td  width=\"110\">Telefone</td>\n");
      out.write("                                <td  width=\"110\">E-mail</td>\n");
      out.write("                                <td colspan=\"2\">Ação</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                PessoaDAO dao = new PessoaDAO();
                                ArrayList<Pessoa> list = dao.getLista();
                                for (Pessoa p : list) {
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( p.getNome());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( p.getMatricula());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( p.getCategoria());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( p.getRg());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( p.getCpf());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( p.getTelefone());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( p.getEmail());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( p.getNome());
      out.write("</td>\n");
      out.write("                                <td><a href=\"#\">Editar</a></td>\n");
      out.write("                                <td><a href=\"#\">Excluir</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tagsUsuario_UsuarioLogado_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tagsUsuario:UsuarioLogado
    org.apache.jsp.tag.web.UsuarioLogado_tag _jspx_th_tagsUsuario_UsuarioLogado_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.UsuarioLogado_tag.class) : new org.apache.jsp.tag.web.UsuarioLogado_tag();
    _jspx_th_tagsUsuario_UsuarioLogado_0.setJspContext(_jspx_page_context);
    _jspx_th_tagsUsuario_UsuarioLogado_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tagsAviso_statusInformarCategoria_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tagsAviso:statusInformarCategoria
    org.apache.jsp.tag.web.statusInformarCategoria_tag _jspx_th_tagsAviso_statusInformarCategoria_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.statusInformarCategoria_tag.class) : new org.apache.jsp.tag.web.statusInformarCategoria_tag();
    _jspx_th_tagsAviso_statusInformarCategoria_0.setJspContext(_jspx_page_context);
    _jspx_th_tagsAviso_statusInformarCategoria_0.doTag();
    return false;
  }
}
